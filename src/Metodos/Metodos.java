/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Español
 */
public class Metodos {
   int edad=18;
   String nombre="Jony";
   String direccion="2444";
   public void imprimiredad(){
       System.out.println(edad);
   }
   public void imprimirnombre(){
       System.out.println(nombre);
   }
   public void imprimirdireccion(){
       System.out.println(direccion);
   }
   public void imprimirdni(int numero1){
       System.out.println(numero1);
   }
   public void Imprimirdatos(){
       imprimiredad();
       imprimirnombre();
       imprimirdireccion();
   }
   public void Resta (int dato1,int dato2){
       int diferencia;
      diferencia=dato1-dato2;
       System.out.println(diferencia);
   }
   public void imprimir2datos(int numero2, int numero3){
       System.out.println(numero2+numero3);
   }
   public static void main (String [] args){
       
       Metodos metodo2=new Metodos();
       Metodos miguel=new Metodos();
       
       int numero4=20;
       int numero2=20;
       int numero3=50;
       metodo2.edad=20;
       metodo2.imprimiredad();
       metodo2.imprimirnombre();
       metodo2.imprimirdireccion();
       
       miguel.edad=19;
       miguel.direccion="2500";
       miguel.nombre="Miguel";
      
       System.out.println("Hola");
       miguel.Imprimirdatos();
       miguel.imprimirdni(numero4);
      // miguel.imprimiredad();
      // miguel.imprimirnombre();
      // miguel.imprimirdireccion();
      miguel.imprimir2datos(numero2, numero3);
       miguel.Resta(numero2, numero3);
   }
   
   }

