package dawnixt.hundirlaflota.clases;

/*
 * Nombre del programa: Hundir la flota
 * 
 * Comentario: Este programa implementa el juego hundir la flota
 * 
 * Analisis: 
 * 1º Los jugadores tendrán el mismo número de barcos.
 * 2º Los barcos no se podrán poner en diagonal ni uno encima de otro.
 * 3º Los barcos no podrán ser de más de 5 piezas 
 * 4º No podrá haber más de 10 barcos ni menos de 1
 * 
 * Entradas:
 * 
 * El número de barcos
 * int fila
 * char columna
 * El nombre del barco
 * El nombre del jugador
 * El tamaño del barco
 * 
 * Salidas:
 * 
 * Mensajes de comunicación con el usuario
 * 
 * Restricciones:
 * 
 * numeroBarco >= 1 y numeroBarco <= 10
 * fila >= 1 y fila <= 10
 * columna de la ‘A’ a la ‘J’.  
 * size >= 1 y size <= 5
 * 
 * P.G.
 * 
 * Inicio
 * 
 * 	Repetir
 * 
 * 		Mostrar menus y leer y validar opcion 
 * 
 * 		Segun opcion
 * 
 * 			Caso 1
 * 				Jugador contra jugador
 * 			
 * 			Caso 2
 * 				Jugador contra maquina
 * 
 * 			Caso 3
 * 
 * 				Normas
 * 	
 * 	Mientras(opción !=0)
 * 
 * Fin
 * 
 * 
 * Jugador contra jugador 
 * 
 * Inicio
 * 
 * 		Leer y validar nombre del jugador 
 * 	
 * 		Leer y validar el numero de barcos
 * 
 * 		Para (i=numero barcos; mientras i>0; i--)
 * 
 * 			Leer y validar nombreBarco
 * 
 * 			Crear barco
 * 
 *			Leer y validar coordenadas del barco			
 * 			
 * 			Colocar barco
 * 
 * 		Fin_Para
 * 
 * 		Repetir
 * 
 * 			Leer y validar bombardeo
 * 
 * 			Descubrir posicion
 * 
 * 			Comprobar bajas
 * 
 * 			Si final=false
 * 
 * 				Cambiar jugador
 * 
 * 			Fin_Si 
 * 
 * 		Mientras final=false
 * 
 * 		Mostrar ganador
 * 
 * Fin
 * 
 * Jugador contra maquina
 * 
 * Inicio 
 * 
 * 		Leer y validar el numero de barcos 
 * 
 * 		Para (i=2;mientras i>0; i--)
 * 
 * 			Leer y validar nombres
 * 
 * 			Colocar barco
 * 
 * 		Fin_Para
 * 
 * 		Repetir
 * 
 * 			Leer y validar bombardeo
 * 
 * 			Descubrir posicion
 * 
 * 			Comprobar bajas
 * 
 * 			Si final=false
 * 
 * 				Cambiar jugador
 * 
 * 			Fin_Si
 * 
 * 		Mientras final=false
 * 
 *  	Cambiar jugador
 *  
 *  Fin
 * 
 */
import java.util.Scanner;
public class Hundirlaflota {
	
	public static void menuprincipal() {
		
		
		Scanner leer= new Scanner(System.in);
	
		
			System.out.println("\r\n" + 
					" _   _                 _ _        _        ______ _       _        \r\n" + 
					"| | | |               | (_)      | |       |  ___| |     | |       \r\n" + 
					"| |_| |_   _ _ __   __| |_ _ __  | | __ _  | |_  | | ___ | |_ __ _ \r\n" + 
					"|  _  | | | | '_ \\ / _` | | '__| | |/ _` | |  _| | |/ _ \\| __/ _` |\r\n" + 
					"| | | | |_| | | | | (_| | | |    | | (_| | | |   | | (_) | || (_| |\r\n" + 
					"\\_| |_/\\__,_|_| |_|\\__,_|_|_|    |_|\\__,_| \\_|   |_|\\___/ \\__\\__,_|\r\n" + 
					"                                                                   \r\n" + 
					"                                                                   \r\n" + 
					"");
			System.out.println("Presione cualquier boton para continuar");
			
			leer.nextLine();
	}
	
	public static void menu() {
		
		System.out.println("***********************");
		System.out.println("Pulse 1 para jugar contra otro jugador");
		System.out.println("Pulse 2 para jugar contra la maquina");
		System.out.println("Pulse 3 para ver las normas");
		System.out.println("Pulse 0 para salir");
		System.out.println("***********************");
	}
	
	public static void normas() {
		
		System.out.println("**A continuacion se mostraran las normas del juego**");
		System.out.println("1º Los jugadores tendrán el mismo número de barcos.\r\n" + 
				"2º Los barcos no se podrán poner en diagonal ni uno encima de otro.\r\n" + 
				"3º Los barcos no podrán ser de más de 5 piezas \r\n" + 
				"4º No podrá haber más de 10 barcos ni menos de 1\r\n"+
				"5ºCada jugador dispone de un turno de disparo que se irá alternando\r\n"+
				"Para hacerlo dirá las coordenadas. Por ejemplo “B3”, significa que su disparo corresponde a la casilla que se encuentra en esa coordenada. ");
	}

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		int numBarcos;
		int fila_inicial, fila_final;
		char columna_inicial ,columna_final ;
		String nombreBarco;
		String nombreJugador1;
		String nombreJugador2;
		int size;
		int opcion;
		Casilla tablero1[][] = new Casilla[10][10];
		Casilla tablero2[][] = new Casilla[10][10];
		GestoraTablero gestora = new GestoraTablero();
		
		//Mostrar menus y leer y validar opcion 
		do {
			menuprincipal();
			menu();
			opcion=leer.nextInt();
		}
		while(opcion==0);
		
		switch (opcion) {
		 	
			case 1:
				
				//Jugador contra jugador 
				
				//Leer y validar nombre del jugador
				
				System.out.println("Cual es el nombre que quiere tener el jugador 1?");
				
				nombreJugador1=leer.nextLine();
				
				System.out.println("Cual es el nombre que quiere tener el jugador 2?");
				
				nombreJugador2=leer.nextLine();
				
				//Leer y validar numero de barcos
				
				System.out.println("Con cuantos barcos quieren jugar? (recuerden que no se puede tener mas de 10 barcos)");
				
				numBarcos=leer.nextInt();
				
				Barco arrayBarco[]= new Barco[numBarcos];
				
				for(int i=numBarcos; i>0; i--) {
					
					for(int j=0; j<numBarcos; j++) {
						//Leer y validar nombreBarco
						System.out.println("Que nombre quiere que tenga el barco?");
						
						nombreBarco=leer.nextLine();
						
						System.out.println("Cual es el tamaño que deberia de tener este barco?");
						
						size=leer.nextInt();
						
						arrayBarco[j]= new Barco(nombreBarco, size);
					}
					
					System.out.println("A continuacion se les mostrara el tablero y con el debera de colocar sus barcos");
					
					do {
					
					gestora.mostrarTablero(tablero1);
					
					//Leer y validar coordenadas del barco	
					
					System.out.println("Digame la fila inicial donde colocara el barco");
					
					fila_inicial=leer.nextInt();
					}
					
					while(fila_inicial>10 && fila_inicial<0);
					
					do {
						
						System.out.println("Digame la columna donde quiere inicial donde quiere colocar el barco");
						
						columna_inicial=leer.next().charAt(0);
						
						columna_inicial=Character.toUpperCase(columna_inicial);
						
						if(columna_inicial<'A' && columna_inicial>'J') {
							
							gestora.mostrarTablero(tablero1);
							
						}
					
					}
					
					//hacer un do while para filas y columnas iguales
					while(columna_inicial<'A' && columna_inicial>'J');
					
					do {
						System.out.println("Digame la fila final del barco");
						
						fila_final=leer.nextInt();
						
						if(fila_final<0 && fila_final>10) {
							
							gestora.mostrarTablero(tablero1);
							
						}
						
					}
					
					while(fila_final<0 && fila_final>10);
					
					do {
					
						System.out.println("Digame la columna final del barco");
						
						columna_final=leer.next().charAt(0);
						
						columna_final=Character.toUpperCase(columna_final);
						
						if(columna_inicial<'A' && columna_inicial>'J') {
							
							gestora.mostrarTablero(tablero1);
							
						}
					
					}
					
					while (columna_inicial<'A' && columna_inicial>'J');
					
					//Colocar Barcos
					
					for(int z=0; z<numBarcos; z++) {
						
						gestora.colocarBarco(fila_inicial, columna_inicial, fila_final, columna_final, arrayBarco[z], tablero1);
						
					}
					
				}
				
			case 2:
				
				//Jugador contra jugador 
				
				//Leer y validar numero de barcos
				
				System.out.println("Con cuantos barcos quiere jugar? (recuerda que como mucho puedes tener 10)");
				
				numBarcos=leer.nextInt();
				
				System.out.println("En construccion");
				
			case 3:
				
				normas();
				
				System.out.println("En construccion");
		}

	}

}
