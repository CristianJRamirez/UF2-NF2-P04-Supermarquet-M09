import java.util.Arrays;

/**
 * Created by 45858000w on 27/10/16.
 */
public class Cajas {

//OBJETO COMPARTIDO

    int LONGITUD = 10;
    String[] Cola =null;


    public void AñadirCola(int posicio, String nomcliente, String [] cola){
        this.Cola[posicio] = nomcliente;
        Cola= cola;
    }


    public void imprimirCola(){
        for(int i = 0; i < LONGITUD; i++){
            System.out.println("("+i+","+Cola[i]+")");
        }
    }

    @Override
    public String toString() {
        return "Cajas{" +
                "LONGITUD=" + LONGITUD +
                ", cola=" + Arrays.toString(Cola) +
                '}';
    }
}
