import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LandingPageAdminComponent } from './landing-page-admin.component'
import { from } from 'rxjs';
import { AppRoutingModule } from '../app-routing.module';
import { LayoutModule } from '../layout/layout.module';
import { TrainingSearchModule } from '../training-search/training-search.module';
import { ImportDataComponent } from './import-data/import-data.component';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { JwtModule } from '@auth0/angular-jwt';


@NgModule({
  declarations: [LandingPageAdminComponent, ImportDataComponent],
  imports: [
    CommonModule,AppRoutingModule,
    BrowserModule,
    HttpClientModule
  ],
  exports:[
    LandingPageAdminComponent
  ]
})
export class LandingPageAdminModule { 
  
}
