/*
 * Nombre de la clase: Barco
 * 
 * ******Propiedades basicas*******
 * 
 * -Nombre->String Consultable y Modificable
 * -Size->Int Consultable 
 * 
 * ******Propiedades derivadas******
 * 
 * -No hay 
 * 
 * ******Propiedades compartidas*******
 * 
 * -ID-> int Consultable y Modificable
 * 
 * ********Restriciones*********
 * 
 * -size >= 1 y size < 6
 * 
 **************Interfaz**************
 * 
 * -public String getNombre()
 * 
 * -public void setNombre(String nombre)
 * 
 * -public int getSize()
 * 
 * 
 * *******Funcionalidades añadidas********
 * 
 * -No hay 
 * 
 */


package dawnixt.hundirlaflota.clases;

public class Barco implements Comparable<Barco>, Cloneable {
	
	private String nombre;
	private int size;
	
	
	//Constructores
	
	//Por defecto
	public Barco(){
		
		nombre="Sin nombre";
		size=1;
	}
	
	//Con parametros
	public Barco(String nombre, int size) {
		
		this.nombre=nombre;
		this.size=size;
	}
	
	//De copia
	public Barco(Barco barco) {
		
		this.nombre=barco.nombre;
	}
	
	//Gets y Sets
	
	public String getNombre() {
		
		return(nombre);
	}
	
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
	}
	
	public int getSize() {
		
		return(size);
	}
	
	//Metodos sobreescritos
	
	@Override
	public int hashCode(){
		
		return(this.size*this.size);
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		boolean ret=false;
		
		if(this==obj) {
			
			ret=true;
		}
		
		else if(obj!=null && obj instanceof Barco) {
			
			Barco other=(Barco) obj;
			
			if(this.nombre== other.nombre &&
				this.size==other.size) 
				
				ret=true;
			
		}
		return(ret);
	}
	
	@Override
	public Barco clone() {
		
		Barco copia=null;
		
		try {
			
			copia=(Barco) super.clone();
		}
		catch(CloneNotSupportedException error) {
			
			System.out.println("No se ha podido realizar el clone");
		}
		return(copia);
	}
	
	/*Condiciones de comparacion devolvera:
	*	-1 si el size es mayor que el del otro barco
	*	-0 si el size es igual al del otro barco
	*	- -1 si el size es menor que el del otro barco
	*/
	@Override
	public int compareTo(Barco other){
		
		int devolucion=0;
		
		if(this!=other && this.getSize()> other.getSize()) {
			
			devolucion=1;
		}
		
		else if (this!=other && this.getSize()<other.getSize()) {
			
			devolucion=-1;
		}
		
		else {
			
			devolucion=0;
		}
		
		return(devolucion);
	}
	
	@Override
	public String toString() {
		
		return("Su barco tiene: como nombre"+this.getNombre()+"y tiene"+this.getSize()+"piezas");
	}

}
