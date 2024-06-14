
import Rutas.Ruta;
import Rutas.VIP;
import Rutas.Normal;
public class Main {
    public static void main(String[] args) {
        Pasajero cliente1= new Pasajero(" Walter","Cobacango","Ponceano","0979376396",18);
        Pasajero cliente2= new Pasajero("Kevin","Mendoza","Vicentina","0984168469",34);
        Pasajero cliente3= new Pasajero("Richard","Acero","Zabala","0999999956",56);
        Pasajero cliente4= new Pasajero("Martha","Cobacango","Cancelen","09867543929",30);
        Pasajero cliente5= new Pasajero("Azucena","Acero","Cayambe","0995122669",53);

        Ruta ruta1 = new Ruta("Quito_Guayaquil", 20);
        Ruta ruta2 = new Ruta("Quito-Tulcán", 17.50);
        Ruta ruta3 = new Ruta("Quito-Puyo", 15);
        Ruta ruta4 = new Ruta("Quito-Riobamba", 17.50);
    }

    // Valores nulos de rutas y pasajeros

    Pasajero cliente6= new Pasajero();
    Pasajero cliente7= new Pasajero();
    Pasajero cliente8= new Pasajero();
    Pasajero cliente9= new Pasajero();
    Pasajero cliente10= new Pasajero();

    Ruta ruta5 = new Ruta();
    Ruta ruta6 = new Ruta();
    Ruta ruta7 = new Ruta();
    Ruta ruta8 = new Ruta();
    Ruta ruta9 = new Ruta();


}