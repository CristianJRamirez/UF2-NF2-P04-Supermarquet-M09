/**
 * Created by 45858000w on 27/10/16.
 */
public class Cajas {

//OBJETO COMPARTIDO

    int LONGITUD = 10;
    String[] cola = new String[LONGITUD];


    public void AñadirCola(int posicio, String nomcliente){
        this.cola[posicio] = nomcliente;
    }


    public void imprimirCola(){
        for(int i = 0; i < LONGITUD; i++){
            System.out.println("("+i+","+cola[i]+")");
        }
    }

}
