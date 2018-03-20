package dawnixt.hundirlaflota.clases;

public class TestBarco {
	
	public static void main (String[] args) {
		
		//Constructores
		Barco barcopordefecto=new Barco();
		Barco barcoparametros=new Barco("SS.D.VA",3);
		Barco barcodecopia=new Barco(barcoparametros);
		Barco clonebarcoparametros=null;
		Barco clonebarcocopia=null;
		
		//Gets y Sets
		System.out.println("Valores del barco 1"+ barcopordefecto.toString());
		System.out.println("Valores del barco 2"+ barcoparametros.toString());
		System.out.println("Los valores del barco 2 usando el barco 3"+ barcodecopia.toString());
		barcoparametros.setNombre("SS.Oscar");
		System.out.println("Valores despues del set del valor del barco 2"+barcoparametros.getNombre());
		barcopordefecto.setNombre("Barco generico numero 1");
		
		//Metodos sobrecargados y sobreescritos
		
		//Clone
		clonebarcoparametros=barcoparametros.clone();
		System.out.println("Clone de barco con parametros"+clonebarcoparametros.toString());
		clonebarcocopia=barcodecopia.clone();
		System.out.println("Clone del barco de copia"+clonebarcocopia.toString());
		
		//hashCode
		System.out.println("El hahCode de todos los barcos en orden:");
		System.out.println("Barco 1"+barcopordefecto.hashCode());
		System.out.println("Barco 2"+barcoparametros.hashCode());
		System.out.println("Barco 3"+barcodecopia.hashCode());
		System.out.println("Barco clone del barco 2"+clonebarcoparametros.hashCode());
		System.out.println("Barco clone del barco de copia"+clonebarcocopia.hashCode());
		
		//equals
		System.out.println("Probando el equals en el barco 1 y 2:"+barcopordefecto.equals(barcoparametros));
		System.out.println("Equals en el barco 1 y en el clone de 2"+barcopordefecto.equals(clonebarcoparametros));
		
		//clone
		clonebarcocopia = barcodecopia.clone();
		System.out.println("Probando clone clonando barcocopia");
		System.out.println("Valores del barco copia"+ barcodecopia.toString());
		System.out.println("Valores del clone del barco de copia"+ clonebarcocopia.toString());
		clonebarcoparametros = barcoparametros.clone();
		System.out.println("Probando clone clonando barco dos");
		System.out.println("Valores del barco 2"+ barcoparametros.toString());
		System.out.println("Valores del barco clonado del 2"+ clonebarcoparametros.toString());
		
		//Compare to
		System.out.println("Probando compare to con el barco 1 y el barco 2 "+ barcopordefecto.compareTo(barcoparametros));
		System.out.println("Probando compare to con el barco 2 y su clone "+ barcoparametros.compareTo(clonebarcoparametros));
		
		
		
	}
	
}
