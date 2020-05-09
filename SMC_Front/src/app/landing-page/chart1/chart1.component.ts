import { Component, OnInit } from '@angular/core';
import { StockPriceService } from 'src/app/service/stock.price.service';
import { CompanyService } from 'src/app/service/company.service';
import { Company } from 'src/app/interface';

@Component({
  selector: 'app-chart1',
  templateUrl: './chart1.component.html',
  styleUrls: ['./chart1.component.css']
})
export class Chart1Component implements OnInit {

  companies: Company[];

  type = 'Column2D';
  width = '600';
  height = '300';
  dataFormat = 'json';
  dataSource: any = {
      "chart": {
        "caption": "Compare Company",
        "subCaption": "ESB",
        "xAxisName": "Time",
        "yAxisName": "Price per share",
        "numberSuffix": "$",
        "theme": "fusion",
        "updateAnimDuration":"0.4"
      },
      "data": [{
        "label": "Venezuela",
        "value": 290
      },{
        "label": "China",
        "value": 30
      }]
  };

  constructor(
     private stockPriceService: StockPriceService,
     private companyService: CompanyService
    ) {

  } // end of constructor

  public loadData() {
    console.log(this.stockPriceService.getC("test"));
    this.stockPriceService.getC("test").then(rlt => this.dataSource.data = rlt );
  }

  public getCompany(){
    this.companyService.getCompany();
  }

  ngOnInit() {
    //company 
    this.companyService.getCompany().subscribe(
      response =>{this.companies = response;}
     );

    this.loadData();
  }
} // end of class AppComponent