/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianbab8;

/**
 *
 * @author Fauzi Reza P
 */
public class Angka implements I1,D1 {
    double bilangan;
    public Angka(){
        bilangan=0;
    }
    public Angka(double bilangan){
        this.bilangan=bilangan;
    }
public void setBilangan(double b){
    bilangan=b;    
    }
public double getBilangan(){
    return bilangan;
}
    @Override
    public void I1() {
        System.out.println("Angka yang anda inputkan integer");
    }
    @Override
    public void D1() {
        System.out.println("Angka yang anda inputkan double");
    }
}
