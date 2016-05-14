/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianbab8;

import java.util.Scanner;

/**
 *
 * @author Fauzi Reza P
 */
public class MainBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Angka a=new Angka();
        System.out.println("Masukkan angka :");
        double bil = input.nextDouble();
        a.setBilangan(bil);
        if(bil%1==0){
        a.I1();
    }
        else {
        a.D1();
        }

}
}
