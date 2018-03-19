
public class TestGestoraTablero {

	public static void main (String[] args)
	{
		GestoraTablero funcion = new GestoraTablero();
		Casilla tablero[][] = new Casilla[10][10];
		boolean ret;
		
		//Inicializamos todas las casillas por valor de defecto.
		for(int i = 0; i < tablero.length; i++)
		{
			for(int j = 0; j < tablero[0].length; j++)
			{
				tablero[i][j] = new Casilla();
			}
		}
		
		//Insertamos diferentes valores en tablero.
		
		try
		{
			tablero[0][1].setIdBarco(2);
			tablero[0][2].setIdBarco(2);
			tablero[0][3].setIdBarco(2);
		}catch(ExcepcionCasilla error) {
			System.out.println("Error al introducir los datos.");
		}
		
		//Visualizar tablero segun IdBarco
		for(int i = 0; i < tablero.length; i++)
		{
			System.out.println();
			
			for(int j = 0; j < tablero[0].length; j++)
			{
				System.out.print(tablero[i][j].getIdBarco());
			}
		}
		
		System.out.println();
		
		//Prueba verificarEspacioLibre
		
		ret = funcion.verificarEspacioLibre(0, 1, 0, 2, tablero);
		//ret = funcion.verificarEspacioLibre(1, 0, 2, 0, tablero);
		
		System.out.println(ret);
		
		
	}
	
}
