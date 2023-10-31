package com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App {
  

  public static String triangulo(int a, int b, int c) {
    if (a==0||b==0||c==0){
      return "error no es un triangulo";
    }
    if (a==b && b==c){
      return "es un triangulo equilatero";
    }
    if (a==b && b!=c){
      return "es un triangulo isoceles";
    }
    return "error no es un triangulo";
  } 
  

  public static void main(String[] args) {
    System.out.println("Hola Gente!");
  }
}
