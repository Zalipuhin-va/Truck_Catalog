package ru.chita.gres.Truck_Catalog.objects;

import java.util.Scanner;

public class Truck {
    Scanner in = new Scanner(System.in);

    String name_truck;
    long vin;

    public void GetTruck(){
        System.out.println("Введите Name: ");
        name_truck = in.next();
        System.out.println("Vin: ");
        vin = in.nextLong();

        System.out.println("Name = " + name_truck);
        System.out.println("VIN = " + vin);
    }
}
