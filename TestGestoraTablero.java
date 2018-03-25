
public class TestGestoraTablero {

	public static void main (String[] args)
	{
		GestoraTablero funcion = new GestoraTablero();
		Casilla tablero[][] = new Casilla[10][10];
		Barco nave1 = new Barco("Aprueba a Dani, es buena gente", 3);
		Barco nave2 = new Barco("Vaya vaya", 2);
		Barco nave3 = new Barco("Yeray", 4);
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
		
		//Prueba colocarBarco
		funcion.colocarBarco(8, 1, 8, 3, nave1, tablero);
		funcion.colocarBarco(6, 7, 7, 7, nave2, tablero);
		funcion.colocarBarco(0, 0, 0, 3, nave3, tablero);
		
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
		
		//Prueba descubrirCasilla
		
		funcion.descubrirCasilla(8, 1, tablero);
		//funcion.descubrirCasilla(9, 1, tablero);
		funcion.descubrirCasilla(0, 0, tablero);
		
		//Prueba validarCasillaDescubierta
		ret = funcion.validarCasillaDescubierta(8, 1, tablero);
		System.out.println(ret);
		
		ret = funcion.validarCasillaDescubierta(9, 1, tablero);
		System.out.println(ret);
		
		//Prueba mostrarTablero
		funcion.mostrarTablero(tablero);
		
		System.out.println();
		
		//Prueba mostrarBarcosHundidos
		funcion.descubrirCasilla(8, 2, tablero);
		funcion.descubrirCasilla(8, 3, tablero);
		
		funcion.mostrarTablero(tablero);
		
		Barco naves[] = new Barco[3];
		
		naves[0] = new Barco("Pescanova", 3);
		naves[1] = new Barco("MHA", 2);
		naves[2] = new Barco("Nautilus", 4);
		
		System.out.println();
		
		funcion.mostrarBarcosHundidos(tablero, naves);
	}
	
}
