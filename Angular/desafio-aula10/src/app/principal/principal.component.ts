import { Component } from '@angular/core';

type aluno = {
  identificador: number;
  nome: string;
  nota1: number;
  nota2: number;
  media: number;
  condicao: string;
}

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})


export class PrincipalComponent {
  identificador = 3
  nome = "";
  nota1!: number;
  nota2!: number;
  media = 0;
  condicao = "";

  notasAlunos: aluno[] = [];

  adicionarAluno(){
    this.identificador += 1;
    this.media = (Number(this.nota1) + Number(this.nota2)) / 2;
    this.condicao = this.media >= 7 ? "Aprovado" : "Reprovado";

    this.notasAlunos.push(
      {
        identificador: this.identificador,
        nome: this.nome,
        nota1: this.nota1,
        nota2: this.nota2,
        media: this.media,
        condicao: this.condicao
      }
    );

    this.nome = "";
    this.nota1 = 0;
    this.nota2 = 0;

    console.log(this.notasAlunos);
  }

  removerAluno(idAluno: number){
    this.notasAlunos = this.notasAlunos.filter(elemento => elemento.identificador != idAluno);
  }

  editarAluno(idAluno: number, nomeAluno: string, nota1Aluno: number, nota2Aluno: number) {
    this.nome = nomeAluno;
    this.nota1 = nota1Aluno;
    this.nota2 = nota2Aluno;

    this.removerAluno(idAluno);
  }
}
