/**Title: Cameos de Stan Lee
**Problem 475
**Author: Adrián Arabit Ferre <adrianarabit@gmail.com>*/

package NoResueltos;
import java.util.Scanner;

public class Stan_Lee_475 {

    public static void main(String[] args) {

        boolean Debug=false;
        Scanner teclado = new Scanner(System.in);

        int n =Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < n; i++) {
            int STAN=0;
            int LEE=0;
            int StanLee=0;

            String frase = teclado.nextLine();
            int S=0,T=0,A=0,N=0,L=0,E=0;
            boolean StanOK=false;
            for (int j = 0; j < frase.length(); j++) {


                if(!StanOK){
                    if((frase.charAt(j)=='S')||(frase.charAt(j)=='s')){
                        S++;
                    }else if(((frase.charAt(j)=='t')||(frase.charAt(j)=='T'))&&(S>=1)){
                        T++;
                    }else if(((frase.charAt(j)=='a')||(frase.charAt(j)=='A'))&&(S>=1)&&(T>=1)){
                        A++;
                    }else if(((frase.charAt(j)=='n')||(frase.charAt(j)=='N'))&&(S>=1)&&(T>=1)&&(A==1)){
                        N++;
                        S=0;
                        T=0;
                        A=0;
                        L=0;
                        STAN++;
                        StanOK=true;
                    }//fin IF
                }//if StanOK

                if(StanOK){

                    if((frase.charAt(j)=='l')||(frase.charAt(j)=='L')){
                        L++;
                    }else if(((frase.charAt(j)=='e')||(frase.charAt(j)=='E'))&&(E==0)){
                        E++;
                    }else if(((frase.charAt(j)=='e')||(frase.charAt(j)=='E'))&&(E==1)){
                        L=0;
                        E=0;
                        LEE++;
                        StanOK=false;
                        StanLee++;
                    }//fin IF
                }//fin StanOK


            }//fin for frase

            if(Debug){//Nos informa de las variables
                System.out.println("valores de variables\n"+
                        "S="+S+"\n"+
                        "T="+T+"\n"+
                        "A="+A+"\n"+
                        "N="+N+"\n");
                System.out.println("STAN:"+STAN);
                System.out.println("LEE:"+LEE);
                System.out.println("STAN LEE:"+StanLee);
            }

            System.out.println(StanLee);

        }//fin for n

    }
}


