package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private String nombre;
	
	public String getIdentificador() {
		return this.nombre;
		
	}

	public abstract Object getTipoCliente();
	
	public abstract void agregarTiquete(Tiquete tiquete);
	
	public abstract int calcularValorTotalTiquetes();
	public abstract void usarTiquetes(Vuelo vuelo);
	
}
	