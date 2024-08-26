package imperativa.tiposdedatos;

public class ByteShortLongYTamano {
public static void main(String[] args) {
    //Byte - 8 bits
    //Clase Wrapper de Byte
    System.out.println("Rango de valor del byte: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
    
    //Primitivo de Byte
    byte MIN_VALUE = -128;
    byte MAX_VALUE = 127;
    
    //Short - 16 bits
    //Clse Wrapper de Short
    System.out.println("Rango de valor del byte: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);

    //Primitivo de Short
    short MIN_VALUE = -32768;
    short MAX_VALUE = 32767;

    //Integer - 32 bits 
    //Clase Wrapper de Integer
    System.out.println("Rango de valor del byte: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

    //Primitivo de Integer
    int MIN_VALUE = -2147483648;
    int MAX_VALUE = 2147483647; 

    //Long - 64 bits
    //Clase Wrapper de Long 
    System.out.println("Rango de valor del byte: " + Long.MIN_VALUE + " " + Long.MAX_VALUE);

    long valueLong = 2147483647 //detecta que es un numero chico para un long entonces en realidad le asigna un int
    //long valueLong = 214748364L si queres que realmente use long debes colocarle una L mayuscula al final
    //si estas usando int y supera el limite, da error

    //Como se define una constante: 
    final long SCREAMER_CAMEL_CASE = 2147483647;
}
}
