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
		GestoraTablero gestora = new GestoraTablero();
		Casilla tablero1[][] = new Casilla[10][10];
		
		System.out.println("**A continuacion se mostraran las normas del juego**");
		System.out.println("1º Los jugadores tendrán el mismo número de barcos.\r\n" + 
				"2º Los barcos no se podrán poner en diagonal ni uno encima de otro.\r\n" + 
				"3º Los barcos no podrán ser de más de 5 piezas \r\n" + 
				"4º No podrá haber más de 10 barcos ni menos de 1\r\n"+
				"5ºCada jugador dispone de un turno de disparo que se irá alternando\r\n"+
				"Para hacerlo dirá las coordenadas. Por ejemplo “B3”, significa que su disparo corresponde a la casilla que se encuentra en esa coordenada. ");
		System.out.println("El tablero de juego sera el siguiente:");
		
		gestora.mostrarTablero(tablero1);
		
		System.out.println("Las columnas seran letras desde la A hasta la J y las filas seran desde el 1 al 10");
	}

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		int numBarcos, barcosmuertos = 0;
		int fila_inicial, fila_final, fila_ataque, numcolumna = 0,numid = 0;
		char columna_inicial ,columna_final, columna_ataque=0 ;
		String nombreBarco;
		String nombreJugador1;
		String nombreJugador2;
		int size = 0, cantidad_espacios, espacios_acertados;
		int opcion;
		Casilla tablero1[][] = new Casilla[10][10];
		Casilla tablero2[][] = new Casilla[10][10];
		GestoraTablero gestora = new GestoraTablero();
		boolean finalturno, verificarBarco;
		
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
				
				do {
					
				System.out.println("Con cuantos barcos quieren jugar? (recuerden que no se puede tener mas de 10 barcos)");
				
				numBarcos=leer.nextInt();
			
				}	
				
				while(numBarcos<1 || numBarcos>10);
				
				Barco [] arrayBarco= new Barco[numBarcos];
				
				for(int i=numBarcos; i>0; i--) {
					
					for(int j=0; j<numBarcos; j++) {	
						//Leer y validar nombreBarco
						
						System.out.println("Que nombre quiere que tenga el barco?");
						
						nombreBarco=leer.nextLine();	
					
						if(numBarcos<5) {
							
							size=j+1;
						}
						else {
							
							if(numBarcos>5)
							
								size=5;
						}
					
					
						arrayBarco[j]= new Barco(nombreBarco, size);
					
					}
					
					System.out.println("A continuacion se les mostrara el tablero del jugador 1 y con el debera de colocar sus barcos");
					
					do {
					
						gestora.mostrarTablero(tablero1);
						
						do {
						
						//Leer y validar coordenadas del barco	
						
						System.out.println("Digame la fila inicial donde colocara el barco");
						
						fila_inicial=leer.nextInt();
						}
						
						while(fila_inicial>10 && fila_inicial<0);
						
						do {
							
							System.out.println("Digame la columna inicial donde quiere colocar el barco");
							
							columna_inicial=leer.next().charAt(0);
							
							columna_inicial=Character.toUpperCase(columna_inicial);
							
							if(columna_inicial<'A' && columna_inicial>'J') {
								
								gestora.mostrarTablero(tablero1);
								
							}
						
						}
						
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
							
							if(columna_final<'A' && columna_final>'J') {
								
								gestora.mostrarTablero(tablero1);
								
							}
						
						}
						
						while (columna_final<'A' && columna_final>'J');
						
						verificarBarco=gestora.verificarEspacioLibre(fila_inicial, columna_inicial, fila_final, columna_final, tablero1);
					
					}
					while(verificarBarco=false);
					
					//Colocar Barcos
					
					for(int z=0; z<numBarcos; z++) {
						
						gestora.colocarBarco(fila_inicial, columna_inicial, fila_final, columna_final, arrayBarco[z], tablero1);
						
					}
					
					System.out.println("El tablero del jugador 1 quedaria asi");
					
					for(int a=0; a<11; a++) {
						
						for(int j=0;j<11;j++) {
							
							tablero1[i][j].setDescubierta(true);
							
						}
					}
					gestora.mostrarTablero(tablero1);
						
					
					
					System.out.println("A continuacion se les mostrara el tablero del jugador 2 y con el debera de colocar sus barcos");
					do {
						
						gestora.mostrarTablero(tablero2);
						
						do {
						
						//Leer y validar coordenadas del barco	
						
						System.out.println("Digame la fila inicial donde colocara el barco");
						
						fila_inicial=leer.nextInt();
						}
						
						while(fila_inicial>10 && fila_inicial<0);
						
						do {
							
							System.out.println("Digame la columna inicial donde quiere colocar el barco");
							
							columna_inicial=leer.next().charAt(0);
							
							columna_inicial=Character.toUpperCase(columna_inicial);
							
							if(columna_inicial<'A' && columna_inicial>'J') {
								
								gestora.mostrarTablero(tablero2);
								
							}
						
						}
						
						while(columna_inicial<'A' && columna_inicial>'J');
						
						do {
							System.out.println("Digame la fila final del barco");
							
							fila_final=leer.nextInt();
							
							if(fila_final<0 && fila_final>10) {
								
								gestora.mostrarTablero(tablero2);
								
							}
							
						}
						
						while(fila_final<0 && fila_final>10);
						
						do {
						
							System.out.println("Digame la columna final del barco");
							
							columna_final=leer.next().charAt(0);
							
							columna_final=Character.toUpperCase(columna_final);
							
							if(columna_final<'A' && columna_final>'J') {
								
								gestora.mostrarTablero(tablero2);
								
							}
						
						}
						
						while (columna_final<'A' && columna_final>'J');
						
						verificarBarco=gestora.verificarEspacioLibre(fila_inicial, columna_inicial, fila_final, columna_final, tablero2);
					
					}
					while(verificarBarco=false);
					
					//Colocar Barcos
					
					for(int z=0; z<numBarcos; z++) {
						
						gestora.colocarBarco(fila_inicial, columna_inicial, fila_final, columna_final, arrayBarco[z], tablero2);
						
					}
		
				}
				
				do {
					
					//Leer y validar bombardeo
					
					for(int a=0; a<numBarcos; a++) {
						
						for(int j=0;j<numBarcos;j++) {
							
							tablero1[a][j].setDescubierta(false);
							
						}
					}
					
					for(int a=0; a<numBarcos; a++) {
						
						for(int j=0;j<numBarcos;j++) {
							
							tablero2[a][j].setDescubierta(false);
							
						}
					}
					
					do {
						gestora.mostrarTablero(tablero1);
					
						System.out.println("En que fila quieres bombardear?");
						
						fila_ataque=leer.nextInt();
					}
					while(fila_ataque<0 && fila_ataque>10);
						
					do {
						System.out.println("En que columna quiere atacar");
						
						columna_ataque=leer.next().charAt(0);
					}
					while(columna_ataque<'A' && columna_ataque>'J');
				
					
					if(columna_ataque=='A') {
						numcolumna=1;
						
					}
					else {
						
						if(columna_ataque=='B') {
							
							numcolumna=2;
						}
						
						else {
							
							if(columna_ataque=='C') {
								
								numcolumna=3;
							}
							
							else {
								
								if(columna_ataque=='D') {
									numcolumna=4;
								}
								
								else {
									
									if(columna_ataque=='E') {
										numcolumna=5;
									}
									
									else {
										
										if(columna_ataque=='F') {
											numcolumna=6;
										}
										
										else {
											
											if(columna_ataque=='G') {
												numcolumna=7;
											}
											
											else {
												
												if(columna_ataque=='H') {
													numcolumna=8;
												}
												
												else {
													
													if(columna_ataque=='I') {
														numcolumna=9;
													}
													
													else {
														numcolumna=10;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				
				gestora.descubrirCasilla(fila_ataque, columna_ataque, tablero2);
				
				gestora.mostrarTablero(tablero2);
				
				numid=tablero2[fila_ataque][numcolumna].getIdBarco();//preguntar a Yeray como iban las id de los barcos
				
				gestora.mostrarBarcosHundidos(tablero2, arrayBarco);
				
				for(int b = numBarcos; b > 0; b--)
				{
					cantidad_espacios = 0;
					espacios_acertados = 0;
					
					for(int i = 0; i < tablero2.length; i++)
					{
						for(int j = 0; j < tablero2[0].length; j++)
						{
							if (tablero2[i][j].getIdBarco() == b)
								cantidad_espacios++;
							
							if (tablero2[i][j].getDescubierta() == true && tablero2[i][j].getIdBarco() == b)
								espacios_acertados++;
						}
					}
					
					if (cantidad_espacios == espacios_acertados) {
						
						barcosmuertos++;
					}
						
				}
				
				if(barcosmuertos==numBarcos) {
					
					finalturno=true;
				}
				
				if(finalturno=false) {
					
				
						
						//Leer y validar bombardeo
						
						for(int a=0; a<numBarcos; a++) {
							
							for(int j=0;j<numBarcos;j++) {
								
								tablero1[a][j].setDescubierta(false);
								
							}
						}
						
						for(int a=0; a<numBarcos; a++) {
							
							for(int j=0;j<numBarcos;j++) {
								
								tablero2[a][j].setDescubierta(false);
								
							}
						}
						
						do {
							gestora.mostrarTablero(tablero1);
						
							System.out.println("En que fila quieres bombardear?");
							
							fila_ataque=leer.nextInt();
						}
						while(fila_ataque<0 && fila_ataque>10);
							
						do {
							System.out.println("En que columna quiere atacar");
							
							columna_ataque=leer.next().charAt(0);
						}
						while(columna_ataque<'A' || columna_ataque>'J');
					
					
						if(columna_ataque=='A') {
							numcolumna=1;
							
						}
						else {
							
							if(columna_ataque=='B') {
								
								numcolumna=2;
							}
							
							else {
								
								if(columna_ataque=='C') {
									
									numcolumna=3;
								}
								
								else {
									
									if(columna_ataque=='D') {
										numcolumna=4;
									}
									
									else {
										
										if(columna_ataque=='E') {
											numcolumna=5;
										}
										
										else {
											
											if(columna_ataque=='F') {
												numcolumna=6;
											}
											
											else {
												
												if(columna_ataque=='G') {
													numcolumna=7;
												}
												
												else {
													
													if(columna_ataque=='H') {
														numcolumna=8;
													}
													
													else {
														
														if(columna_ataque=='I') {
															numcolumna=9;
														}
														
														else {
															numcolumna=10;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					
					gestora.descubrirCasilla(fila_ataque, columna_ataque, tablero2);
					
					gestora.mostrarTablero(tablero2);
					
					numid=tablero1[fila_ataque][numcolumna].getIdBarco();//preguntar a Yeray como iban las id de los barcos
					
					for(int b = numBarcos; b > 0; b--)
					{
						cantidad_espacios = 0;
						espacios_acertados = 0;
						
						for(int i = 0; i < tablero2.length; i++)
						{
							for(int j = 0; j < tablero2[0].length; j++)
							{
								if (tablero2[i][j].getIdBarco() == b)
									cantidad_espacios++;
								
								if (tablero2[i][j].getDescubierta() == true && tablero2[i][j].getIdBarco() == b)
									espacios_acertados++;
							}
						}
						
						if (cantidad_espacios == espacios_acertados) {
							
							barcosmuertos++;
						}
							
					}
					
					if(barcosmuertos==numBarcos) {
						
						finalturno=true;
					}
					
					
					}
				}
				while(finalturno=false);
				
				break;
				
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
