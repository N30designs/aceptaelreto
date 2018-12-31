package NoResueltos;

import java.util.Scanner;

/**
 * Title: ¿Cuántas pido?
 * *Problem: 480
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Cuantas_Pido_480 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = Integer.parseInt(in.nextLine());

        for (int i=0; i<casos; i++){

            float n, a, b;

            n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();

            System.out.println(Math.ceil(Math.ceil(n/b)*a));


        }//fin for


    }//fin main



}//fin clase
