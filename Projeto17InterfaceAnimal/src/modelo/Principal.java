/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal("Varios","Varios");
        Felino felino = new Felino("Carne","Selva e Urbano");
        Gato gato = new Gato("Persa","Carne","Urbano");
        Leao leao = new Leao("Africa","Carne","Savana");
        Tigre tigre = new Tigre("Dourado","Carne","Selva");
        
        Canino canino = new Canino("Carne","Varios");
        Lobo lobo = new Lobo(50,"Carne","Tundra");
        Cao cachorro = new Cao(40,"Carne","Urbano");
        
        cachorro.alimentar();
        gato.alimentar();
    }
    
}
