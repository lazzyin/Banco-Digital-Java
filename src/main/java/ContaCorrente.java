/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class ContaCorrente extends Conta {

   

    

  
   @Override
   public void imprimirExtrato(){
       System.out.println("Extrato Conta Corrente");
       super.imprimirInfosComuns();
   }
    
}
