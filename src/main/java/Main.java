/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta cc=new ContaCorrente();
        cc.depositar(100);
        Conta poupanca=new ContaPoupanca();
        
        cc.transferir(10, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

    
    
}
