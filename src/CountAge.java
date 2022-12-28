import java.util.Scanner;

public class CountAge {

    public static Scanner scanner = new Scanner(System.in);
    public static int x, y, z;
    public static void main(String[] args){

        System.out.println();
        while (true){
            System.out.println("   PROGRAM APLIKASI MENGHITUNG SISA UMUR");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\nSISA UMUR ANDA 90 TAHUN KEDEPAN");
            System.out.println("1. Hitung Sisa Umur");
            System.out.println("2. Exit Aplikasi");
            String yourChoose = outputScan("Masukkan Pilihan Anda");
            if (yourChoose.equals("1")){
                countAge();
                System.out.println();
            } else if (yourChoose.equals("2")) {
                break;
            } else {
                System.out.println("Pilihan Anda Tidak Valid........");
            }
        }

    }

    public static String outputScan(String index){
        System.out.print(index + " : ");
        return scanner.nextLine();
    }

    public static void countAge(){
        int maxAge = 90;

        String name = outputScan("Masukkan Nama Anda");
        int age = Integer.parseInt(outputScan("Masukkan Umur Anda"));
        int finalAge = maxAge - age;
        x = finalAge * 365;
        y = finalAge * 52;
        z = finalAge * 12;

        System.out.println("\nNama Anda Adalah : " + name);
        System.out.println("Sisa Umur Anda Adalah | " + x + " Hari | " + y + " Minggu | " + z + " Bulan");
    }
}
