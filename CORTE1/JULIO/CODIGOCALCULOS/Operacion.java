//Creo una clase llamada Operacion que le heredara los atributos a todas las subclases
public abstract class Operacion
{
    protected double n1;
    protected double n2;

    public Operacion(double n1, double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    public abstract double calcular();
}