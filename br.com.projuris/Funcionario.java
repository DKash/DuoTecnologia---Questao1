package br.com.projuris;

import java.math.BigDecimal;

public class Funcionario {
  private String departamento;
  private BigDecimal salario;
  private String cargo;

  public Funcionario(String cargo, String departamento, BigDecimal salario){
    this.cargo = cargo;
    this.departamento = departamento;
    this.salario = salario;
  }

  public void setDepartamento(String departamento){
    this.departamento = departamento;
  }

  public String getDepartamento(){
    return this.departamento;
  }

  public void setSalario(BigDecimal salario){
    this.salario = salario;
  }

  public BigDecimal getSalario(){
    return this.salario;
  }

  public void setCargo(String cargo){
    this.cargo = cargo;
  }

  public String getCargo(){
    return this.cargo;
  }
}