package ru.itpark;

import ru.itpark.model.*;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.UlmartService;

public class Main {
    public static void main(String[] args) {
        final UlmartService service = new UlmartService(new ProductRepository());

        service.add(new MeatGrinder(0, "MeatGrinder", "Scarlett SC-MG45S61", 3_990, 5, 1_800, " black"));
        service.add(new MeatGrinder(0, "MeatGrinder", "Kitfort КТ-2101-3 Carnivora", 3_190, 4,1_500, "black / orange"));
        service.add(new MeatGrinder(0, "MeatGrinder","Polaris PMG 2029", 5_290,0,2_000, "silver" ));

        service.add(new Toaster(0, "Toaster","Polaris PET 0706LB", 1_400, 3, "two compartments", 750, "black / green"));
        service.add(new Toaster(0, "Toaster","Home-Element HE-TS500", 710, 5,"two compartments", 700, "dark topaz"));
        service.add(new Toaster(0, "Toaster","Russell Hobbs 21642-56", 2_190,0,"two compartments", 850, "red"));

        service.add(new Printer(0,"Printer","HP Neverstop Laser 1000w", 15_990,0, "A4", "black - white",20));
        service.add(new Printer(0,"Printer","HP Color LaserJet Pro M454dw", 28_290, 0,"A4","color", 27));
        service.add(new Printer(0,"Printer","HP LaserJet Enterprise 600 M608n", 100_830,0, "A4","black - white", 61));

        service.add(new TV(0, "TV","Vityaz 43LF0207", 12_590, 5, 43, "FHD LED", "black", "DVB-T2/C/S2"));
        service.add(new TV(0, "TV","KIVI 40UR50GR", 19_990, 5, 40, "UHD LED","gray", "DVB-T2/C"));
        service.add(new TV(0, "TV","Philips 50PUS6704/60", 41_990,0,50, "UHD","black", "DVB-T2/S2/C"));

        System.out.println(service.deleteById(1));
        System.out.println(service.searchByName("HP Color"));
        System.out.println(service.searchByCategory("Printer"));
        System.out.println(service.sortedByName());
        System.out.println(service.sortedByPriceAsc());
        System.out.println(service.sortedByPriceDesc());
        System.out.println(service.sortedByRating());

    }
}
