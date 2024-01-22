package api.collection;

import java.util.Scanner;

public class Utils {

    public static Empleado solicitarEmpleado(){

        Scanner capturaTeclado = new Scanner(System.in);

        int identificacion;

        String nombre;

        String apellido;

        int salario;

        String cargo ;

        System.out.println("ingrese el nombre");
        nombre = capturaTeclado.next();

        System.out.println("ingrese el apellido");
        apellido = capturaTeclado.next();

        System.out.println("ingrese la identificacion");
        identificacion = capturaTeclado.nextInt();



        System.out.println("ingrese el salario");
        salario = capturaTeclado.nextInt();

        System.out.println("ingrese el cargo");
        cargo = capturaTeclado.next();


        return  new Empleado(identificacion,nombre,apellido,salario,cargo);

    }

    public static  int solicitarIdentificacion(){

        Scanner capturaTeclado = new Scanner(System.in);

        System.out.println("ingrese la identificacion");

        var identificacion = capturaTeclado.nextInt();

        return  identificacion;

    }

}
