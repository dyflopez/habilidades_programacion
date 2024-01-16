package Identificar.malas.practicas;

public class Calculadora {

    public static int suma(int primerNumero, int segundoNumero){
        return primerNumero+segundoNumero;
    }

    public static int resta(int primerNumero, int segundoNumero){
        return primerNumero-segundoNumero;
    }

    public static int multiplicacion(int primerNumero, int segundoNumero){
        return primerNumero*segundoNumero;
    }

    public static int division(int primerNumero, int segundoNumero){
        // OP 1
        /*try{
            return primerNumero/segundoNumero;
        }catch (Exception e){
            throw new ArithmeticException("No se puede dividir por 0");
        }*/
        /* op 2
        if(segundoNumero!=0){
            return primerNumero/segundoNumero;
        }

        throw new ArithmeticException("No se puede dividir por 0");
*/
        // op 3
        if(segundoNumero==0){
            throw new ArithmeticException("No se puede dividir por 0");
        }

        return primerNumero/segundoNumero;

    }
}
