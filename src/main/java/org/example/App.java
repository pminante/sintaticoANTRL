package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try {
            String nomeDoArq = "arquivo.pas";
            String content = new String(Files.readAllBytes(Paths.get(nomeDoArq)));
            Compiler c = new Compiler(content);
            c.execute();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
