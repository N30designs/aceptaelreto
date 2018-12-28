package NoResueltos;

import java.util.Scanner;

/**
 * Title: Imprimiendo páginas sueltas
 * *Problem: 405
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Imprimiendo_Paginas_405 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, y, x=0;
        int bajoRango=0, altoRango=0;
        do{
            n = in.nextInt();

            do{
                y = in.nextInt();

                if((y-1)==(x)){
                    if(bajoRango==0) {
                        bajoRango = x;
                        System.out.print(x + "-");
                    }
                }else if(((y-1)!=x)&&(bajoRango>1)){
                    altoRango=x;
                    System.out.print(x+",");
                }

                x=y;



            }while(y!=0);




        }while(n!=0);

    }//fin main


}
