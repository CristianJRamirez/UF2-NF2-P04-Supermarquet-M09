
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
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
        System.out.println("Dime el numero de clientes que tendras en el supermercado");
        int nClientes=sc.nextInt();

        Cajas caja []= new Cajas[nCajas];

        Thread clientes[]= new Clientes[nClientes];

        for (int i = 0; i <nClientes ; i++) {
            Random rd = new Random();
            int tiempo=rd.nextInt(10);
            int numcaja=rd.nextInt(nCajas);
            System.out.println("El cliente Dionis "+i+" tarda en ir a la caja ["+numcaja+"] ->"+ tiempo);
            clientes[i]=new Clientes(tiempo,"Dionis"+i,caja[numcaja]);
            clientes[i].start();
        }





        System.out.println("FIN DEL PROGRAMA!");
    }
/*
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
    }*/
}
