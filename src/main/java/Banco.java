
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Note
 */
public class Banco {
    private String nome;
    private List<Conta> contas;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public List<Conta> getContas(){
        return contas;
    }
    
    public void setContas(List<Conta> contas){
        this.contas=contas;
    }
}
