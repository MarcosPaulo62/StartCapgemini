import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent {
  nome = "Marcos";
  dataNascimento = "2003-08-27";
  urlImagem = "assets/angular.png";
  
  mostrarDataNascimento() {
    alert(`A data de nascimento de Marcos é: ${this.dataNascimento}`)
  }
}
