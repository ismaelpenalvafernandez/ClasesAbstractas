package com.softtek.presentacion;
import com.softtek.modelo.Cactus;
import com.softtek.modelo.PlantaTropical;
import com.softtek.modelo.Planta;
public class MainPlanta {
    public static void main(String[] args) {
        Planta planta1 = new PlantaTropical("Hibisco", 50, true);
        Planta planta2 = new Cactus("Echinocactus grusonii", 20, false);

        planta1.regar(200, 5);
        planta2.regar(25, 4);
    }
}