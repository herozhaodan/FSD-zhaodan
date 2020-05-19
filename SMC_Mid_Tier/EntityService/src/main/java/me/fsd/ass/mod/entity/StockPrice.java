package me.fsd.ass.mod.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stock_price")
public class StockPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_code")
    private String companyCode;

    @Column(name = "stock_exchange")
    private String stockExchange;

    @Column(name = "price_per_share")
    private Double pricePerShare;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date")
    private Date date;

    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "time")
    private String time;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public Double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(Double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }



}
