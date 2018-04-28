package br.com.projuris;

import java.math.BigDecimal;

public class CustoDepartamento{
  private String departamento;
  private BigDecimal custo;

  public void setDepartamento(String departamento){
    this.departamento = departamento;
  }

  public String getDepartamento(){
    return this.departamento;
  }

  public void setCusto(BigDecimal custo){
    this.custo = custo;
  }

  public BigDecimal getCusto(){
    return this.custo;
  }
}