import { Component, OnInit } from '@angular/core';
import { SearchTrainingService } from '../providers/search-training.service'
import { Training } from 'src/app/interface';

@Component({
  selector: 'app-training-search-form',
  templateUrl: './training-search-form.component.html',
  styleUrls: ['./training-search-form.component.css']
})
export class TrainingSearchFormComponent implements OnInit {
  trainings: Training[];

  constructor(private searchTrainingService: SearchTrainingService) { }

  ngOnInit() {
    this.trainings = this.searchTrainingService.getTrainings();
  }

  searchTraining(tech: string){
    console.log(tech);
    this.trainings = this.searchTrainingService.searchTrainings(tech);
  }

}
