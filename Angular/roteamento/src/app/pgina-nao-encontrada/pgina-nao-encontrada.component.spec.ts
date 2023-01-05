import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PginaNaoEncontradaComponent } from './pgina-nao-encontrada.component';

describe('PginaNaoEncontradaComponent', () => {
  let component: PginaNaoEncontradaComponent;
  let fixture: ComponentFixture<PginaNaoEncontradaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PginaNaoEncontradaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PginaNaoEncontradaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
