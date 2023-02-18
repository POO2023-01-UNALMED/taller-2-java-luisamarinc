package test;

import java.util.Arrays;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	public void cambiarColor(String color){
		String [] colores = {"rojo", "verde", "amarillo", "negro", "blanco"};
		
		boolean encontrar = Arrays.asList(colores).contains(color);
		 
		if (encontrar){
			this.color = color;
		}		
	}
}
