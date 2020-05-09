import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TrainingSearchComponent } from './training-search.component';
import { TrainingSearchFormComponent } from './training-search-form/training-search-form.component';
import { TrainingSearchResultComponent } from './training-search-result/training-search-result.component';
import { SearchTrainingService } from './providers/search-training.service';


@NgModule({
  declarations: [ TrainingSearchComponent, TrainingSearchFormComponent, TrainingSearchResultComponent,],
  imports: [
    CommonModule
  ],
  providers: [SearchTrainingService],
  exports:[
    TrainingSearchComponent
  ]
})
export class TrainingSearchModule { }
