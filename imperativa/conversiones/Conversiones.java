package imperativa.conversiones;

public class Conversiones {
public static void main(String[] args) {
    //Conversion del tipo promocion
    int value1 = 5; 
    System.out.println(value1);

    //Conversion del tipo contraccion
    int value2 = (int)5.69f; //entre parentesis encerramos el tipo de dato al que queremos convertir, toma la parte entera del float 
    System.out.println(value2);

    //Conversion del tipo implicita
    double value3 = 10 * 20.5d; //al operarado dos de distinto tipo (entero y double), optara por el de mayor precision (double)
    System.out.println(value3);
}
}
