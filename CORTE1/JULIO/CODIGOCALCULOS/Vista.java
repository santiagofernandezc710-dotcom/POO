public class Vista //Creo la clase Vista
{
    //Los colores
    public static final String BLANCO = "\u001B[37m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String ROJO = "\u001B[31m";
    public static final String MORADO = "\u001B[35m";
    public static final String RESET = "\u001B[0m";
    //Creo el metodo escribirNumero() para que el programa le diga al usuario que escriba el numero
    public void escribirNumero()
    {
        System.out.print(MORADO+"Escriba un numero.\nSi llega a ser decimal escriba con la (,):\n"+RESET);
    }

    //Creo el metodo escribirSalida(Numero resultado1) para que el programa imprima el resultado
    public void escribirSalida(Numero resultado1) //El metodo recibe el objeto con su parametro
    {
        System.out.println(AZUL+"El resultado es: "+ RESET + resultado1.getNumero()); //Solo muestra el resultado pidiendolo con un get
    }

    //Creo el metodo mostrarMenu() para que al Inicio de todo el usuario escoja una opcion
    public void mostrarMenu()
    {
        System.out.println(AMARILLO+"\n--- Menu de Suma ---"+RESET);
        System.out.println("1. Realizar una Suma");
        System.out.println("2. Realizar una Resta");
        System.out.println("3. Realizar una Multiplicacion");
        System.out.println("4. Realizar una Division");
        System.out.println("5. Salir");
        System.out.println("Seleccionar una opcion: ");
    }

    //Creo el metodo salirPrograma() para que si el usuario escribio 5 (salir del programa) aparezca impreso antes de que se salga
    public void salirPrograma()
    {
        System.out.println(MORADO+"Saliendo de la aplicacion..."+RESET);
    }

    //Creo el metodo mostrarDefault() por si el usuario no pone un numero valido
    public void mostrarDefault()
    {
        System.out.println(ROJO+"Opcion no valida. Por favor, intentede nuevo. Del 1 al 5"+RESET);
    }

    //Creo el errorDivision() por si en division el usuario dijita 0 en el numero 2
    public void errorDivision() 
    {
        System.out.println(ROJO+"Error: No es posible dividir entre cero."+RESET);
    }
}
