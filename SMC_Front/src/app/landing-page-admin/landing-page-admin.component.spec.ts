import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LandingPageAdminComponent } from './landing-page-admin.component';

describe('LandingPageComponent', () => {
  let component: LandingPageAdminComponent;
  let fixture: ComponentFixture<LandingPageAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LandingPageAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LandingPageAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
