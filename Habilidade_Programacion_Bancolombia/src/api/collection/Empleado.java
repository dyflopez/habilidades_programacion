package api.collection;

public class Empleado {
    /**
     * Crear atributos
     */
    private int identificacion;
    private String nombre;

    private String apellido;

    private int salario;

    String cargo ;

    /**
     * Constructor
     */
    public Empleado(int identificacion, String nombre, String apellido, int salario, String cargo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Empleado() {
    }

    /**
     *
     * Get and Set
     */
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
