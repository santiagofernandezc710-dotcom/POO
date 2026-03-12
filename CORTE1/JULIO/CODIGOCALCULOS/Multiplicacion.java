public class Multiplicacion extends Operacion //Creo la clase Suma que compartira los atributos de Operacion
{
   //Metodo constructor
    public Multiplicacion(double n1,double n2)
    {
        super(n1,n2);
    }
    @Override 
    public double calcular()
    {
        return n1 * n2;
    }
}
