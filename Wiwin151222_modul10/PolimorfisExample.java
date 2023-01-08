/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wiwin151222_modul10;

/**
 *
 * @author ASUS
 */
public class PolimorfisExample {
     public static void main( String[] args ) 
    { 
     person ref; 
     Student Student = new Student(); 
     Employee emp = new Employee();
     
     ref = Student; 
     String temp = ref.getName(); 
     System.out.println( temp ); 
     
     ref = emp; 
     String temp1 = ref.getName(); 
     System.out.println( temp1 ); 
     }
}


