package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente {

	public static final String NATURAL = "Natural";
	
	private String nombre;
	
	
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}
	
	public String getIdentificador() {
        return this.nombre;
	}
	
	public String getTipoCliente() {
        return NATURAL;
	}

	@Override
	public void agregarTiquete(Tiquete tiquete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calcularValorTotalTiquetes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void usarTiquetes(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}
}