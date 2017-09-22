package com.example.stock.controller;

import com.example.stock.base.BaseRspEntity;
import com.example.stock.service.NtStockService;
import com.example.stock.service.StockService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StockController {
    @Autowired
    private StockService stockService;

    @Autowired
    private NtStockService ntStockService;

    @ApiOperation(value = "张家港A股19家上市企业", notes = "张家港A股19家上市企业股票信息列表")
    @RequestMapping("/stock")
    public Object getStockInfo() {
        return new BaseRspEntity(stockService.getStockList());
    }

    @ApiOperation(value = "张家港新三板挂牌企业", notes = "张家港新三板挂牌企业股票信息列表")
    @RequestMapping("/ntstock")
    public Object getNtStockInfo() {
        return new BaseRspEntity(ntStockService.getNtStockList());
    }
}
