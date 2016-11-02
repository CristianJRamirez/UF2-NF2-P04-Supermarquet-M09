import java.util.Random;

/**
 * Created by 45858000w on 27/10/16.
 */
public class Clientes extends Thread{
//HILO
    public int Temps=0;
    public String Nombre=null;
    public Cajas Caja=null;
    public int posicion=0;
    String[] cola = new String[10];
    /*
    comprando -> th.sleep(random.int)
    en cola ->th.espera(cola)
    pagando -> th.paga(tiempo de compra);
    deja la caja
    */

    public Clientes(){
    }

    public Clientes(int temps, String nombre, Cajas  caja) {
        Temps = temps;
        Nombre = nombre;
        Caja = caja;
    }

    public int getTemps() {
        return Temps;
    }

    public void setTemps(int temps) {
        Temps = temps;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Cajas getCaja() {
        return Caja;
    }

    public void setCaja(Cajas caja) {
        Caja = caja;
    }




    public void run() {

        for (int i = 0; i < Temps; i++) {
            System.out.println("Esta comprando el cliente " + Nombre+ ", le quedan "+(Temps-i)+" segundos");
        }



        for(int j=0; j<=posicion; j++){
            Caja.AñadirCola(j,Nombre,cola);
        }

        Caja.imprimirCola();
    }
}

