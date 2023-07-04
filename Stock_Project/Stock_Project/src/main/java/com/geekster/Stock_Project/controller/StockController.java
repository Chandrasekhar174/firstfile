package com.geekster.Stock_Project.controller;

import com.geekster.Stock_Project.Service.StockService;
import com.geekster.Stock_Project.model.Stock;
import com.geekster.Stock_Project.model.StockType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("Stocks")
    public List<Stock> getAllStocks()
    {
        return stockService.getAll();
    }
    @PostMapping("AddStocks")
    public String AddStocks(@RequestBody List<Stock> stocks)
    {
        return stockService.addStocks(stocks);
    }
    @DeleteMapping("Stock/{id}")
    public String DeleteStock(@PathVariable Long id)
    {
        return stockService.deleteStock(id);
    }
    @GetMapping("StockBy/{type}")
    public List<Stock> getStockByType(@RequestParam StockType stockType)
    {
        return stockService.StockByType(stockType);
    }
    @GetMapping("StockTimeStamp")
    public List<Stock> getStockByTimeStamp()
    {
        return stockService.StockBirthDay();
    }
}
