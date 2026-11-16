package tp05_heritage;

public class TestVehicule {
    public static void main(String[] args){
        Vehicule[] mesVehicules = new Vehicule[3];

        mesVehicules[0] = new Voiture("Toyota", "4X4", 2015, 4);
        mesVehicules[1] = new Moto("Sanili", "moto 4 G", 2018, 10);
        mesVehicules[2] = new VoitureElectrique("Nanfang", "elec", 2025, 2, 95);

        for(Vehicule v : mesVehicules){
            v.demarrer();
        }
    }
}
