package com.geekster.Stock_Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;
    @Column(unique = true)
    private String stockName;
    private Double stockPrice;
    private Integer StockOwnerCount;
    @Enumerated(value = EnumType.STRING)
    private StockType stockType;
    private LocalDateTime localDateTime;
}
