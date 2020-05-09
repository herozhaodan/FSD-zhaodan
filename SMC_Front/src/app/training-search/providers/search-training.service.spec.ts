import { TestBed } from '@angular/core/testing';

import { SearchTrainingService } from './search-training.service';

describe('SearchTrainingService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SearchTrainingService = TestBed.get(SearchTrainingService);
    expect(service).toBeTruthy();
  });
});
