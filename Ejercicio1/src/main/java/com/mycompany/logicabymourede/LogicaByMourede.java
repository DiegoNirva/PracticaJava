package com.mycompany.logicabymourede;

import java.util.Scanner;

// EJERCICIO:
// * - Crea ejemplos de funciones básicas que representen las diferentes
// *   posibilidades del lenguaje:
// *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
// * - Comprueba si puedes crear funciones dentro de funciones.
// * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
// * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
// * - Debes hacer print por consola del resultado de todos los ejemplos.
// *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
// *
// * DIFICULTAD EXTRA (opcional):
// * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
// * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
// *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
// *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
// *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
// *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
// *

public class LogicaByMourede {

    public static void main(String[] args) {
            //definimos la entreda de datos
            Scanner sc = new Scanner(System.in);
        //definimos variables
        System.out.println("Ingrese un texto");
        String texto1 = sc.nextLine();
        System.out.println("Ingrese otro texto");
                String texto2 = sc.nextLine();
        //definimos entero        
        int cont = metodoNumero(texto1, texto2);
        //mostramos en pantalla
        System.out.println("El numeros que no son multiplos de 3 y 5 son" + cont);
    }
    //metodos
    public static int metodoNumero(String texto1, String texto2) {
        //inicializamos una valiable local
        int acum = 0;
        //imprimir los numeros del 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("el numero es multiplo de 3 y 5 se muestran texto concatenados:" + texto1 + texto2);
            } else if (i % 3 == 0) {
                System.out.println("multiplo de 3 se muestra Texto 1:" + texto1);
            } else if (i % 5 == 0) {
                System.out.println("multiplo de 5 se muestra el Texto 2:" + texto2);
            } else {
                acum = acum + 1;
            }
        }
        return acum;
    }

}
