/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab18soal2;

/**
 *
 * @author Lenovo
 */
public class Bab18Soal2 {

   public static void main(String[] args) {
        try{ 
     Float data=500f /15; 
     System.out.println(data); 
        }
     catch(NullPointerException e){ 
    System.out.println(e); 
    } 
    finally { 
    System.out.println("blok finally akan selalu di eksekusi "); 
        }
    }
}