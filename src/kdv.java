import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvli;
        boolean kdvDegis;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();


        kdvDegis=(0<tutar) && (1000>tutar);
        kdvOran=kdvDegis ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvli = tutar + kdvTutar;


        System.out.println("Kdv hariç :" + tutar);
        System.out.println("Kdv Oranı :" + kdvOran);
        System.out.println("Kdv Tutar :" + kdvTutar);
        System.out.println("Kdv dahil : " + kdvli);
    }
}
