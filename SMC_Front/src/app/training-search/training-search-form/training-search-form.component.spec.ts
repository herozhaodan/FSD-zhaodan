import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingSearchFormComponent } from './training-search-form.component';

describe('TrainingSearchFormComponent', () => {
  let component: TrainingSearchFormComponent;
  let fixture: ComponentFixture<TrainingSearchFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingSearchFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingSearchFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
