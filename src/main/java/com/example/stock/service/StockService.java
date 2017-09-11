package com.example.stock.service;

import com.example.stock.base.BaseErrorInterfaceInfo;
import com.example.stock.base.BaseRspEntity;
import com.example.stock.entity.StockEntity;
import com.example.stock.utils.OkHttpUtil;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * https://market.aliyun.com/products/57000002/cmapi010845.html#sku=yuncode484500000
 */
@Service
public class StockService {
    private String url = "http://stock.market.alicloudapi.com/batch-real-stockinfo";

    private String appCode = "75391fd9f8fa4b49a2c812c169afd17c";

    public Object start(String needIndex, String stocks) {
        Map<String, String> headers = new HashMap<>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appCode);
        Map<String, String> querys = new HashMap<>();
        querys.put("needIndex", needIndex);
        querys.put("stocks", stocks);

        try {
            return new Gson().fromJson(new OkHttpUtil().run(createUrlFromParams(url, querys), appCode), StockEntity.class);
        } catch (Exception e) {
            return new BaseRspEntity(BaseErrorInterfaceInfo.SERVER_ERROR);
        }
    }

    public static String createUrlFromParams(String url, Map<String, String> params) {
        if (params != null && params.size() > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(url);
                if (url.indexOf('&') > 0 || url.indexOf('?') > 0) {
                    sb.append("&");
                } else {
                    sb.append("?");
                }
                for (Map.Entry<String, String> urlParams : params.entrySet()) {
                    //对参数进行 utf-8 编码,防止头信息传中文
                    String urlValue = URLEncoder.encode(urlParams.getValue(), "UTF-8");
                    sb.append(urlParams.getKey()).append("=").append(urlValue).append("&");
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            } catch (UnsupportedEncodingException e) {
                new BaseRspEntity(BaseErrorInterfaceInfo.BAD_REQUEST);
            }
        }
        return url;
    }
}
