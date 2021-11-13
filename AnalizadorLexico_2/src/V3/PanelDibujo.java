package Codigo;

import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel{
	boolean dibLin = false;
	boolean dibRec = false;
	boolean dibCir = false;
	boolean dibTri = false;
	boolean asicol = false;
	int cantLin = 0;
	int cantRec = 0;
	int cantCir = 0;
	int cantTri = 0;
	int x1L, y1L, x2L, y2L;
	int x1R, y1R, x2R, y2R;
	int xC, yC, rC;
	int x1T, y1T, x2T, y2T, x3T, y3T;
	Color color = Color.WHITE;
	String color_ingreso;
	
	public PanelDibujo(){}
	public void paint(Graphics g){
		// Asignamos el color
		if(asicol){
			if(color_ingreso.equals("rojo")) {color=Color.RED;}
			if(color_ingreso.equals("verde")) {color=Color.GREEN;}
			if(color_ingreso.equals("azul")) {color=Color.BLUE;}
			if(color_ingreso.equals("amarillo")) {color=Color.YELLOW;}
			if(color_ingreso.equals("blanco")) {color=Color.WHITE;}
		}
		// Dibujamos las lineas
		if(dibLin){
			g.setColor(color);
			g.drawLine(x1L+10,y1L+10,x2L+10,y2L+10);
			dibLin = false;
		}
		 // Dibuja los rectangulos
		if(dibRec){
			g.setColor(color);
			g.fillRect(x1R+10, y1R+10, x2R-x1R, y2R-y1R);
			g.setColor(Color.BLACK);
			g.drawRect(x1R+10, y1R+10, x2R-x1R, y2R-y1R);
			dibRec = false;
		}
		// Dibuja los circulos
		if(dibCir){
			g.setColor(color);
			g.fillOval(xC-rC+10,yC-rC+10,2*rC,2*rC);
			g.setColor(Color.BLACK);
			g.drawOval(xC-rC+10,yC-rC+10,2*rC,2*rC);
			dibCir = false;
		}
		// Dibuja los triangulos
		if(dibTri){
			g.setColor(color);
			int [] xp = {x1T+10,x2T+10,x3T+10};
			int [] yp = {y1T+10,y2T+10,y3T+10};
			g.fillPolygon(xp,yp,3);
			g.setColor(Color.BLACK);
			g.drawPolygon(xp,yp,3);
			dibTri = false;
		}
		
		// Dibujamos el origen
		g.setColor(Color.BLACK);
		g.drawLine(0,10,640,10);
		g.drawLine(10,0,10,480);
	}
	public void linea(int a, int b, int c, int d){
		x1L = a;
		y1L = b;
		x2L = c;
		y2L = d;
		cantLin++;
		dibLin = true;
		repaint();
	}
	public void cuadro(int a, int b, int c, int d){
		x1R = a;
		y1R = b;
		x2R = c;
		y2R = d;
		cantRec++;
		dibRec = true;
		repaint();
	}
	public void circulo(int a, int b, int c){
		xC = a;
		yC = b;
		rC = c;
		cantCir++;
		dibCir = true;
		repaint();
	}
	public void triangulo(int a, int b, int c, int d, int e, int f){
		x1T = a;
		y1T = b;
		x2T = c;
		y2T = d;
		x3T = e;
		y3T = f;
		cantTri++;
		dibTri = true;
		repaint();
	}
	public void asignarColor(String a){
		color_ingreso = a;
		asicol = true;
		repaint();
	}
}