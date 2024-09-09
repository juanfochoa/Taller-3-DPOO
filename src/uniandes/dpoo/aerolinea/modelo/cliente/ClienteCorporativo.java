package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Collection;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
 


    public ClienteCorporativo(String nombreEmpresa2, int tam) {
		// TODO Auto-generated constructor stub
	}

	/**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

	public Collection<?> getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(Collection<?> nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Collection<?> getTamanoEmpresa() {
		return tamanoEmpresa;
	}

	public void setTamanoEmpresa(Collection<?> tamanoEmpresa) {
		this.tamanoEmpresa = tamanoEmpresa;
	}

	private Collection<?> nombreEmpresa;
	private Collection<?> tamanoEmpresa;
	private Collection<?> CORPORATIVO;

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }

	@Override
	public Object getTipoCliente() {
		// TODO Auto-generated method stub
		return null;
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