package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GestionEmpleados {

    private List<Empleado> empleadoList = new ArrayList<>();



    public void agregarEmpelado(Empleado empleado){
        this.empleadoList.add(empleado);
    }

    public void listarEmpelado(){
        empleadoList.forEach(System.out::println);
    }

    public Empleado obtenerPorIdentifiacion(int identificacion){

        /*for (Empleado empleado:empleadoList) {
            if(empleado.getIdentificacion() == identificacion){
                return empleado;
            }
        }

        return new Empleado();*/

        /*var optinalEmployee =  empleadoList
                .stream()
                .filter(empleado -> empleado.getIdentificacion() == identificacion)
                .findFirst();

        if(optinalEmployee.isPresent()){
            return  optinalEmployee.get();
        }

        return  new Empleado();

         */

        return  empleadoList
                .stream()
                .filter(empleado -> empleado.getIdentificacion() == identificacion)
                .findFirst()
                .orElse(new Empleado());
                //.orElseThrow(new NoSuchFieldError("error"));



                //.orElseThrow(() -> new Exception());

    }

    public void seed (){
        this.empleadoList.add(  new Empleado(1,"Daniel","Florez",1000000,"Developer"));
        this.empleadoList.add(  new Empleado(2,"Felipe","Lopez",2000000,"Data"));
        this.empleadoList.add( new Empleado(3,"Marcela","Surez",5000000,"Front end"));
        this.empleadoList.add( new Empleado(4,"Karen","Asprilla",7000000,"developer"));
    }


    public List<Empleado> listarEmpleadosQueGanenMasDeUnSalarioMinimo(){
        return empleadoList
                .stream()
                //.filter(empleado -> empleado.getSalario()> Constantes.SALARIO_MINIMO)
                .filter(empleado -> Utils.validarMonto.test(empleado.getSalario()))
                .collect(Collectors.toList());
    }

    public List<Empleado> buscarPorCargo(String cargo){
        return empleadoList
                .stream()
                //.filter(empleado -> empleado.getCargo().equals(cargo))
                .filter(empleado -> empleado.getCargo().equalsIgnoreCase(cargo))
                .toList();
    }
    public List<Empleado> aumentoSalarial(){

       // List<Empleado> empleadosSimulados1 = empleadoList; //  OJO

        //List<Empleado> empleadosSimulados2 = List.of((Empleado) empleadoList);

        List<Empleado> empleadosSimulados2 = new ArrayList<>(empleadoList);

        List<Empleado> simulacionEmpleados = new ArrayList<>();

        // CASO 1
        for (Empleado empleado : empleadoList) {

            var salarioSumulado =this.calcularSalario(empleado.getSalario());

            empleado.setSalario(salarioSumulado);
            simulacionEmpleados.add(empleado);
        }

        //CASO 2
        for (int i =0; i<simulacionEmpleados.size();i++){
            var salarioSumulado =
                    simulacionEmpleados.get(i).getSalario()+(
                            simulacionEmpleados.get(i).getSalario()*Constantes.SIMULACION_AUMENTO_SALARIAL
                    )/100;
            simulacionEmpleados.get(i).setSalario(this.calcularSalario(simulacionEmpleados.get(i).getSalario()));

        }


        // Caso 3
        simulacionEmpleados = empleadoList
                            .stream()
                            .peek(
                                    empleado -> empleado.setSalario(calcularSalario(empleado.getSalario()))
                            )
                            .toList();


        return simulacionEmpleados;
    }


    public List<InformeEmpleado> crearInforme(){

        List<InformeEmpleado > informeEmpleados = new ArrayList<>();

        // OP 1
        for (Empleado empleado: empleadoList) {
            //metodo
            System.out.println(empleado.getNombre() + " " +  empleado.getApellido() + " " + empleado.getSalario());

            InformeEmpleado informeEmpleado = new InformeEmpleado(
                                                    empleado.getNombre() + " " +  empleado.getApellido(),
                                                        empleado.getIdentificacion()+"" ,
                                                                   empleado.getCargo());

            informeEmpleados.add(informeEmpleado);

        }

        // OP 2
        return empleadoList
                .stream()
                .map(empleado -> new InformeEmpleado(
                        empleado.getNombre()+ " " + empleado.getApellido(),
                        empleado.getIdentificacion()+"",
                        empleado.getCargo()
                    )
                )
                .peek(informe -> informe.getNombreCompleto().toUpperCase())
                .toList();



      //  return informeEmpleados;
    }

    private int calcularSalario(int salario ){

        return (salario + (salario*Constantes.SIMULACION_AUMENTO_SALARIAL)/100);
    }



}
