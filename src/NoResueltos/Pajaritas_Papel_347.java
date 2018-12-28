package NoResueltos;

import java.util.Scanner;

/**
 * Title:Haciendo pajaritas de papel
 * *Problem:347
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Pajaritas_Papel_347 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x, y, z;
        do{
            x = in.nextInt();
            y = in.nextInt();
            z=0;

            while((x>=10)&&(y>=10)){
                if((x>y)&&(x>10)) {
                    x = x - y;
                    z++;
                }else if((x>y)&&(x>1)){
                    x=1;
                    z++;
                }else if((y>x)&&(y>10)){
                    y = y - x;
                    z++;
                }else if((y>x)&&(y>1)){
                    y=1;
                    z++;
                }else if((x==y)){
                    x=1;
                    y=1;
                    z++;
                }

            }
            if((x!=0)&&(y!=0))
            System.out.println(z);

        }while((x!=0)&&(y!=0));

    }

}
