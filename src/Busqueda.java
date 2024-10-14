public class Busqueda {
    public int busquedaSecuencial(int[] array, int valorBuscado){
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == valorBuscado){
                pos = i;
            }
        }
        return pos;
    }
    public  void printArreglo (int[] array){
        for (Object elem : array) {
            System.out.println(elem + " ");
        }
    }
}
