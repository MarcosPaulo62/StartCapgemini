import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Curso } from './curso';
import { CursoService } from './curso.service';

@Component({
  selector: 'app-curso',
  templateUrl: './curso.component.html',
  styleUrls: ['./curso.component.css']
})
export class CursoComponent {

  //URL base
  url = "http://localhost/api/php/";

  //Vetor de cursos
  vetor: Curso[] = [];

  //Objeto da classe Curso
  curso = new Curso();

  //Construtor
  constructor(private curso_servico: CursoService) { }

  //Inicializador
  ngOnInit() {
    //Ao iniciar o sistema, deverá listar os cursos
    this.selecao();
  }

  //Cadastro
  cadastro(){
    this.curso_servico.cadastrarCurso(this.curso).subscribe(
      (res: Curso[]) => {
        //Adicionando dados ao vetor
        this.vetor = res;

        //Limpando os atributos
        this.curso.nomeCurso = undefined;
        this.curso.valorCurso = undefined;

        //Atualizar a listagem
        this.selecao();
      }
    )
  }

  //Seleção
  selecao():void {
    this.curso_servico.obterCursos().subscribe(
      (res: Curso[]) => {
        this.vetor = res;
      }
    )
  }

  // //Alterar
  // alterar(){
  //   this.curso_servico.atualizarCurso(this.curso).subscribe(
  //     (res) => {

  //       //Atualizar o vetor
  //       this.vetor = res

  //       //Limpar os valores do objeto
  //       this.curso.nomeCurso = undefined;
  //       this.curso.valorCurso = undefined;

  //       //Atualiza a listagem
  //       this.selecao()
  //     }
  //   )
  // }

  // //Remover
  // remover() {
  //   this.curso_servico.removerCurso(this.curso).subscribe(
  //     (res: Curso[]) => {
  //       this.vetor = res;

  //       this.curso.nomeCurso = undefined;
  //       this.curso.valorCurso = undefined;
  //     }
  //   )
  // }

  // //Selecionar curso específico
  // selecionarCurso(c: Curso) {
  //   this.curso.idCurso = c.idCurso;
  //   this.curso.nomeCurso = c.nomeCurso;
  //   this.curso.valorCurso = c.valorCurso;


  // }

}
