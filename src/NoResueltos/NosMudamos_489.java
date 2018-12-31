package NoResueltos;

import java.util.Scanner;

/**
 * Title: NOS MUDAMOS
 * *Problem: 489
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class NosMudamos_489 {

    static int[] actuales ;
    static int[] nuevos ;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n=1, m=1;
        actuales = new int[n];
        nuevos =new int[m];

        while(n!=0){

            n = in.nextInt();

            m = in.nextInt();


            for(int i=0;i<n;i++){
                actuales[i]=in.nextInt();
            }//fin primer array


            for(int j=0;j<m;j++){
                nuevos[j]=in.nextInt();
            }//fin segundo array

            if(actuales.length>nuevos.length){
                System.out.println("NO");
            }else{
             for(int i=0;i<actuales.length;i++){
                 actuales[i]=0;
             }

            }

            public int NuevoGrande(){
                int valor=0;
                for(int i=0;i<nuevos.length;i++){

                    if(nuevos[i]>valor){
                        valor=nuevos[i];
                    }
                    return valor;

                }
            }

        }


    }




}
