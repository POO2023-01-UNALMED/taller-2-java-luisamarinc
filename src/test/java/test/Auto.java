package test;

public class Auto {
	public String modelo;
	public int precio;
	public int registro;
	public String marca;
	public int cantidadCreado;
	Asiento[] asientos;
	public Motor motor;
	
	public int cantidadAsientos() {
		int numeroAsientos = 0;
		
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	
	public String verificarIntegridad() {
		if(registro == motor.registro) {
			for (int i = 0; i < asientos.length; i++){
				if (asientos[i] != null) {
					if (asientos[i].registro != registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		} else {
			return "Las piezas no son originales";
		}

		
	}
	
}
