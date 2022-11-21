import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int menu,op;
        Scanner sc= new Scanner(System.in);
        Metodo metodos= new Metodo();

        do{
            System.out.println("=[ MENU ] =");
            System.out.println("1 --> DEPOSITAR");
            System.out.println("2 --> RETIRO");
            System.out.print("Ingrese una opcion : ");
            menu= sc.nextInt();

            while (menu<1||menu>2){
                System.out.println("Ingrese una opcion valida : ");
                menu= sc.nextInt();
            }

            switch (menu){
                case 1:
                    System.out.println("1");
                    metodos.Depoitar();
                    break;
                case 2:
                    System.out.println("2");
                    metodos.Retirar();
                    break;
            }
            System.out.print("Desea salir del programa 1 --> SI :");
            op=sc.nextInt();
        }while(op!=1);

    }
}
