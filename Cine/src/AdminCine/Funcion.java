package AdminCine;

public class Funcion {
    private String nombreFuncion;
    private int salaFuncion;
    private int numeroFuncion;
    private int precioFuncion;

    public Funcion(String nombreFuncion) {
    }

    public Funcion(String nombreFuncion, int salaFuncion, int numeroFuncion, int precioFuncion) {
        this.nombreFuncion = nombreFuncion;
        this.salaFuncion = salaFuncion;
        this.numeroFuncion = numeroFuncion;
        this.precioFuncion = precioFuncion;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public int getSalaFuncion() {
        return salaFuncion;
    }

    public void setSalaFuncion(int salaFuncion) {
        this.salaFuncion = salaFuncion;
    }

    public int getNumeroFuncion() {
        return numeroFuncion;
    }

    public void setNumeroFuncion(int numeroFuncion) {
        this.numeroFuncion = numeroFuncion;
    }

    public int getPrecioFuncion() {
        return precioFuncion;
    }

    public void setPrecioFuncion(int precioFuncion) {
        this.precioFuncion = precioFuncion;
    }
    
}
