package Resueltos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title:Contando en la arena
 * *Problem: 369
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Contando_en_la_Arena_369 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {

            n = Integer.parseInt(in.readLine());


            for (int i = n; i > 0; i--) {

                if (i != 1) System.out.print(1);
                else System.out.println(1);

            }
        }while(!(n==0));
    }

}
