package ejemploarreglos;


public class EjemploArreglos {

    public static void main(String[] args) {
        //1. Declaramos un arreglo de enteros
        int edades[];
        //2. Instanciamos el arreglo de enteros
        edades = new int[3];
        //3. Inicializamos los valores del arreglo de enteros
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        //Imprimimos los valores a la salida estandar
        //4. leemos los valores de cada elemento del arreglo
        System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2]);

        //1. Declaramos un arreglo de personas
        Persona personas[];
        //2. Instanciamos el arreglo de personas
        personas = new Persona[4];
        //3. Inicializamos los valores del arreglo de personas
        personas[0] = new Persona("Alvaro");
        personas[1] = new Persona("Raul");
        personas[2] = new Persona("Dani");

        //Imprimimos los valores a la salida estandar
        //4. leemos los valores de cada elemento del arreglo
        System.out.println("");
        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);

        //1. Arreglo de String, notacion simplificada
        String nombres[] = {"Alas", "Vero", "Uxu", "Lidiana"};
        //Imprimimos los valores a la salida estandar
        //2. Iteramos el arreglo de String con un for
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }
    }
}