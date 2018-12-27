package Resueltos;

import java.io.DataInputStream;
import java.io.IOException;
/**
 * Title:Hola Mundo
 * *Problem:116
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Hola_Mundo_116 {


    static final String st = "Hola mundo.";


    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        int n = Integer.parseInt(in.readLine());
        for (int i=0; i<n;n--)
            System.out.println(st);

    }//fin main

}// fin clase
