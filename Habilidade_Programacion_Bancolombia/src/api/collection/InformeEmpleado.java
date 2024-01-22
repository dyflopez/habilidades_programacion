package api.collection;

public class InformeEmpleado {

    private  String nombreCompleto;

    private String documento;

    private String cargo;

    public InformeEmpleado(String nombreCompleto, String documento, String cargo) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.cargo = cargo;
    }



    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
