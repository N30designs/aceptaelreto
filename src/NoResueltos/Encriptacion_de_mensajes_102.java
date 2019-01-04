package NoResueltos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Title:Encriptación de mensajes
 * *Problem:102
 * *Author: Adrián Arabit Ferre <adrianarabit@gmail.com>
 */
public class Encriptacion_de_mensajes_102 {


    public static void main(String[] args) {
        String cadena="";

        Scanner in = new Scanner(System.in);
        while(true) {
            cadena = in.nextLine();

            Decodifica decodifica = new Decodifica(cadena);
        }

    }
}

class Decodifica{
    private String cadena;
    static StringBuilder cadena2 = new StringBuilder();
    private int comparaP;

    public Decodifica(String cadena){
        this.cadena=cadena;

        for(int i=0; i<cadena.length(); i++){

            char c = cadena.charAt(i);

            if((comparaP>=0)&&(Character.isAlphabetic(c))&&(i>0)) {
                cadena2.append((char) (c - calculaP()));
            }else if((!Character.isAlphabetic(c)))
                cadena2.append(c);
            else if((comparaP<0)&&(Character.isAlphabetic(c))&&(i>0)){

                cadena2.append((char) (c + calculaP()));

            }


        }

        if(cadena2.toString().equals("FIN")) {
            System.exit(0);
        }
        System.out.println("CALCULO:"+calculaP());
        System.out.println("VOCALES"+cuentaVocales());

        //test
        System.out.println(cadena2);

        cadena2.delete(0,cadena2.length());

    }

    public int calculaP(){

        comparaP  = Character.compare(cadena.charAt(0),'p');

        return comparaP;
    }

    public int cuentaVocales(){

        short contador = 0;
        Pattern p = Pattern.compile("[aeiouAEIOU]");
        Matcher m = p.matcher(cadena2);

        while(m.find()){
            contador++;
        }


        return contador;
    }
}
