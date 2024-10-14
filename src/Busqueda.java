

public class Busqueda {
    public int busquedaSecuencial(int[] array, int valorBuscado){
        int pos = -1;
        //int cont = 0;
        for (int i = 0; i < array.length; i++) {
            //cont ++;
            //System.out.println("Comparaciones Secuencial: " + cont);
            if(array[i] == valorBuscado){
                pos = i;
                break;
            }
        }
        return pos;
    }
    public  void printArreglo (int[] array){
        for (Object elem : array) {
            System.out.println(elem + " ");
        }
    }
    public int busquedaBinaria(int[] array, int valorBuscado) {
        int inicio = 0;
        int fin = array.length - 1;
        //int cont = 0;
        
        while (inicio <= fin) { 
            int medio = inicio + (fin - inicio) /2;
            //cont ++;
            //System.out.println("Comparaciones Binaria: " + cont);
            if(array[medio] == valorBuscado){
                return medio;
            }
            if (array[medio] < valorBuscado){
                inicio = medio + 1; //Buscar en la mitad de la derecha
            }else{
                fin = medio - 1; //Buscar en la mitad de la izquierda
            }

        }
        return -1;
    }
}
