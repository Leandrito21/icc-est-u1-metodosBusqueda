public class MetodosBusqueda {
    
    public int busquedaLineal(int[] arreglo, int numeroBuscado){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;

    }
}
