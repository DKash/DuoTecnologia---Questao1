package br.com.projuris;

import java.math.BigDecimal;

public class CustoCargo{
  private String cargo;
  private BigDecimal custo;

  public void setCargo(String cargo){
    this.cargo = cargo;
  }

  public String getCargo(){
    return this.cargo;
  }

  public void setCusto(BigDecimal custo){
    this.custo = custo;
  }

  public BigDecimal getCusto(){
    return this.custo;
  }
}