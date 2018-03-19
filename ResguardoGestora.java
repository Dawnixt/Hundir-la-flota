
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
	
}
