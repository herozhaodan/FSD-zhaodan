import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule,HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LandingPageAdminModule } from './landing-page-admin/landing-page-admin.module';

import { JwtModule } from '@auth0/angular-jwt';
import { LoginComponent } from './login/login.component';

import { AuthService } from './auth.service';
import { AuthGuard } from './auth.guard';
import { AuthInterceptor } from './service/AuthInterceptor.service';
import { Chart1Component } from './landing-page/chart1/chart1.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { LandingPageModule } from './landing-page/landing-page.module';


// Import angular-fusioncharts
import { FusionChartsModule } from "angular-fusioncharts";

// Import FusionCharts library and chart modules
import * as FusionCharts from "fusioncharts";
import * as Charts from "fusioncharts/fusioncharts.charts";

import * as FusionTheme from "fusioncharts/themes/fusioncharts.theme.fusion";
import { AddCompanyComponent } from './add-company/add-company.component';

// Pass the fusioncharts library and chart modules
FusionChartsModule.fcRoot(FusionCharts, Charts, FusionTheme);

// ...
export function tokenGetter() {
  return localStorage.getItem('access_token');
}

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    Chart1Component,
    AddCompanyComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    LandingPageModule,
    LandingPageAdminModule,
    HttpClientModule,
    FormsModule,
    FusionChartsModule
    // Add this import here
    // JwtModule.forRoot({
    //   config: {
    //     tokenGetter: tokenGetter,
    //     whitelistedDomains: ['localhost','127.0.0.1'],
    //     blacklistedRoutes: ['localhost:9000/login']
    //   }
    // })
  ],
  providers: [
    AuthService,
    AuthGuard,
    { provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true }
  ],
  bootstrap: [AppComponent]
})

export class AppModule { }
