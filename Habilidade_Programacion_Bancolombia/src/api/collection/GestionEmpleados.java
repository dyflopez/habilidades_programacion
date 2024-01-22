package api.collection;

import java.util.ArrayList;
import java.util.List;

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

}
