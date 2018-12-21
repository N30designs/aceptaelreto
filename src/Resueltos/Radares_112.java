/**Title: Radares de tramo
 **Problem 112
 **Author: Adrián Arabit Ferre <adrianarabit@gmail.com>*/

package Resueltos;

import java.util.Scanner;

public class Radares_112 {
    public static void main(String[] args){
        float vmedia;
        short metros, velMax, tiempo;
        Scanner teclado=new Scanner(System.in);

        do{
            metros=teclado.nextShort();
            velMax=teclado.nextShort();
            tiempo=teclado.nextShort();

            vmedia=(float) (((float)metros/1000)/(tiempo/Math.pow(60, 2)));
            if((metros==0)&&(velMax==0)&&(tiempo==0)){
                break;
            }else if(vmedia>velMax&vmedia<(velMax*1.20)&!(velMax<=0)&!(metros<=0)
                    &!(tiempo<=0)){
                System.out.println("MULTA");
            }else if(vmedia>velMax&vmedia>=(velMax*1.20)&!(velMax<=0)&!(metros<=0)
                    &!(tiempo<=0)){
                System.out.println("PUNTOS");
            }else if((metros<=0||velMax<=0||tiempo<=0)||
                    (metros<=0&&(velMax>0||tiempo>0))||
                    (velMax<=0&&(metros>0||tiempo>0))||
                    (tiempo<=0&&(metros>0||velMax>0)))
            {
                System.out.println("ERROR");
            }else{
                System.out.println("OK");
            }


        }while(!((metros==0)&&(velMax==0)&&(tiempo==0)));

    }
}
