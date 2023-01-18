<?php

//Variáveis
$url = "localhost"; // url do BD
$usuario = "root";
$senha = ""; 
$base = "api"; // nome da base de dados no BD

//Conexão
$conexao = mysqli_connect($url, $usuario, $senha, $base);

//Arrumar caracteres especiais
mysqli_set_charset($conexao, "utf8");

?>