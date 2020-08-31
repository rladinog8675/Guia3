package guia3;

public class Pendulo {
    private double longitud;
    private double aceleracion;

    public Pendulo(double longitud, double aceleracion) {
        this.longitud = longitud;
        this.aceleracion = aceleracion;
    }
   
    public double PeriodoOsilacion(){
        return (2*Math.PI)*(Math.sqrt(aceleracion/longitud));
    }
    
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
}