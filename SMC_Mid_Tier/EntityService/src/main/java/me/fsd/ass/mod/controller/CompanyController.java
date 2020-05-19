package me.fsd.ass.mod.controller;

import me.fsd.ass.mod.entity.Company;
import me.fsd.ass.mod.model.CompanyInfo;
import me.fsd.ass.mod.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping({ "/company" })
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping(produces = "application/json")
    public List<CompanyInfo> firstPage() {

        return companyService.getCompanies();
    }

    @DeleteMapping(path = { "/{id}" })
    public CompanyInfo delete(@PathVariable("id") int id) {
        CompanyInfo deletedEmp = null;

        return deletedEmp;
    }

    @PostMapping
    public CompanyInfo create(@RequestBody CompanyInfo com) {
        Company comRlt = companyService.add(com);

        return com;
    }

}
