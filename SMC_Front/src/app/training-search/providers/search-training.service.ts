import { Injectable } from '@angular/core';
import { Training } from 'src/app/interface';
import { getTestTrainings } from 'src/app/test/test-trainings';


@Injectable({
  providedIn: 'root'
})
export class SearchTrainingService {
  private data: Training[] = getTestTrainings();

  constructor() { }

  getTrainings(): Training[]{
    return this.data;
  }

  searchTrainings(tech: string): Training[]{
    var rlt = this.data;
    if(tech !== ''){
       rlt = this.data.filter(item => item.specificTech === tech);
    }
    return rlt;
  }
}
