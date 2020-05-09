import {Injectable} from '@angular/core';
import {HttpClient, HttpRequest, HttpEvent, HttpInterceptor, HttpHandler, HttpErrorResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import { map, catchError } from 'rxjs/operators';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

    intercept(req: HttpRequest<any>,
              next: HttpHandler): Observable<HttpEvent<any>> {

        const token = localStorage.getItem("access_token");
console.log(token);
        if (token) {
            const cloned = req.clone({
                headers: req.headers.set("Authorization",
                    "Bearer " + token)
            });
           
            return next.handle(cloned);
        }
        else {
            return next.handle(req);
        }


    }
}