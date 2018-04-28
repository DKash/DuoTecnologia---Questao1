package br.com.projuris;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Teste{
	public static void main (String[] args){

	//Cria os Objetos Funcionários
	Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
    Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
    Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
    Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
    Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
    Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
    Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
    Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
    Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
    Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));

    List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    //Adiciona os objetos funcionários criados acima na lista
    listaFuncionarios.add(funcionario1);
    listaFuncionarios.add(funcionario2);
    listaFuncionarios.add(funcionario3);
    listaFuncionarios.add(funcionario4);
    listaFuncionarios.add(funcionario5);
    listaFuncionarios.add(funcionario6);
    listaFuncionarios.add(funcionario7);
    listaFuncionarios.add(funcionario8);
    listaFuncionarios.add(funcionario9);
    listaFuncionarios.add(funcionario10);

    MyCalculo calculo = new MyCalculo();

    //Realiza o cálculo dos custos por Cargo
    List<CustoCargo> custoGeradoCargo = calculo.custoPorCargo(listaFuncionarios);

    int contadorCargo = 0;
    System.out.println("Valor total por Cargo:\n");
    while(contadorCargo < custoGeradoCargo.size()){
      System.out.println(custoGeradoCargo.get(contadorCargo).getCargo() + " => R$ " + 
                         custoGeradoCargo.get(contadorCargo).getCusto());
      contadorCargo++;
    }
    
    //Realiza o cálculo dos custos por Departamento
    List<CustoDepartamento> custoGeradoDepartamento = calculo.custoPorDepartamento(listaFuncionarios);

    int contadorDepartamento = 0;
    System.out.println("\n\nValor total por Departamento:\n");
    while(contadorDepartamento < custoGeradoDepartamento.size()){
      System.out.println(custoGeradoDepartamento.get(contadorDepartamento).getDepartamento() + " => R$ " + 
                         custoGeradoDepartamento.get(contadorDepartamento).getCusto());
      contadorDepartamento++;
    }
  }
}