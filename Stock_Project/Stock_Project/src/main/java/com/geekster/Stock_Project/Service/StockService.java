package com.geekster.Stock_Project.Service;

import com.geekster.Stock_Project.model.Stock;
import com.geekster.Stock_Project.model.StockType;
import com.geekster.Stock_Project.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    StockRepo stockRepo;

    public List<Stock> getAll() {
        return (List<Stock>)stockRepo.findAll();
    }

    public String addStocks(List<Stock> stocks) {
        stockRepo.saveAll(stocks);
        return "Stocks Added!!!";
    }

    public String deleteStock(Long id) {
        stockRepo.deleteById(id);
        return "StockId"+ id+"Deleted";
    }

    public List<Stock> StockByType(StockType stockType) {
        return stockRepo.findByStockTypeOrderByStockPriceDesc(stockType);
    }

    public List<Stock> StockBirthDay() {
        return stockRepo.getByDateTime();
    }
}
