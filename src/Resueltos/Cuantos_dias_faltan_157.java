package Resueltos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title: ¿Cuantos días faltan?
 * *Problem: 157
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Cuantos_dias_faltan_157 {

    public static void main(String[] args) throws IOException {
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

        int restan, d, m;
//        Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        for(int i=0;i<n;i++){
            String[] cadena = (in.readLine()).split(" ");
            restan = 0;
            d=Integer.parseInt(cadena[0]);
            m=Integer.parseInt(cadena[1]);

            for(int j=m-1;j<(dias.length);j++){
                restan= restan + dias[j];
            }

            System.out.println(restan-d);

        }//final bucle



    }//final main

}//final clase



