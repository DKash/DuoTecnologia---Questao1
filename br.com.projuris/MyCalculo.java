package br.com.projuris;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class MyCalculo implements Calculo{

  public List<CustoCargo>custoPorCargo(List<Funcionario> funcionarios){
    List<CustoCargo> custoGerado = new ArrayList<CustoCargo>();

    for (int i = 0; i < funcionarios.size(); i++) {

      Funcionario funcionario = funcionarios.get(i);
      funcionario.setSalario(funcionario.getSalario().setScale(2, BigDecimal.ROUND_HALF_UP));

      if(custoGerado.size() == 0){
        CustoCargo obj_custo = new CustoCargo();
        obj_custo.setCargo(funcionario.getCargo());
        obj_custo.setCusto(funcionario.getSalario());
        
        custoGerado.add(obj_custo);

      }else if(custoGerado.size() > 0){
        
        boolean flag = false;
        for (int j = 0; j < custoGerado.size(); j++) {
          if(custoGerado.get(j).getCargo().equals(funcionario.getCargo())){
            
            custoGerado.get(j).setCusto(custoGerado.get(j).getCusto().add(
              funcionario.getSalario()));
            flag = true;
          }
        }
        
        if(!flag){
          
          CustoCargo novoCargo = new CustoCargo();

          novoCargo.setCargo(funcionario.getCargo());
          novoCargo.setCusto(funcionario.getSalario());
            
          custoGerado.add(novoCargo);  
        }
      }
    }
    return custoGerado;
  }

  public List<CustoDepartamento>custoPorDepartamento(List<Funcionario> funcionarios){

    List<CustoDepartamento> custoGerado = new ArrayList<CustoDepartamento>();

    for (int i = 0; i < funcionarios.size(); i++) {

      Funcionario funcionario = funcionarios.get(i);
      funcionario.setSalario(funcionario.getSalario().setScale(2, BigDecimal.ROUND_HALF_UP));

      if(custoGerado.size() == 0){
        
        CustoDepartamento obj_custo = new CustoDepartamento();
        obj_custo.setDepartamento(funcionario.getDepartamento());
        obj_custo.setCusto(funcionario.getSalario());
        
        custoGerado.add(obj_custo);

      }else if(custoGerado.size() > 0){
        
        boolean flag = false;
        for (int j = 0; j < custoGerado.size(); j++) {
          
          if(custoGerado.get(j).getDepartamento().equals(funcionario.getDepartamento())){
            
            custoGerado.get(j).setCusto(custoGerado.get(j).getCusto().add(funcionario.getSalario()));
            flag = true;
          }
        }
        
        if(!flag){
        
          CustoDepartamento novoDepartamento = new CustoDepartamento();
          novoDepartamento.setDepartamento(funcionario.getDepartamento());
          novoDepartamento.setCusto(funcionario.getSalario());
          
          custoGerado.add(novoDepartamento);  
        }
      }
    }
    return custoGerado;
  }
}