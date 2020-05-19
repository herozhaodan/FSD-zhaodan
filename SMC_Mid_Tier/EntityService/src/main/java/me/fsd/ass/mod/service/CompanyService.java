package me.fsd.ass.mod.service;

import me.fsd.ass.mod.dao.CompanyRepository;
import me.fsd.ass.mod.entity.Company;
import me.fsd.ass.mod.model.CompanyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Company add(CompanyInfo com){
        Company newCom = new Company();
        newCom.setName(com.getName());
        newCom.setCeo(com.getCeo());
        newCom.setCode(com.getCode());
        newCom.setTurnover(com.getTurnOver());
        Company rlt = companyRepository.save(newCom);
        return rlt;
    }

    public List<CompanyInfo> getCompanies(){

        List<Company> liCom = companyRepository.findAll();
        List<CompanyInfo> rlt = new ArrayList<CompanyInfo>();
        // convert to model ComapnyInfo
        for (Company com: liCom
             ) {
            CompanyInfo newCompany = new CompanyInfo();
            newCompany.setName(com.getName());
            newCompany.setTurnOver(com.getTurnover());
            newCompany.setBoardOfDirectors(com.getBoardOfDirectors());
            //nc.setBriefWriteup(com.getb);
            newCompany.setCeo(com.getCeo());
            //nc.set
            rlt.add(newCompany);
        }
        return rlt;
    }

}
