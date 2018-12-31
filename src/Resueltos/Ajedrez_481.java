package Resueltos;

import java.util.Scanner;

/**
 * Title: Ajedrez asistido por computador
 * *Problem: 481
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Ajedrez_481 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = 1;

        int y = 1;

        while(!((x==0)&&(y==0))) {

            x = in.nextInt();

            y = in.nextInt();

            switch (x) {

                case 1:
                    System.out.println("h" + y);
                    break;

                case 2:
                    System.out.println("g" + y);
                    break;

                case 3:
                    System.out.println("f" + y);
                    break;

                case 4:
                    System.out.println("e" + y);
                    break;

                case 5:
                    System.out.println("d" + y);
                    break;

                case 6:
                    System.out.println("c" + y);
                    break;

                case 7:
                    System.out.println("b" + y);
                    break;

                case 8:
                    System.out.println("a" + y);
                    break;
            }

        }
    }


}
