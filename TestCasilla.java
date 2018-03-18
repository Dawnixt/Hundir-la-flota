
public class TestCasilla {
	
	public static void main (String[] args)
	{
		Casilla cas1, cas2, cas3;
		
		
		//Prueba Constructor por defecto
		cas1 = new Casilla();
		
		System.out.println(cas1.toString());
		
		//Prueba Constructor con parámetros
		cas1 = new Casilla (1, false, true);
		
		System.out.println(cas1.toString());
		
		//Prueba Constructor de copia
		cas2 = new Casilla(cas1);
		
		System.out.println(cas2.toString());
		
		//Get Y Set
		
		//Set idBarco
		try
		{
			//cas2.setIdBarco(7);
			cas2.setIdBarco(3);
		}catch (ExcepcionCasilla error)
		{
			System.out.println("El valor de idBarco debe estar entre 0 y 5.");
		}
		
		//Get idBarco
		System.out.println(cas2.getIdBarco());
		
		//Set agua
		
		cas2.setAgua(false);
		
		//Get agua
		System.out.println(cas2.getAgua());
		
		//Set descubierta
		cas2.setDescubierta(false);
		
		//Get descubierta
		System.out.println(cas2.getDescubierta());
		
		//Prueba métodos sobreescritos
		
		//hashCode
		System.out.println(cas2.hashCode());
		
		//clone
		cas3 = cas2.clone();
		
		System.out.println(cas3.toString());
		
		//equals
		System.out.println(cas3.equals(cas2));
		//System.out.println(cas1.equals(cas2));
		
		
		
		
	}

}
