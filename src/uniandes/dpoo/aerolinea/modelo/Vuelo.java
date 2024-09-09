package uniandes.dpoo.aerolinea.modelo;
import java.util.Collection;
import java.util.HashSet;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
    private Collection<Tiquete> tiquetes;
	

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Vuelo(String fecha, Ruta ruta, Avion avion) {
		super();
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}

	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return (Integer) null;
		
	}

	public boolean equals(Object obj) {
		return (Boolean) null;
		
	}

	public Collection<? extends Tiquete> getTiquetes() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAvion() {
		// TODO Auto-generated method stub
		return null;
	}

}
