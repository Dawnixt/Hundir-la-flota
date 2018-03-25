
public class ResguardoGestora {

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
		boolean ret = false;
		
		System.out.println("En resguardo.");
		
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

		System.out.println("En resguardo.");
		
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
		boolean ret = false;
		
		System.out.println("En resguardo.");
		
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
	 * 
	 */
	
	public void descubrirCasilla(int fila, int columna, Casilla tablero[][])
	{ 
		System.out.println("En resguardo.");
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
		System.out.println("En resguardo.");
	}
	
	/*
	 * mostrarBarcosHundidos
	 * 
	 * Interfaz
	 * Comentario: Esta función muestra los nombres de los barcos hundugos.
	 * Cabecera: public void mostrarBarcosHundidos (Casilla tablero[][])
	 * 
	 * Entrada:
	 * 	-tablero[][]
	 * 
	 * Postcondiciones: Nada, solo se muestra nombres por pantalla.
	 */
	
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
	
	public void mostrarBarcosHundidos (Casilla tablero[][])
	{
		System.out.println("En resguardo.");
	}
	
}
