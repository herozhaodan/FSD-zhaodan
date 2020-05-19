package me.fsd.ass.mod.entity;

import javax.persistence.*;

@Entity
@Table(name = "exchange_code")
public class ExchangeCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id")
    private Long companyId;

    @Column
    private String companyCode;
    @Column
    private Long exchangeId;

}
