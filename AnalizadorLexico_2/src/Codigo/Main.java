/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Codigo;

import java.io.File;
/**
 *
 * @author Hell
 */
public class Main {
    public static void main(String[] args) {
        String ruta = "C:/Users/Hell/Documents/NetBeansProjects/AnalizadorLexico/src/Codigo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}