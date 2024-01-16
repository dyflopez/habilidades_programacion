package Identificar.malas.practicas;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /**
         *
         * 1)  Variables mal nombradas
         * 2) resultado muchas veces declarado
         * 3) Se imprime muchas veces  --- sout  ( codigo Repetitivo)
         * 4) no se validan errores  , Division puede fallar try Catch
         * 5) muchos if
         * 6) Mezcla de idiomas  . en los mensajes y ortografia
         * 7) Codigo Quemado
         * 8)
         */
       int valor1=0;
       int valor2 = 0;

        Consumer<Integer> showMessage = (valor)-> System.out.println("el resultado es " +valor);

       Scanner capturaTeclado =  new Scanner(System.in);

        System.out.println("ingrese su operacion, 1) suma  2) resta 3) multiplicacion 4) division 5) salir");
        int opcion = capturaTeclado.nextInt();
        System.out.println("ingrese el primer valor 1");
        valor1=capturaTeclado.nextInt();
        /*System.out.println("ingrese el primer valor 2");
        valor2=capturaTeclado.nextInt();*/
        System.out.println("el valor de la variable 2 es  "+ valor2);
        try {
            switch (opcion) {
                case Constantes.OPERACION_SUMAR:
                    showMessage.accept(Calculadora.suma(valor1,valor2));
                    break;
                case Constantes.OPERACION_RESTA:
                    showMessage.accept(Calculadora.resta(valor1,valor2));
                    break;
                case Constantes.OPERACION_MULTIPLICACION:
                    showMessage.accept(Calculadora.multiplicacion(valor1,valor2));
                    break;
                case Constantes.OPERACION_DIVISION:
                    showMessage.accept(Calculadora.division(valor1,valor2));
                    break;
                default:
                    System.out.println("por favor trata de seleccionar otra operacion!!!--");
                    break;
            }
        }catch (Exception e){
            System.out.println( e.getMessage());
        }
    }
    public static void juniorSolution()
    {
        //KAREN Approve
        // Cambiar el nombre de las variables
        //
        int a = 2;
        int b = 2;
        int option = 0;

        int result = 0;
        String message = "the solucion is ";

        switch (option) {
            case 0:
                result = a + b;
                break;
            case 1:
                result = a - b;
                break;
            case 2:
                result = a * b;
                break;
            case 3:
                result = (b != 0) ? a / b : 0;
                break;
            case 4:
                System.out.println("en building....");
                return;
            default:
                System.out.println("por favor trata de seleccionar otra operacion!!!--");
                return;
        }

        System.out.println(message + result);
        System.out.println("ty");
    }

    public static  void juanRuaSolution()
    {
                int a = 0,b=0,o=3;
                var result=0;
                try {

                    switch (o){
                        case 0:
                            result = a + b;
                            break;
                        case 1:
                            result = a - b;
                            break;
                        case 2:
                            result = a * b;
                            break;
                        case 3:
                            result = a / b;
                            break;
                        case 4:
                            System.out.println("WIP....");
                        default:
                            System.out.println("Please try to select another operation!!!");
                    }
                    System.out.println("The result for the operation is: "+result);
                    System.out.println("Thank You! :D");
                }catch (Exception e){
                    System.out.println("A problem has occurred: "+ e.toString());
                }

    }

    public static void aljandroVargas(){
                /**
                 *
                 * 1)  Variables mal nombradas
                 * 2) resultado muchas veces declarado
                 * 3) Se imprime muchas veces  --- sout  ( codigo Repetitivo)
                 * 4) no se validan errores  , Division puede fallar try Catch
                 * 5) muchos if
                 * 6) Mezcla de idiomas  . en los mensajes y ortografia
                 * 7) Codigo Quemado
                 * 8)
                 */

                int primernumero=5;
                int segundonumero=2;
                String operacion = "DIVISION"; /*SUMA, RESTA, MULTIPLICACION, DIVISION*/
                double resultado;

                switch (operacion) {
                    case "SUMA":
                        resultado = suma(primernumero,segundonumero);
                        mostrarResultado(resultado);
                        break;
                    case "RESTA":
                        resultado = resta(primernumero,segundonumero);
                        mostrarResultado(resultado);
                        break;
                    case "MULTIPLICACION" :
                        resultado = multiplicacion(primernumero,segundonumero);
                        mostrarResultado(resultado);
                        break;
                    case "DIVISION" :
                        resultado = division(primernumero,segundonumero);
                        mostrarResultado(resultado);
                        break;
                    default:
                        System.out.println("Operacion incorrecta");
                }
            }

            public static int suma(int primernumero, int segundonumero){
                return primernumero+segundonumero;
            }

            public static int resta(int primernumero, int segundonumero){
                return primernumero-segundonumero;
            }

            public static int multiplicacion(int primernumero, int segundonumero){
                return primernumero*segundonumero;
            }

            public static double division(int primernumero, int segundonumero){
                return primernumero/segundonumero;
            }

            public static void mostrarResultado(double resultado){
                System.out.println("El resultado de la operacion es: "+resultado);

    }


    public static  void mauricioVelez(){
        int number1 = 0;
        int number2 = 0;
        int operation = 0;
        String theSolution = "the solution is: ";
        String finalMessage = "";
        String notAllowed = "Operation not allowed!!!";
        String inBuilding = "in building....";
        String anotherOperation = "please try to choose another operation!!!--";
        var result = 0;


        switch (operation){
            case 0:
                result= number1+number2;
                finalMessage = theSolution + result;
                break;
            case 1:
                result =  number1-number2;
                finalMessage = theSolution + result;
                break;
            case 2:
                result =  number1*number2;
                finalMessage = theSolution + result;
                break;
            case 3:
                if (number2!=0){
                    result =  number1/number2;
                    finalMessage = theSolution + result;
                }else {
                    finalMessage = notAllowed;
                }
                break;
            case 4:
                finalMessage = inBuilding;
                break;
            default:
                finalMessage = anotherOperation;
                break;
        }

        System.out.println(finalMessage);

        System.out.println("ty");
    }


}