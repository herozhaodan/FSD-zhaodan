import { Component, OnInit } from '@angular/core';
import { CompanyService, CompanyImpl } from '../service/company.service';

@Component({
  selector: 'app-add-company',
  templateUrl: './add-company.component.html',
  styleUrls: ['./add-company.component.css']
})
export class AddCompanyComponent implements OnInit {

  company: CompanyImpl = new CompanyImpl(
    "",0,"","",""
  );

  constructor(private companyService: CompanyService) {  }

  createCompany(): void {
    console.log(this.company);
    this.companyService.createCompany(this.company)
        .subscribe( data => {
          alert("Company created successfully.");
        });

  };

  ngOnInit() {
  }

}
