public class Simbolos {
	String sNombre;
	String sValor;
 
	public Simbolos(){}
	
	public Simbolos(String sNombre, String sValor){
		this.sNombre=sNombre;
		this.sValor=sValor;
	}
	
	public String getNombre(){
		return sNombre;
	}
	
	public String getValor(){
		return sValor;
	}
}
