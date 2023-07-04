package com.geekster.Stock_Project.repository;

import com.geekster.Stock_Project.model.Stock;
import com.geekster.Stock_Project.model.StockType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepo extends CrudRepository<Stock,Long> {
    List<Stock> findByStockTypeOrderByStockPriceDesc(StockType stockType);

    @Query(value = "select * from Stock OrderBy Stock_LocalDateTime Desc",nativeQuery = true)
    List<Stock> getByDateTime();
}
