import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent {
  public usernm: string;
  public password: string;
  public error: string;

  constructor(private auth: AuthService, private router: Router) { }

  public submit() {
    this.auth.login(this.usernm, this.password)
      .pipe(first())
      .subscribe(
        result => this.router.navigate(['landing_page']),
        err => this.error = 'Could not authenticate'
      );
  }
}