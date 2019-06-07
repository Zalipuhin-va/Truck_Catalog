package ru.chita.gres.Truck_Catalog.objects;

import java.util.Scanner;

public class Truck {
    Scanner in = new Scanner(System.in);

    String name_truck;
    long vin;

    public String getName_truck() {
        return name_truck;
    }

    public long getVin() {
        return vin;
    }

}
