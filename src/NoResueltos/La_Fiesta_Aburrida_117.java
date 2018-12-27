package NoResueltos;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Title: La fiesta aburrida
 * *Problem: 117
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class La_Fiesta_Aburrida_117 {

    public static void main(String[] args) throws IOException {

        DataInputStream in = new DataInputStream(System.in);

        short n = Short.parseShort(in.readLine());

        for (int i=0;i<n;i++){

            String palabra =in.readUTF();

            if(palabra.contains("Soy")){

            }else{
                System.out.println("Hola, " + palabra);
            }


        }


    }




}
