package test;

import java.util.Arrays;

public class Motor {
 public int numeroCilindros;
 public String tipo;
 public int registro;
 
 public void cambiarRegistro(int registro) {
	 this.registro = registro;	 
 }
 
 public void asignarTipo(String tipo) {
 
 	String [] tipos = {"electrico", "gasolina"}; 	
 	boolean encontrar = Arrays.asList(tipos).contains(tipo);
	 
	if (encontrar){
		this.tipo = tipo;
	} 
 }
 
 
}
