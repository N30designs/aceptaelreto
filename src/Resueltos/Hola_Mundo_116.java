package Resueltos;

import java.util.Scanner;
import java.io.*;
/**
 * Title:Hola Mundo
 * *Problem:116
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Hola_Mundo_116 {

    static final String st = "Hola mundo.";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        while(n!=0){
            System.out.println(st);
            n--;

        }


    }//fin main

}// fin clase
