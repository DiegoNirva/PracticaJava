import java.util.*;

public class CollecionesDatos {

    //estructuras de datos simples.
    int vector[] = new int[10]; //en un vector es dimensional, su longitud esta definida, se recorre con un for
    int matriz[][] = new int[4][4]; //una matriz es bidimensional, su longitud igual es definida, se recorre con dos for (uno para las filas y otro para c/ columna)

    //estructuras de datos mas complejas con recorriglo for each
    List<String> SoyArrayList = new ArrayList<>();
    /*un arraylist es una implementacion de la clase list, pertenece a las collection, en un arraylist se permite valores duplicados y mantiene un orden
     posee los metodos, de tipo FIFO (first in, first out): */

    List<String>SoyLinkedList = new LinkedList<>();
     /*una linkedList, es una implementacion de la clase list, pertenece a las collection, un una linkedlist los elementos estan doblemente enlazados, permite duplicados
    y de tipo FIFO*/

    List<String>soyStack = new Stack<>();
    /*
    Implementa la interfaz List y representa una pila (LIFO - Last In, First Out).
     Es útil para implementar algoritmos que requieren un seguimiento de las operaciones más recientes.
     */

    /*METODOS PARA INSETAR, BUSCAR, ELIMINAR DATOS EN ARRAYLIST Y LINKEDLIST
    * INSERCCION:
    * add(objeto): inserta un objeto al arrayList al final de la lista
    * add(int index, objeto) inserta el objeto en un posicion especifica.
    *ELIMINACION:
    * remove(objeto) elimina el objeto dado
    * remove(inn index) elimina el objeto que esta en dicha posicion.
    * clear(); elimina toda la lista
    * BUSQUEDA.
    * get(int index) devuelve el objeto en dicha posicion.
    * indexOf(objeto) devuelve la posicion del primero objeto especificado
    * TAMAÑO
    * size() devuelve la cantidad de elementos en la lista
    *
    */

    Map<Integer,String> soyHashMap = new HashMap<>();
    /* el hashMap implementa la interfas Map, guarda los datos a traves de un par CLAVE, VALOR, no permite claves duplicadas.
     */
    Map<Integer,String> soyTreeMap = new TreeMap<>();
    /*Implementa la interfaz SortedMap
     y utiliza un árbol rojo-negro para almacenar pares clave-valor.
     Mantiene los elementos ordenados según las claves y se utiliza para diccionarios ordenados.
     */
    Map<Integer,String> soyLinkedHashMap = new LinkedHashMap<>();
    /*
    Implementa la interfaz Map y utiliza una lista doblemente enlazada para mantener el orden de inserción. Combina las características de HashMap y LinkedList.
     */
    /*    * METODOS.
    * put(K clave, V valor); agrela al mapa la clave (K), con su respectivo valor (V), si la clave existe reeemplaza su valor anterior es reeplazad
    * remove(Object clave); elimina la clave-valor del mapa.
    * get(Object clave): devuelve el valor del la clave mencionada.
    * containsKey(Object clave); devuelve true si la clave mencionada existe en el mapa.
    * containsValue(Object valor) devuelve true si el valor mencionada tiene una clave.
    */
    Set<String>soyHashSet = new HashSet<>();
    /*
    Implementa la interfaz Set y utiliza una tabla de hash internamente para almacenar elementos únicos.
    Es eficiente para verificar la existencia de un elemento y se utiliza para conjuntos no ordenados.
    */
    Set<String>soyTreeSet = new TreeSet<>();
    /*
    Implementa la interfaz SortedSet y utiliza un árbol rojo-negro para almacenar elementos únicos.
    Mantiene los elementos ordenados y se utiliza para conjuntos ordenados.
     */
    Queue<String>soyPriorityQueue = new PriorityQueue<>();
    /*
    Implementa la interfaz Queue y representa una cola de prioridad basada en un montículo. Los elementos se recuperan según su prioridad.
     */

}
