//  BUSQUEDAD LINEAL O SECUENCIAL
import java.lang.reflect.Method;
import java.util.Arrays;

import controllers.MetodosBusqueda;
import controllers.MetodosBusquedaBinaria;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(107, "Pedro");

        //MetodosBusqueda mB = new MetodosBusqueda(personas);
        //mB.showPersonByName();
        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
        mBB.showPersonByCode();
        mBB.showPersonByName();



        /*
         * MetodosBusqueda resultado = new MetodosBusqueda(Persona[]);
         * 
         * //int[] arreglo = {-1, 1, 4, 6, 7, 9, 8};
         * int[]arreglo = new int[10];
         * for (int i= 0; i < arreglo.length; i++){
         * arreglo[i]= (int) (Math.random() * 10) +1;
         * 
         * }
         * 
         * System.out.println("El arreglo es: ");
         * System.out.println(Arrays.toString(arreglo));
         * 
         * int numeroBuscado = 6;
         * 
         * // Llamar al método de búsqueda lineal
         * int indiceEncontrado = resultado.busquedaLineal(arreglo, numeroBuscado);
         * 
         * if (indiceEncontrado != -1) {
         * System.out.println("El numero " + numeroBuscado +
         * " se encontró en el índice "
         * + indiceEncontrado);
         * 
         * } else {
         * System.out.println("El numero " + numeroBuscado +
         * " no se encontró en el arreglo, ya que no existe en el mismo.");
         * }
         */
    }

}
// En busqueda lineal no es necesario que el arreglo este ordenado 
//Pregunta de Prueba: ¿que es lo que hace que sean menos comparaciones?, que esta divido el arreglo 
//sacar la mitad (alto + bajo)/2 para cacular el idice del punto central del array