package com.example.stock.service;

import com.example.stock.base.BaseErrorInterfaceInfo;
import com.example.stock.base.BaseRspEntity;
import com.example.stock.entity.NtStockEntity;
import com.example.stock.utils.OkHttpUtil;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.example.stock.service.StockService.createUrlFromParams;

/**
 * 参考  https://www.juhe.cn/docs/api/id/185
 */
@Service
public class NtStockService {
    private String url = "http://touchstone.api.juhe.cn/ajax/data/realtime";
    private String appKey = "d84c6d7ca4264f62bb417cbfd19a78ca";

    public Object start(String stock) {
        Map<String, String> param = new HashMap<>();
        param.put("pageIndex", "1");
        param.put("id", stock);
        param.put("key", appKey);

        try {
            return new Gson().fromJson(new OkHttpUtil().run(createUrlFromParams(url, param)), NtStockEntity.class);
        } catch (Exception e) {
            return new BaseRspEntity(BaseErrorInterfaceInfo.SERVER_ERROR);
        }
    }
}
