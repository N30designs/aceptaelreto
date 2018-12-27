package Resueltos;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title: La fiesta aburrida
 * *Problem: 117
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class La_Fiesta_Aburrida_117 {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(in.readLine());

        for (int i=0;i<n;i++){

            String[] palabra =in.readLine().split(" ");

            for (int j=0;j<palabra.length;j++){
                if(palabra[j].contains("Soy")){

                }else{
                    System.out.println("Hola, "+palabra[j].toString() + ".");

                }// FIN IF

            }// FIN FOR j

        }// FIN FOR i

    }// FIN MAIN

}// FIN CLASE
