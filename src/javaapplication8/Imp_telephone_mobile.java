/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author MALSHANI
 */
public class Imp_telephone_mobile implements telephone , mobile {
    @Override
    public void call () {
        System.out.println("Ringing............!!");
    }
    
    @Override
    public void message (){
      System.out.println("texting.................!!");
    }
}
