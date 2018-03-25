public class GestoraTablero {

	/*
	 * verificarEspacioLibre
	 * 
	 * Interfaz
	 * Comentario: Esta función comprueba una serie de casillas en un tablero.
	 * Devuelve true si las casillas estan libres o devuelve false si alguna esta ocupada.
	 * Cabecera: public boolean verificarEspacioLibre(int fila_inicial, int columna_inicial, int fila_fin, int columna_fin, Casilla tablero[][])
	 * 
	 * Entrada:
	 * 	-fila_inicial
	 * 	-columna_inicial
	 * 	-fila_fin
	 * 	-columna_fin
	 * 	-tablero [][]
	 * 
	 * Salida:
	 * 	-ret (boolean)
	 * 
	 * Precondiciones:
	 * 	-fila_inicial == fila_fin || columna_inicial == columna_fin
	 * 	-fila_inicial >= 0 && fila_inicial <= 9
	 * 	-columna_inicial >= 0 && columna_inicial <= 9
	 * 	-fila_fin >= 0 && fila_fin <= 9
	 * 	-columna_fin >= 0 && columna_fin <= 9
	 * 
	 * Postcondiciones:La función devuelve 'true' si las casillas estan libres o devuelve 'false'
	 * si estas están ocupadas, el valor se pasa asociado al nombre.
	 */
	
	
	public boolean verificarEspacioLibre(int fila_inicial, int columna_inicial, int fila_fin, int columna_fin, Casilla tablero[][])
	{
		boolean ret = true;
		
		if (fila_inicial == fila_fin)
		{
			for(int i = 0; i < tablero.length; i++)
			{
				if (tablero[fila_inicial][i].getIdBarco() > 0)
					ret = false;
			}
		}
		else
		{
			for(int i = 0; i < tablero.length; i++)
			{
				if (tablero[i][columna_inicial].getIdBarco() > 0)
					ret = false;
			}
		}
		
		return ret;
	}
	
	/*
	 * colocarBarco
	 * 
	 * Interfaz
	 * Comentario: Esta función permite colocar un barco en el tablero. 
	 * Ocupando cada casilla con el Id del barco correspondiente.
	 * Cabecera: public void colocarBarco (int fila_inicial, int columna_inicial, int fila_fin, int columna_fin, Barco nave, Casilla tablero[][])
	 * 
	 * Entrada:
	 *  -fila_inicial
	 * 	-columna_inicial
	 * 	-fila_fin
	 * 	-columna_fin
	 * 	-nave (Barco)
	 * 	-tablero [][]
	 * 
	 * Precondiciones:
	 *  -fila_inicial == fila_fin || columna_inicial == columna_fin
	 * 	-fila_inicial >= 0 && fila_inicial <= 9
	 * 	-columna_inicial >= 0 && columna_inicial <= 9
	 * 	-fila_fin >= 0 && fila_fin <= 9
	 * 	-columna_fin >= 0 && columna_fin <= 9
	 * 	-nave != null
	 * 	-fila_fin - fila_inicial == nave.getSize() || columna_fin - columna_inicial == nave.getSize()
	 * 
	 */
	
	public void colocarBarco (int fila_inicial, int columna_inicial, int fila_fin, int columna_fin, Barco nave, Casilla tablero[][])
	{
		if (fila_inicial == fila_fin)
		{
			for(int i = columna_inicial; i <= columna_fin; i++)
			{
				
				try
				{
					tablero [fila_inicial][i].setIdBarco(nave.getID());
					tablero [fila_inicial][i].setAgua(false);
				}catch (ExcepcionCasilla error)
				{
					System.out.println("Error al colocar la nave.");
				}
				
			}
		}
		else
		{
			for(int i = fila_inicial; i <= fila_fin; i++)
			{
				try
				{
					tablero [i][columna_inicial].setIdBarco(nave.getID());
					tablero [i][columna_inicial].setAgua(false);
				}catch (ExcepcionCasilla error)
				{
					System.out.println("Error al colocar la nave.");
				}
				
			}
		}
	}
	
	
	/*
	 * validarCasillaDescubierta
	 * 
	 * Interfaz
	 * Comentario: Esta función comprueba si una casilla esta o no decubierta.
	 * Cabecera: public boolean validarCasillaDescubierta(int fila, int columna, Casilla tablero[][])
	 * 
	 * Entarada:
	 *  -fila 
	 *  -columna
	 *  -tablero[][]
	 *  
	 * Salida:
	 * 	-ret (boolean)
	 *  
	 * Precondiciones: 
	 * 	-fila >= 0 && fila <= 9
	 * 	-columna >= 0 && columna <= 9
	 * 
	 * Postcondiciones:
	 * 	-La función devuelve true si la casilla esta descubierta o false en caso contrario.
	 * 
	 */
	
	public boolean validarCasillaDescubierta(int fila, int columna, Casilla tablero[][])
	{ 
		boolean ret = true;
		
		if (tablero[fila][columna].getDescubierta())
			ret = false;
		
		return ret;
	}
	
	/*
	 * descubrirCasilla
	 * 
	 * Interfaz
	 * Comentario: Esta función descubre una casilla del tablero.
	 * Cabecera: public void descubrirCasilla(int fila, int columna, Casilla tablero[][])
	 * 
	 * Entarada:
	 *  -fila 
	 *  -columna
	 *  -tablero[][]
	 *  
	 * Precondiciones: 
	 * 	-fila >= 0 && fila <= 9
	 * 	-columna >= 0 && columna <= 9
	 * 	-La posición debe tener el valor descubierto a false
	 * 
	 */
	
	public void descubrirCasilla(int fila, int columna, Casilla tablero[][])
	{
		tablero[fila][columna].setDescubierta(true);
	}
	
	/*
	 * mostrarTablero
	 * 
	 * Interfaz
	 * Comentario: Esta función muestra un tablero por pantalla.
	 * Cabecera: public void mostrarTablero (Casilla tablero[][])
	 * 
	 * Entrada: 
	 * 	-tablero
	 * 
	 * Postcondiciones: Nada , solo se muestra un tablero por pantalla.
	 */
	
	public void mostrarTablero (Casilla tablero[][])
	{
		for(int i = 0; i < tablero.length; i++)
		{
			System.out.println();
			
			for (int j = 0; j < tablero[0].length; j++)
			{
				if (tablero[i][j].getDescubierta() == false)
					System.out.print("| |");
				else
				{
					if (tablero[i][j].getAgua())
						System.out.print("|A|"); 
					else
						if (tablero[i][j].getIdBarco() > 0);
							System.out.print("|"+tablero[i][j].getIdBarco()+"|");
				}
			}
		}
	}
	
	/*
	 * mostrarBarcosHundidos
	 * 
	 * Interfaz
	 * Comentario: Esta función muestra el nombre de las naves hundidas por pantalla.
	 * Cabecera: public void mostrarBarcosHundidos (Casilla tablero[][])
	 * 
	 * Entrada: 
	 * 	-tablero[][]
	 * 
	 * Postcondiciones: Nada, solo muestra el nombre de las naves hundidas por pantalla.
	 */
	
	public void mostrarBarcosHundidos (Casilla tablero[][], Barco naves[])
	{
		int recuento_espacios, recuento_aciertos;
		int numero_naves = naves.length;
		
		for(int b = numero_naves; b > 0; b--)
		{
			recuento_espacios = 0;
			recuento_aciertos = 0;
			
			for(int i = 0; i < tablero.length; i++)
			{
				for(int j = 0; j < tablero[0].length; j++)
				{
					if (tablero[i][j].getIdBarco() == b)
						recuento_espacios++;
					
					if (tablero[i][j].getDescubierta() == true && tablero[i][j].getIdBarco() == b)
						recuento_aciertos++;
				}
			}
			
			if (recuento_espacios == recuento_aciertos)
				System.out.println(naves[b-1].getNombre());
		}
		
	}
	
}
