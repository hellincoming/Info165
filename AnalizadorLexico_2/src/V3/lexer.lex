package Codigo;
import java_cup.runtime.Symbol;
%%
%cup
%full
%line
%char
letra=[a-zA-Z_]+
mayus=[A-Z_]+
digito=[0-9]+
espacio=[ \t\r]+

%%
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"dibujar" {return new Symbol(sym.Dibujar);}
"fin" {return new Symbol(sym.Fin);}
"asignar" {return new Symbol(sym.Asignar);}
"linea" {return new Symbol(sym.Linea);}
"cuadro" {return new Symbol(sym.Cuadro);}
"redondo" {return new Symbol(sym.Redondo);}
"triangulo" {return new Symbol(sym.Triangulo);}
"color" {return new Symbol(sym.Color);}
"rojo" {return new Symbol(sym.Rojo);}
"verde" {return new Symbol(sym.Verde);}
"azul" {return new Symbol(sym.Azul);}
"amarillo" {return new Symbol(sym.Amarillo);}
"blanco" {return new Symbol(sym.Blanco);}
"relleno" {return new Symbol(sym.Relleno);}
[mayus]([letra]+([letra]|[digito])*[digito])*[digito]* {return new Symbol(sym.VAR);}
[digito]+ {return new Symbol(sym.Cons);}
"=" {return new Symbol(sym.Igual);}
"," {return new Symbol(sym.Coma);}
"(" {return new Symbol(sym.ParA);}
")" {return new Symbol(sym.ParC);}
. { System.err.println("Illegal character:"+yytext()); }