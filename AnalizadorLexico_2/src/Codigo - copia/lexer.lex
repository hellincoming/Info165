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
espacio=[ \t\r\n]+

%%
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}


"dibujar" {return new Symbol(sym.Dibujar, yychar,yyline,yytext());}
"fin" {return new Symbol(sym.Fin, yychar,yyline,yytext());}
"asignar" {return new Symbol(sym.Asignar, yychar,yyline,yytext());}
"linea" {return new Symbol(sym.Linea, yychar,yyline,yytext());}
"cuadro" {return new Symbol(sym.Cuadro, yychar,yyline,yytext());}
"redondo" {return new Symbol(sym.Redondo, yychar,yyline,yytext());}
"triangulo" {return new Symbol(sym.Triangulo, yychar,yyline,yytext());}
"color" {return new Symbol(sym.Color, yychar,yyline,yytext());}
"rojo" {return new Symbol(sym.Rojo, yychar,yyline,yytext());}
"verde" {return new Symbol(sym.Verde, yychar,yyline,yytext());}
"azul" {return new Symbol(sym.Azul, yychar,yyline,yytext());}
"amarillo" {return new Symbol(sym.Amarillo, yychar,yyline,yytext());}
"blanco" {return new Symbol(sym.Blanco, yychar,yyline,yytext());}
"relleno" {return new Symbol(sym.Relleno, yychar,yyline,yytext());}
[mayus]([letra]+([letra]|[digito])*[digito])*[digito]* {return new Symbol(sym.Var,, yychar,yyline,yytext());}
[digito]+ {return new Symbol(sym.NUMBER, yychar,yyline,yytext());}
"si" {return new Symbol(sym.Si;}
"no" {return new Symbol(sym.No;}
"=" {return new Symbol(sym.Igual);}
"," {return new Symbol(sym.Coma);}
"(" {return new Symbol(sym.ParA);}
")" {return new Symbol(sym.ParC);}