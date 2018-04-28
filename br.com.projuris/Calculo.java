package br.com.projuris;

import java.util.List;
import java.util.ArrayList;

public interface Calculo {

  public List<CustoCargo>custoPorCargo(List<Funcionario> funcionarios);

  public List<CustoDepartamento>custoPorDepartamento(List<Funcionario> funcionarios);
}