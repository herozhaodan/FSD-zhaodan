package me.fsd.ass.mod.entity;

import javax.persistence.*;

@Entity
@Table(name = "stock_exchange")
public class StockExchange {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String stockExchange;
    @Column
    private String brief;
    @Column
    private String contactAddress;
    @Column
    private String remarks;
}
