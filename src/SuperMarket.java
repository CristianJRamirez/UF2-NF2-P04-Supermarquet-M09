
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by 45858000w on 27/10/16.
 */
public class SuperMarket {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO AL PROGRAMA DE CRISTIAN JAVIER");
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el numero de cajas que tendras en el supermercado");
        int nCajas=sc.nextInt();

        Thread clientes[]= new Clientes[nCajas];

        for (int i = 0; i <nCajas ; i++) {
            clientes[i]=new Clientes(r,"Dionis"+i,)
        }

        System.out.println("FIN DEL PROGRAMA!");
    }

    public static void Ejemplo() throws InterruptedException {
        int argSize = 10;
        Cajas oc = new Cajas();

        Thread treballador[] = new Clientes[argSize];

        for (int i = 0; i < argSize; i++) {
            treballador[i] = new Clientes(i,i+1,oc);
            treballador[i].start();
        }
        for (int j = 0; j < argSize; j++) {
            treballador[j].join(); //todo add catch exception
        }
        oc.imprimirCola();
    }
}
