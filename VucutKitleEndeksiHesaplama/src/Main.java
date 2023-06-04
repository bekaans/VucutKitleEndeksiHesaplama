import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

double kilo;
double boy;


        System.out.print("Lütfen Kilonuzu Giriniz :");kilo=input.nextDouble();
        System.out.print("Lütfen Boyunuzu Giriniz(Metre Cinsinden :");boy=input.nextDouble();

        double endeks = kilo / (boy*boy);

        System.out.println("Vücut Kitle Endeksiniz :"+endeks);


    }
}