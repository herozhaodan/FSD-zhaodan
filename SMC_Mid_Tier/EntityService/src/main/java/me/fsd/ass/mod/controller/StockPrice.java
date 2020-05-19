package me.fsd.ass.mod.controller;

import com.netflix.discovery.converters.Auto;
import me.fsd.ass.mod.model.ChartColumn;
import me.fsd.ass.mod.model.CompareCompany;
import me.fsd.ass.mod.service.EntityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StockPrice {

    @Autowired
    EntityInfoService entityInfoService;

    @GetMapping("/compare_company")
    public List<ChartColumn> getCompareCompany(){
       return   entityInfoService.getCompareCompany();
    }
}
