package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    /**
     * Netec requeire una aplicacion  la cual pueda gestionar sus empleados
     *  nombre, apellido, salario, Cargo , identificacion
     * 1) Agregar
     * 2)listar
     * 3) buscar por identificacion
     * 4) listar empleados que ganen mas de un Salario minimo
     * 5) Simular aumento salarial
     * 6) filtrar por un cargo
     */

    public static void main(String[] args) {

        int option=0;
        Scanner capturaTeclado = new Scanner(System.in);

        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        do{
            System.out.println("----administrador de empleados------");
            System.out.println("1) Agregar un empleado");
            System.out.println("2) Listar");
            System.out.println("3) buscar por identificacion");
            System.out.println("4) listar empleados que ganen mas de 1 salario minimo");
            System.out.println("5) simular aumento salarial");
            System.out.println("6) Mostrar por cargo por cargo");
            System.out.println("7) cargar empleados");

            option = capturaTeclado.nextInt();

            switch (option){
                case 1:
                    var newEmpleadi = Utils.solicitarEmpleado();
                    gestionEmpleados.agregarEmpelado(newEmpleadi);
                    break;
                case 2:
                    gestionEmpleados.listarEmpelado();
                    break;
                case 3:
                    var id  = Utils.solicitarIdentificacion();
                    var empleeado = gestionEmpleados.obtenerPorIdentifiacion(id);
                    System.out.println(empleeado.toString());
                    break;
                case 4:
                    System.out.println("ingreso a la op 1");
                    break;
                case 5:
                    System.out.println("ingreso a la op 1");
                    break;
                case 6:
                    System.out.println("ingreso a la op 1");
                    break;
                case 7:
                    gestionEmpleados.seed();
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while (option!=0);


        Empleado empleado =  new Empleado(1,"Daniel","Florez",1000000,"Developer");
        Empleado empleado2 =  new Empleado(2,"Felipe","Lopez",2000000,"Data");
        Empleado empleado3 =  new Empleado(3,"Marcela","Surez",5000000,"Front end");
        Empleado empleado4 =  new Empleado(4,"Karen","Asprilla",7000000,"developer");

        List<Empleado>  empleadoList = new ArrayList<>();

        empleadoList.add( empleado);
        empleadoList.add( empleado2);
        empleadoList.add( empleado3);
        empleadoList.add( empleado4);

        System.out.println("impresion con forma 1 : For tradicional");
        for(int i = 0; i<empleadoList.size();i++){
            System.out.println(empleadoList.get(i).toString());
        }
        System.out.println("impresion con forma 2 : For Each");
        for (Empleado empleadoActual  : empleadoList  ) {
            System.out.println(empleadoActual.toString());
        }
        System.out.println("impresion con forma 4 : ForEach /Streams");
        empleadoList.forEach(employee -> System.out.println(employee.getCargo()));
        System.out.println("impresion con forma 5 : ForEach /Streams");
        empleadoList.forEach(System.out::println);
    }
}
