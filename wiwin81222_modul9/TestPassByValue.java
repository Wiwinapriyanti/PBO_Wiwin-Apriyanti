/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wiwin81222_modul9;

/**
 *
 * @author ASUS
 */
public class TestPassByValue {
    public static void main( String[] args ){ 
 int i = 10; 
 //mencetak nilai i 
 System.out.println( i ); 
 //memanggil method test 
 //passing i pada method test 
 test( i ); 
 //Mencetak nilai i 
 System.out.println( i ); 

 } 
public static void test( int j ){ 
 //merubah nilai parameter j 
 j = 33; 
 }
}
