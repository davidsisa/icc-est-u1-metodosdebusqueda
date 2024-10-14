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
    }
}
