import java.util.Random;

/**
 * Created by 45858000w on 27/10/16.
 */
public class Clientes extends Thread{
//HILO
    public int Temps=0;
    public String Nombre=null;
    public Cajas Caja=null;

    /*
    comprando -> th.sleep(random.int)
    en cola ->th.espera(cola)
    pagando -> th.paga(tiempo de compra);
    deja la caja
    */

    public Clientes(){
    }

    public Clientes(int temps, String nombre, Cajas caja) {
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
        System.out.println("Estoy trabajando");
        Random rd = new Random();
        System.out.println(rd.nextInt(10));
        for(int j=posicion_ini; j<posicion_fin; j++){
            oc1.AñadirCola(rd.nextInt(10),j,this.getName());
        }
    }
}

