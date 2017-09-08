package com.example.stock.controller;

import com.example.stock.base.BaseRspEntity;
import com.example.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    @RequestMapping("/api/stock")
    public Object getStockInfo(@RequestParam ("needIndex") String needIndex, @RequestParam("stocks") String stocks) {
        return new BaseRspEntity(stockService.start(needIndex, stocks));
    }
}
