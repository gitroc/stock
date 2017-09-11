package com.example.stock.controller;

import com.example.stock.base.BaseRspEntity;
import com.example.stock.service.NtStockService;
import com.example.stock.service.StockService;
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

    @RequestMapping("/stock")
    public Object getStockInfo() {
        return new BaseRspEntity(stockService.getStockList());
    }

    @RequestMapping("/ntstock")
    public Object getNtStockInfo() {
        return new BaseRspEntity(ntStockService.getNtStockList());
    }
}
