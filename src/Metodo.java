import java.sql.SQLOutput;
import java.util.Scanner;

public class Metodo {
    Scanner sc= new Scanner(System.in);


    cuenta pichichan = new cuenta();
    String cedula,cuentaa;
    double canitdad,totalDinero=0,retiro,saldo;
    public void Depoitar(){
        System.out.println("DEPOSITAR");
        System.out.println("Proceso para despositar.....");
        System.out.print("Ingrese su número de cedula : ");
        cedula= sc.next();
        System.out.print("Ingrese el numero de cuenta : ");
        cuentaa=sc.next();
        System.out.print("Ingrese la cantidad a depositar : ");
        canitdad=sc.nextDouble();
        totalDinero=totalDinero+canitdad;
    }

    public void Retirar(){
        System.out.println("RETIRAR");
        System.out.print("Ingrese la cantidad a retirar de la cuenta : ");
        retiro=sc.nextDouble();

        if (retiro > totalDinero){
            System.out.println("NO CUENT UN SALDO SUFICIENTE");
        }
        else {
           // System.out.print("Ingrese la cantidad a retirar de la cuenta : ");
            //retiro=sc.nextDouble();
            saldo=totalDinero-retiro;
            System.out.println("Su saldo en la cuent es : "+saldo);
        }
    }
}
