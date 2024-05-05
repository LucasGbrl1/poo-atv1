
public class Velmed
{
    double distancia;
    double tempo;
    
    public Velmed() {
        this.distancia = 0;
        this.tempo = 0;
    }
    
    public Velmed(double distancia, double tempo)
    {
        this.distancia = distancia;  
        this.tempo = tempo;
    }

    public double calcular()
    {
        if (this.distancia <= 0 || this.tempo <= 0)
            return 0;
        return this.distancia / this.tempo;
    }
    
    public String interpretar()
    {
        String resultado = "";
        double velmed = this.calcular();
        if (velmed == 0)
            resultado += "Parado";
        else if (velmed < 1)
            resultado += "Lento";
        else if (velmed < 300)
            resultado += "rapido";
        return resultado;
    }
}
