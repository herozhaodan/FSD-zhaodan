import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from '../app-routing.module';
import { LandingPageComponent } from './landing-page.component';
import { Chart1Component } from './chart1/chart1.component';



@NgModule({
  declarations: [LandingPageComponent],
  imports: [
    CommonModule,AppRoutingModule
  ],
  exports:[
    LandingPageComponent
  ]
})
export class LandingPageModule { }
