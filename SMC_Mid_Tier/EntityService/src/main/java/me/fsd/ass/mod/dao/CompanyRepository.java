package me.fsd.ass.mod.dao;

import me.fsd.ass.mod.entity.Company;
import me.fsd.ass.mod.entity.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
