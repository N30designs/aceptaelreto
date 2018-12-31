package Resueltos;

import java.io.IOException;
import java.util.Scanner;

/**
 * Title:
 * *Problem:
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Senda_Pirenaica_485 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int n=1;
        while(n!=0){
            n = in.nextInt();
            int[] etapa = new int[n];
            int total = 0;
            for(int i=0; i<n; i++){

                etapa[i]= in.nextInt();
                total = total+ etapa[i];
            }

            for(int j=0;j<etapa.length;j++){
                if(j!=etapa.length-1) {
                    System.out.print(total + " ");
                    total = total - etapa[j];
                }else if(j==etapa.length-1){
                    System.out.print(total+"\n");
                    total = total - etapa[j];
                }

            }
        }


    }

}
