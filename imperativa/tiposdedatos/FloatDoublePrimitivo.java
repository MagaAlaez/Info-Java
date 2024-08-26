package imperativa.tiposdedatos;

public class FloatDoublePrimitivo {
public static void main(String[] args) {
    
    //float 32 bits
    float miMinimoValorDeFloat = Float.MIN_VALUE;
    float miMaximoValorDeFloat = 3.40f; //si quiero que obligatoriamente use un float, coloco la f al final. 

    //double 64 bits 
    double miMinimoValorDeDouble = Double.MIN_VALUE;
    double miMaximoValorDeDouble = Double.MAX_VALUE; 

    double valorConFloat = 3.40f; //float es del mismo tipo que el double, y el double contiene al float. Si no ponemos la f opta por el double, debido a que tiene mayor presicion al ser un valor con coma. 

}
}
