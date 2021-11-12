/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 *
 * @author Hell
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String ruta = "C:/Users/Hell/Documents/NetBeansProjects/AnalizadorLexico_2/src/Codigo/lexer.flex";
        String[] rutaS = {"-parser","Sintax","C:/Users/Hell/Documents/NetBeansProjects/AnalizadorLexico_2/src/Codigo/Sintax.cup"};
        generarLexer(ruta,rutaS);
    }
    public static void generarLexer(String ruta,String[] rutaS) throws IOException, Exception{
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        Files.move(
                Paths.get("C:/Users/Hell/Documents/NetBeansProjects/AnalizadorLexico2/Sym.java"),
                Paths.get("C:/Users/Hell/Documents/NetBeansProjects/AnalizadorLexico2/src/Codigo/Sym.java")
        );
        Files.move(
                Paths.get("C:/Users/Hell/Docments/NetBeansProjects/AnalizadorLexico2/Syntax.java"),
                Paths.get("C:/Users/Hell/Documents/NetBeansProjects/AnalizadorLexico2/src/Codigo/Syntax.java")
        );
        
        
    }
}