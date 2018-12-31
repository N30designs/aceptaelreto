package NoResueltos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title:Los calcetines de Ian Malcolm
 * *Problem: 482
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Calcetines_Ian_482 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        int g= 0;
        boolean fin = false;
        do{
            char[] caracter = in.readLine().toCharArray();

            for(int i=0;i<caracter.length;i++){
                if(caracter[i]=='N'){
                    n++;
                }else if(caracter[i]=='G'){
                    g++;
                }else if((caracter[i]=='.')&&((n>0)||(g>0))){
                    if(((n%2==0)&&(g%2==0)&&(n>0)&&(g>0))) {
                        System.out.println("EMPAREJADOS");
                    }else if(((n%2==0)&&(g%2==0)&&(n==0)&&(g>0))) {
                        System.out.println("NEGRO SOLITARIO");
                    }else if(((n%2==0)&&(g%2==0)&&(n>0)&&(g==0))) {
                        System.out.println("GRIS SOLITARIO");
                    }else if((n%2!=0)&&(g%2==0)){
                        System.out.println("NEGRO SOLITARIO");
                    }else if((n%2==0)&&(g%2!=0)){
                        System.out.println("GRIS SOLITARIO");
                    }else if((n%2!=0)&&(g%2!=0)){
                        System.out.println("PAREJA MIXTA");
                    }else{

                    }
                    n=0;
                    g=0;
                }else if((caracter[i]=='.')&&(n==0)&&(g==0)){
                    fin = true;
                }
            }
        }while(!fin);





    }

}
