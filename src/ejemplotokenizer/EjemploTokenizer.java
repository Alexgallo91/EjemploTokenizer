package ejemplotokenizer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class EjemploTokenizer {

    public static void main(String[] args) {
        
        StringTokenizer tokens;
        File fichero = new File("c:\\ejemplo\\file.txt");
        String cadena = "Hola:me:llamo:Abraham";
        
        try
        {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(cadena);
            bw.close();
        }
        catch(IOException e)
        {
           e.printStackTrace();
        }
        
        tokens = new StringTokenizer(cadena, ":");
        cadena = "";
        
        while(tokens.hasMoreTokens())
        {
            cadena += tokens.nextToken();
        }
        
        System.out.println(cadena);
    }
    
}
