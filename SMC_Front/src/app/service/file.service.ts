import {Injectable} from '@angular/core';
import {HttpClient, HttpRequest, HttpEvent} from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({ providedIn: 'root' })
export class FileService {

  constructor(private http: HttpClient) {}

  uploadFile(file: File): Observable<HttpEvent<{}>> {
    
		const formdata: FormData = new FormData();
		formdata.append('file', file);
		const req = new HttpRequest('POST', environment.apiUrl + '/entity-info/upload', formdata, {
			  reportProgress: true, 
			  responseType: 'text'
		});
      
    return this.http.request(req);
  }
   
}