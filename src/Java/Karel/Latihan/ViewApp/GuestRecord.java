package Java.Karel.Latihan.ViewApp;

import Java.Karel.Latihan.Repository.Repository;
import Java.Karel.Latihan.Repository.RepositoryImpl;
import Java.Karel.Latihan.Service.Service;
import Java.Karel.Latihan.Service.ServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestRecord {

    private Service service;

    public GuestRecord(Service service) {
        this.service = service;
    }

    public static Scanner scanner = new Scanner(System.in);
    public static String outputScanner(String index){
        System.out.print(index + " : ");
        return scanner.nextLine();
    }
    public void viewFormGuests(){
        System.out.println("\n  MENU FORM TAMU");
        System.out.println("==================");
        String id = outputScanner("Masukkan ID Anda");
        String name = outputScanner("Masukkan Nama Anda");
        String address = outputScanner("Masukkan Alamat Anda");
        String email = outputScanner("Masukkan Email Anda");
        String phoneNumber = outputScanner("Masukkan Nomor Telephone Anda");
        if (id != null || name != null || address != null || email != null || phoneNumber != null){
            service.viewAddListGuests(name);
        } else {
            System.out.println("Lengkapi Data Anda");
            viewFormGuests();
        }
    }

    public void viewListGuests(){
        System.out.println("\n  MENU LIST TAMU");
        System.out.println("==================");
        service.viewShowListGuests();
    }

    public void viewFrontApp(){
        label:
        while (true){
            System.out.println("\n   APPLICATION TAMU UNDANGAN");
            System.out.println("===============================");
            System.out.println("1. Masukkan Form Tamu");
            System.out.println("2. Tampilkan Daftar Tamu");
            System.out.println("3. Exit Application");
            String yourChoose = outputScanner("Masukkan Pilihan Anda");
            switch (yourChoose) {
                case "1" -> {
                    viewFormGuests();
                }
                case "2" -> {
                    viewListGuests();
                }
                case "3" -> {
                    System.out.println("Close Application................");
                    break label;
                }
                default -> {
                    System.out.println("Your Choose Invalid");
                }
            }
        }
    }
}
