package Resueltos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Title:
 * *Problem:
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 * *Comentario: Aproximación a través del método STRINGTOKENIZER y operador ternario
 */
public class Polisilaba_467_StringTokenizer {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        for (int i=0; i<n; i++){

            StringTokenizer tk =new StringTokenizer(in.readLine(), " ");

            String subCadena1=tk.nextToken();
            tk.nextToken();
            String subCadena3=tk.nextToken();
            System.out.println((subCadena1.equalsIgnoreCase(subCadena3)?"TAUTOLOGIA":"NO TAUTOLOGIA"));


        }

    }

}


