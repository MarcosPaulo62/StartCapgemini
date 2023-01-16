import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TesteBoostrapComponent } from './teste-boostrap.component';

describe('TesteBoostrapComponent', () => {
  let component: TesteBoostrapComponent;
  let fixture: ComponentFixture<TesteBoostrapComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TesteBoostrapComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TesteBoostrapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
