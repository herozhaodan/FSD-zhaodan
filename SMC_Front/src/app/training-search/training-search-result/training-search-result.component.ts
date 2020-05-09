import { Component, OnInit, Input } from '@angular/core';
import { isNgTemplate } from '@angular/compiler';
import { Training } from 'src/app/interface';
import { SearchTrainingService } from '../providers/search-training.service';

@Component({
  selector: 'app-training-search-result',
  templateUrl: './training-search-result.component.html',
  styleUrls: ['./training-search-result.component.css']
})
export class TrainingSearchResultComponent implements OnInit {

  trainings: Training[];

  constructor(private searchTrainingService: SearchTrainingService) { }

  ngOnInit() {
    this.trainings = this.searchTrainingService.getTrainings();
  }

}
