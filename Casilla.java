/*
 * Tipo Casilla
 *
 *	Propiedades básicas:
 *		-Descubierta: boolean, consultable y Modificable
 *		-Agua: boolean, consultable y Modificable
 *		-IdBarco: int, consultable y modificable.
 *	
 *	Propiedades derivadas: No hay
 *	
 *	Propiedades compartidas: No hay 
 *	
 *	Restricciones:
 *		-idBarco >= 0 y idBarco <= 5
 *	
 *	Funcionalidades añadidas: Ninguna
 *	
 *	Interfaz:
 *		-public boolean getDescubierta()
 *		-public void setDescubierta(boolean descubierta)
 *	
 *		-public boolean getAgua()
 *		-public void setAgua(boolean)
 *
 *		-public boolean getIdBarco()
 *		-public void setIdBarco(boolean idBarco)
 *
 */

public class Casilla implements Cloneable{
	
	private int idBarco;
	private boolean agua;
	private boolean descubierta;
	
	//Constructores
	
	//Por defecto
	public Casilla ()
	{
		idBarco = 0;
		agua = true;
		descubierta = false; 
	}
	
	//Con parámetros
	public Casilla (int idBarco, boolean agua, boolean descubierta)
	{
		this.idBarco = idBarco;
		this.agua = agua;
		this.descubierta = descubierta;
	}
	
	//De copia
	public Casilla (Casilla otro)
	{
		this.idBarco = otro.getIdBarco();
		this.agua = otro.getAgua();
		this.descubierta = otro.getDescubierta();
	}
	
	//Interfaz
	public int getIdBarco()
	{
		return idBarco;
	}
	
	public void setIdBarco(int idBarco) throws ExcepcionCasilla
	{
		if (idBarco >= 0 && idBarco <= 5)
			this.idBarco = idBarco;
		else
			throw new ExcepcionCasilla ("El valor de idBarco debe estar entre 0 y 5.");
	}
	
	public boolean getAgua()
	{
		return agua;
	}
	
	public void setAgua(boolean agua)
	{
		this.agua = agua;
	}
	
	public boolean getDescubierta()
	{
		return descubierta;
	}
	
	public void setDescubierta (boolean descubierta)
	{
		this.descubierta = descubierta;
	}
	
	//Metodos Sobreescritos
	
	//hashCode
	@Override
	public int hashCode()
	{
		return (getIdBarco() + 1) * 7;
	}

	//equals
	@Override
	public boolean equals (Object obj)
	{
		boolean ret = false;
		
		if (obj == this)
			ret = true;
		else
			if (obj != null && obj instanceof Casilla)
			{
				Casilla otro = (Casilla) obj;
				
				if (this.getIdBarco() == otro.getIdBarco() &&
					this.getDescubierta() == otro.getDescubierta() &&
					this.getAgua() == otro.getAgua())
					ret = true;
			}
		return ret;
	}
	
	//clone
	@Override
	public Casilla clone()
	{
		Casilla copia = null;
		
		try
		{
			copia = (Casilla) super.clone();
		}catch (CloneNotSupportedException error){
			System.out.println("Error en la copia, se devuelve null.");
		}
		
		return copia;
	}
	
	//toString
	public String toString()
	{
		return "IdBarco: "+getIdBarco()+", Agua: "+getAgua()+", Descubierta: "+getDescubierta();
	}
	
	
}
