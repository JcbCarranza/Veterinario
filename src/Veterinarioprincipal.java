import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veterinarioprincipal {

	public static void main(String[] args) {
		// variables
		int clavemascota;
		String nombremascota;
		String Especie;
		int edad;
		int menu, submenu, indice;
		
		//variables de objetos
		Mascotas mascota = null;
		Scanner lectura = null;
		
		List <Mascotas> lista = new ArrayList<Mascotas>();
		
		do {
			System.out.println("Bienvenido");
			System.out.println("1- - Subir");
			System.out.println("2- - - Mostrar");
			System.out.println("3- - - Buscar");
			System.out.println("4- - - Editar");
			System.out.println("5- - - Eliminar");
			System.out.println("6- - - buscar por nombre de macotas");
			System.out.println("7- - - buscar por especies");
			System.out.println("8- - - Eliminar por nombre de mascota");
			System.out.println("9- - - salir");
			
			
			//da lectura al menu
			
			lectura = new Scanner(System.in);
			menu = lectura.nextInt();
				
			switch (menu) {
			case 1:
				
				//para evitar cierre del programa en caso de errores utilizamos el try
				try {
					System.out.println("Ingresa la clave de mascota:");
					lectura = new Scanner(System.in);
					clavemascota = lectura.nextInt();
					
					System.out.println("Ingresa el nombre de mascota:");
					lectura = new Scanner(System.in);
					nombremascota = lectura.nextLine();
					
					System.out.println("Ingresa la Especie de mascota:");
					lectura = new Scanner(System.in);
					Especie = lectura.nextLine();
					
					System.out.println("Ingresa la edad de la mascota:");
					lectura = new Scanner(System.in);
					edad = lectura.nextInt();
					
					//se pondra el objeto, se uso el consructor con todo los parametros
					mascota = new Mascotas(clavemascota, nombremascota, Especie, edad);
					
					//guardar en la lista
					lista.add(mascota);
					System.out.println("Mascota en la base de datos");
				} catch (Exception e) {
					//mostrara el mensaje de error
					System.out.println("Error al Registrar, Ingresa nuevamente" +e.getMessage());
				}
				
				break;
			case 2:
				System.out.println(mascota);
				break;
			case 3:
				
				try {
					System.out.println("Listado de Juegos");
					for(int i=0; i<lista.size();i++) {
						System.out.printf("\n[%d]"+lista.get(i).getNombremascota(),i);
					}
					
					
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					//busca
					lista.get(indice);
					mascota = lista.get(indice);
					System.out.println("se encontro en la lista"+ mascota);
				} catch (Exception e) {
					System.out.println("Error, Intentalo Nuevamente" +e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Registro de la lista indice");
					for(int i=0; i<lista.size();i++) {
						System.out.printf("\n[%d]"+lista.get(i).getNombremascota(),i);
					}
					System.out.println("Listado de Juegos");
					
					
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					//busca
					lista.get(indice);
					mascota = lista.get(indice);
					System.out.println("se encontro en la lista"+ mascota.getNombremascota()+ "a editar");
					
					do {
						System.out.println("Submenu para editar");
						System.out.println("1--- Clave de macota");
						System.out.println("2--- Nombre de mascota");
						System.out.println("3--- especie");
						System.out.println("4--- edad");
						System.out.println("5--- Salir al menu");
						
						lectura = new Scanner(System.in);
						submenu = lectura.nextInt();
			switch (submenu) {
			case 1:
				System.out.println("Ingresa la nuevo clave de la mascota");
				lectura = new Scanner(System.in);
				clavemascota = lectura.nextInt();
						
				mascota.setClavemascota(clavemascota);
				break;

			case 2:
				System.out.println("Ingresa el nuevo nombre de la mascota");
				lectura = new Scanner(System.in);
				nombremascota = lectura.nextLine();
				
				mascota.setNombremascota(nombremascota);
				break;
			case 3:
				System.out.println("Ingresa la nuevo Especie de mascota");
				lectura = new Scanner(System.in);
				Especie = lectura.nextLine();
				
				mascota.setEspecie(Especie);
				
				break;
			case 4:
				System.out.println("Ingresa la edad de la mascota");
				lectura = new Scanner(System.in);
				edad = lectura.nextInt();
				
				mascota.setEdad(edad);
				System.out.println("se cambio con exito");
				break;
			case 5:
				
				break;
				
			}
						
					} while (submenu<5);
					
					
				} catch (Exception e) {
					System.out.println("Ocurrio un Error, vuelvelo a intentar" +e.getMessage());
				}
				break;	
			case 5:
				System.out.println("Registro de la lista indice de mascota");
				for(int i=0; i<lista.size();i++) {
					System.out.printf("\n[%d]"+lista.get(i).getNombremascota(),i);
				}
				System.out.println("Registro para eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				
				
				lista.remove(indice);
				System.out.println("Se borro con exito el dato");
				try {
					System.out.println("Registro de la lista indice");
					for(int i=0; i<lista.size();i++) {
						System.out.printf("\n[%d]"+lista.get(i).getNombremascota(),i);
					}
					System.out.println("Registro para eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//eliminacion
					lista.remove(indice);
					System.out.println("Se borro con exito el dato");
				} catch (Exception e) {
					System.out.println("Ocurrio un Error, vuelvelo a intentar" +e.getMessage());
				}
				
				break;
			case 6:
				System.out.println("ingresa el nombre de mascota");
			lectura = new Scanner(System.in);
			nombremascota = lectura.nextLine();
			
				for (Mascotas V: lista) {
					if(V.getNombremascota().equals(nombremascota)) 
						System.out.println(V);
					
				}
	             break;
			
			case 7:
				System.out.println("ingresa la especie de la mascota");
				lectura = new Scanner(System.in);
				Especie = lectura.nextLine();;
				
					for (Mascotas V: lista) {
						if(V.getEspecie().equals(Especie)) 
							System.out.println(V);
						
					}
				break;
			case 8:
				System.out.println("Eliminar mascota por nombre");
				lectura = new Scanner(System.in);
				nombremascota = lectura.nextLine();
				
				for (int i =0; i<lista.size(); i++) {
					if (lista.get(i).getNombremascota()==(nombremascota))
						lista.remove(1);
					System.out.println(" eliminado correctamente");
				
			}
				break;
			case 9:
		
		break;
			}
			
		} while (menu<9);

}
}