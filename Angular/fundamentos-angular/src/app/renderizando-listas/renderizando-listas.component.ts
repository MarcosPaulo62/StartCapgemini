import { Component } from '@angular/core';
import { Celular } from '../types/celulares';

@Component({
  selector: 'app-renderizando-listas',
  templateUrl: './renderizando-listas.component.html',
  styleUrls: ['./renderizando-listas.component.css']
})
export class RenderizandoListasComponent {
  celulares: Celular[] = [
    {id: 1, nome: "Celular X", descricao: "Celular médio", esgotado: false},
    {id: 2, nome: "Celular Y", esgotado: true},
    {id: 3, nome: "Celular Z", descricao: "Celular pequeno", esgotado: false}
  ]
}
