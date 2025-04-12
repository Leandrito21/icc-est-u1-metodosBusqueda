import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda resultado = new MetodosBusqueda();

        //int[] arreglo = {-1, 1, 4, 6, 7, 9, 8};
        int[]arreglo = new int[10];
        for (int i= 0; i < arreglo.length; i++){
            arreglo[i]= (int) (Math.random() * 10) +1;
            
        }
        
        System.out.println("El arreglo es: ");
        System.out.println(Arrays.toString(arreglo));

        int numeroBuscado = 6;
        
        // Llamar al método de búsqueda lineal
        int indiceEncontrado = resultado.busquedaLineal(arreglo, numeroBuscado);

        if (indiceEncontrado != -1) {
            System.out.println("El numero " + numeroBuscado + " se encontró en el índice " + indiceEncontrado);
        } else {
            System.out.println("El numero " + numeroBuscado + " no se encontró en el arreglo, ya que no existe en el mismo.");
        }
    }
}
