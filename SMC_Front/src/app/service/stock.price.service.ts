import {Injectable} from '@angular/core';
import {HttpClient, HttpRequest, HttpEvent} from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({ providedIn: 'root' })
export class StockPriceService {

  constructor(private http: HttpClient) {}

    getC(ptime: string): Promise<JSON>{
      try{
        return this.http.get<JSON>(environment.apiUrl + '/entity-info/compare_company').toPromise();
      }catch(error){
        throw error;
      }
    }

    getCompareCompany(ptime : String): Observable<HttpEvent<any>>{
      console.log(environment.apiUrl + '/entity-info/compare_company');
      const req = new HttpRequest('GET', environment.apiUrl + '/entity-info/compare_company', {
            reportProgress: true, 
            responseType: 'text'
      });
      return this.http.request(req);
      //return this.http.get(environment.apiUrl + '/entity-info/compare_company');
    }
   
}