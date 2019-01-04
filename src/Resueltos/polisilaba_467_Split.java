package Resueltos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title:Polisílaba es polisílaba
 * *Problem: 467
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 * *Comentario: Aproximación a través del método SPLIT
 */
public class polisilaba_467_Split {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            String[] cadena = in.readLine().split(" ");

            if (cadena[0].equalsIgnoreCase(cadena[2])) {
                System.out.println("TAUTOLOGIA");
            } else {
                System.out.println("NO TAUTOLOGIA");
            }//fin if


        }//fin bucle

    }//fin Main
}//fin clase
