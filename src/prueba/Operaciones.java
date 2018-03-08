/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Hernan_Gomez
 */
public class Operaciones {
    
    public double elevar(int base, int exp){
    double resultado =1;
        for(int i=1 ; i<=exp; i++)
         resultado *=base;
        
        
 return resultado;   
}
    
    public void rt(){
        System.out.println("prueba.Operaciones.rt()");
    }
    
    public void nuev0(){}
}
