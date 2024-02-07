package retosdeprogramacion.estructurasdedatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
        /*
        Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización
 *   y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
 *   y a continuación los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no númericos y con más
 *   de 11 dígitos (o el número de dígitos que quieras).
 * - También se debe proponer una operación de finalización del programa.
         */
        Scanner entrada = new Scanner(System.in);

   //estructura de datos a utilizar.
        Map<String, Long>agendaContactos = new HashMap<>();
        int opcion = 0; //para opcion y bandera del bucle
        do {
            System.out.println("Ingrese:"+"\n"+"1) Insertar contacto"+"\n"+"2)Editar contacto"+"\n"+"3)Buscar contacto"+"\n"+"4)Eliminar contacto"+"\n"+"5)Mostar contactos"+"\n"+"6)salir");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1: crearOActualizarContacto(agendaContactos);
                    System.out.println("-----------------------");
                break;
                case 2: crearOActualizarContacto(agendaContactos);
                    System.out.println("el contacto se actualizo");
                    System.out.println("-----------------------");
                    break;
                case 3: buscarContacto(agendaContactos);
                    System.out.println("-----------------------");
                break;
                case 4: eliminarContacto(agendaContactos);
                    System.out.println("-----------------------");
                break;
                case 5: mostrarContacto(agendaContactos);
                    System.out.println("-----------------------");
                break;
                default:

            }
        }while (opcion !=6);
    entrada.close();
    }

    //METODOS
    //insertar datos
    static void crearOActualizarContacto(Map<String, Long>mapa){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el nombre");
        String nombre = in.nextLine();
        String numeroStr;
        long numero = 0;
        boolean valido = true; //usamos una bandera para salir del bucle
        do {
            System.out.println("Ingresa el telefono, maximo 10 digitos");
            numeroStr = in.nextLine();
            if (numeroStr.length() <=10){  //primero validamos si tiene 10 digitos
                try{
                     numero = Long.parseLong(numeroStr); //realizamos casteo
                    valido = false;
                }catch (NumberFormatException e){
                    System.out.println("---------ERROR---------------");
                    System.out.println("Ingrese      solo     numeros");
                    System.out.println("-----------------------------");
                }
            }
            else {
                System.out.println("---------ERROR---------------");
                System.out.println("Ingrese solo hasta 11 numeros");
                System.out.println("-----------------------------");
            }

        }while (valido);

    //agregamos a la lista
    mapa.put(nombre, numero);
    in.close();
    }

    //busqueda
    static void buscarContacto(Map<String, Long>mapa){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el nombre a buscar");
        String nombre = in.nextLine();
        if(mapa.get(nombre) != null){
            System.out.println("Nombre:"+nombre+" Telefono:"+ mapa.get(nombre));
        }
        else {
            System.out.println("El contacto no exite");
        }
    }
    //eliminar
    static void eliminarContacto(Map<String, Long>mapa){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el nombre a eliminar");
        String nombre = in.nextLine();
        if(mapa.get(nombre) != null){  //buscamos nombre y eliminamos
            mapa.remove(nombre);
            System.out.println("Se elimino el contacto");
        }
        else {
            System.out.println("El contacto no exite");
        }
        in.close();
    }
    //ver contactos
    static void mostrarContacto(Map<String, Long>mapa){
       for(String clave: mapa.keySet()){
           Long valor = mapa.get(clave);
           System.out.println("Nombre:"+clave+" Telefono:"+valor);
        }
    }


}
