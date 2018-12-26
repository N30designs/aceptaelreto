package Resueltos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileDescriptor;
/**
 * Title:
 * *Problem:
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Yo_soy_tu_427 {

    public static void main(String[] args) throws IOException{
        int iteraciones = 0;
        String nombre1, nombre2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


        //Scanner teclado = new Scanner(System.in);
        //iniciamos lectura
        iteraciones = Integer.parseInt(entrada.readLine());

        for(int i=0;i<iteraciones;i++){
            nombre1 = entrada.readLine();
            nombre2 = entrada.readLine();

            if((nombre1.equals("Luke"))&&(nombre2.equals("padre"))){
                out.write("TOP SECRET\n");
                out.flush();
            }else{
                out.write(nombre1 + ", yo soy tu " + nombre2+"\n");
                out.flush();
            }




        }//fin for

    }//fin main

}
