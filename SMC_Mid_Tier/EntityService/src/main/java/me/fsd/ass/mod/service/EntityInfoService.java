package me.fsd.ass.mod.service;

import me.fsd.ass.mod.dao.StockPriceRepository;
import me.fsd.ass.mod.entity.StockPrice;
import me.fsd.ass.mod.model.ChartColumn;
import me.fsd.ass.mod.model.CompareCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EntityInfoService {

    @Autowired
    private StockPriceRepository stockPriceRepository;


    public List<StockPrice> getAllSkills() {

        List<StockPrice> li = stockPriceRepository.findAll();
        return li;
    }


    public void add(List<StockPrice> liPrice){
            stockPriceRepository.saveAll(liPrice);

    }


    public List<ChartColumn> getCompareCompany(){
        List<ChartColumn> rlt = new ArrayList<ChartColumn>();
        List<StockPrice> li = stockPriceRepository.findAll();
        for (StockPrice sp : li
             ) {
            ChartColumn cc = new ChartColumn();
            String strTime = sp.getTime();
            if(strTime != null) {
                cc.setLabel(strTime.trim());
                cc.setValue(String.valueOf(sp.getPricePerShare()));
            }
            rlt.add(cc);
        }
        return rlt;
    }

}
