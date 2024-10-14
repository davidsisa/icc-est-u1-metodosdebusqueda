import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Busqueda buscar = new Busqueda();
        Scanner leer = new Scanner(System.in);
        int[] array =  {10,20,30,40,50,60,70,80,90,100};
        buscar.printArreglo(array);
        System.out.println("Ingrese un valor para buscar en el arreglo");
        int buscarNumero = leer.nextInt();
        int posicion = buscar.busquedaSecuencial(array,buscarNumero);
        if (posicion == -1){
            System.out.println("El elemento no se encuentra en el arreglo 404");
        } else {
            System.out.println("El elemento se encuentra en la posicion: " + posicion);
        }
        int[] arrayG = new int[100000];
        for (int i = 0; i < arrayG.length; i++) {
            arrayG[i] = i + 1;  
        }
        System.out.println("Ingresar el elemento que quiere buscar en el arreglo");
        int buscarNumeroG = leer.nextInt();
        long starTime = System.nanoTime();
        int posicionG = buscar.busquedaBinaria(arrayG,buscarNumeroG);
        long endTime = System.nanoTime();
        long starTime2 = System.nanoTime();
        int posicionSecuencial = buscar.busquedaSecuencial(arrayG, buscarNumeroG);
        long endTime2 = System.nanoTime();
        long duracion = endTime - starTime;
        long duracion2 = endTime2 - starTime2;
        if (posicionG == -1){
            System.out.println("El elemento no se encuentra en el arreglo 404  Busqueda Binaria ");
        } else {
            System.out.println("El elemento se encuentra en la posicion con Busqueda Binaria: " + posicionG);
            System.out.println(duracion);
        }
        if (posicionG == -1){
            System.out.println("El elemento no se encuentra en el arreglo 404 Busqueda Secuencial");
        } else {
            System.out.println("El elemento se encuentra en la posicion con Busqueda Secuencial: " + posicionSecuencial);
            System.out.println(duracion2);
        }

    }
}
