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
public class Felino extends Animal {
    //CONSTRUTORES
    //VAZIO
    public Felino() {
    }
    //CHEIO
    public Felino(String comida, String habitat) {
        super(comida, habitat);
    }
    @Override
    public void makeNoise() {
        System.out.println("Ronrono");
    }
}
