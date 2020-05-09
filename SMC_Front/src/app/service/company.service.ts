import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Company } from '../interface';

export class CompanyImpl implements Company{

  boardOfDirectors: string;
  listed: boolean;
  briefWriteup: string;
  stockCodes: string[];
   id: number;

  constructor(
    public code: string,
    public turnOver: number,
    public name:string,
    public ceo: string,
    public sector: string,
  ) {}
}


@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  constructor(private http: HttpClient) {}

  getCompany(){
    try{
      return this.http.get<Company[]>(environment.apiUrl + '/entity-info/company');
    }catch(error){
      throw error;
    }
  }

  public deleteCompany(company) {
    return this.http.delete<Company>(environment.apiUrl + "/entity-info/company" + "/"+ company.id);
  }

  public createCompany(company) {
    console.log(company);
    return this.http.post<Company>(environment.apiUrl + "/entity-info/company", company);
  }
}
