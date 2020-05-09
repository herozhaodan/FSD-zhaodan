import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingSearchResultComponent } from './training-search-result.component';

describe('TrainingSearchResultComponent', () => {
  let component: TrainingSearchResultComponent;
  let fixture: ComponentFixture<TrainingSearchResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingSearchResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingSearchResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
