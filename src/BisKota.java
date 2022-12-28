import java.util.ArrayList;

public class BisKota {
    public static int GetPassenger(ArrayList<int[]> BisKota){
        int a = BisKota.get(0)[0];
        int b = BisKota.get(0)[1];
        int c = BisKota.get(1)[0];
        int d = BisKota.get(1)[1];
        int e = BisKota.get(2)[0];
        int f = BisKota.get(2)[1];
        int jumlah = a - b + c - d + e - f;
        return jumlah;
    }
    public static void main(String[] args) {
        ArrayList<int[]> StopGo = new ArrayList<int[]>();
        StopGo.add(new int[] {8, 0});
        StopGo.add(new int[] {4, 6});
        StopGo.add(new int[] {5, 7});
        System.out.println(GetPassenger(StopGo));
    }
}