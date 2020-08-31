package guia3;

public class Ascensor {
    private int numeroPisos;
    private int numeroSotanos;
    private int pisoActual;
    
    public Ascensor(int numeroPisos, int numeroSotanos) {
        this.numeroPisos = numeroPisos;
        this.numeroSotanos = numeroSotanos;
        this.pisoActual = 1;
    }
    
    public int TotalPisos(){
        return this.numeroPisos + this.numeroSotanos;
    }
   
    public int SubirPiso(){
        this.pisoActual = this.pisoActual + 1;
        if (pisoActual > this.numeroPisos) {
            this.pisoActual = this.pisoActual - 1;
            return 0;
        }
        else
        {
            if (this.pisoActual == 0) {
                this.pisoActual = this.pisoActual + 1;        
            }
            return this.pisoActual;
        }
    }
    
    public int BajarPiso(){
        this.pisoActual = this.pisoActual - 1;
        if (pisoActual < (this.numeroSotanos * -1)) {
            this.pisoActual = this.pisoActual + 1;
            return 0;
        }
        else
        {
            if (this.pisoActual == 0) {
                this.pisoActual = this.pisoActual - 1;        
            }
            return this.pisoActual;
        }
    }
    
    
    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int longitud) {
        this.numeroPisos = numeroPisos;
    }
    
    public int getNumeroSotanos() {
        return numeroSotanos;
    }

    public void setNumeroSotanos(int longitud) {
        this.numeroSotanos = numeroSotanos;
    }
    
    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int longitud) {
        this.pisoActual = pisoActual;
    }
}