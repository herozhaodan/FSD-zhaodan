package me.fsd.ass.mod.entity;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", nullable = false)
    private String  code;

    @Column(name = "name", nullable = false)
    private String  name;

    @Column(name = "turnover")
    private Double turnover;

    @Column(name = "ceo")
    private String ceo;

    @Column
    private String boardOfDirectors;
    @Column
    private String listedInStockExchanges;
    @Column
    private String sector;
    @Column
    private String writeup;

    @OneToMany(targetEntity = ExchangeCode.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private Set<ExchangeCode> stockCodes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getBoardOfDirectors() {
        return boardOfDirectors;
    }

    public void setBoardOfDirectors(String boardOfDirectors) {
        this.boardOfDirectors = boardOfDirectors;
    }

    public String getListedInStockExchanges() {
        return listedInStockExchanges;
    }

    public void setListedInStockExchanges(String listedInStockExchanges) {
        this.listedInStockExchanges = listedInStockExchanges;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getWriteup() {
        return writeup;
    }

    public void setWriteup(String writeup) {
        this.writeup = writeup;
    }

    public Set<ExchangeCode> getStockCodes() {
        return stockCodes;
    }

    public void setStockCodes(Set<ExchangeCode> stockCodes) {
        this.stockCodes = stockCodes;
    }
}
