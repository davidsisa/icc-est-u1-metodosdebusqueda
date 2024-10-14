import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Busqueda buscar = new Busqueda();
        Scanner leer = new Scanner(System.in);
        int[] array =  {10,20,30,40,50,60,70,80,90,100};
        buscar.printArreglo(array);
    }
}
