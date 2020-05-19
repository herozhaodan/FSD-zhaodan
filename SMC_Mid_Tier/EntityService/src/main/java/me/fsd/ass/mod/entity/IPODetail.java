package me.fsd.ass.mod.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ipo_detail")
public class IPODetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String CompanyName;
    @Column
    private String  stockExchange;
    @Column
    private float pricePerShare;
    @Column
    private Long totalNumberOfShares;
    @Column
    private Date openDateTime;
    @Column
    private String  Remarks;

}
