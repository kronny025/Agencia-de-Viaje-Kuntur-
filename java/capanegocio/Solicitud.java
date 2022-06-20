
package capanegocio;

public class Solicitud {
    // atributos
    private String numeroSol;
    private String datalles;
    private String tipo;
    private String nombre;

    public String getNumeroSol() {
        return numeroSol;
    }

    public void setNumeroSol(String numeroSol) {
        this.numeroSol = numeroSol;
    }

    public String getDatalles() {
        return datalles;
    }

    public void setDatalles(String datalles) {
        this.datalles = datalles;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
