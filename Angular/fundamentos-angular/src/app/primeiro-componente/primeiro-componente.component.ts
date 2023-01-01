import { Component } from "@angular/core";

@Component({
    selector: "app-primeiro-componente", // como o componente será referido
    template: "<h2>Primeiro Componente</h2>", // código html ou ref de arquivo html
    styles: ["h2 { color: red; }"] 
})

export class PrimeiroComponenteComponent {}