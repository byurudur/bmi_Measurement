import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vücut kitle indeksi; ağırlığın boyun karesine bölünmesi formülü ile hesaplanmaktadır.Bireyin ideal kilosunu görebilmesi ve hangi ağırlık kategorisinde olduğunu öğrenebilmesi açısından kullanılan bir formüldür.");

        System.out.println("Lütfen boyunuzu metre cinsinden ondalıklı olarak(a.bb) giriniz:");
        Double boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden ondalıklı olarak(aa.b) giriniz:");
        Double kilo = scan.nextDouble();
        Double bmi = kilo / (boy * boy);
        System.out.println("BMI sonucunuz =  " + bmi );

        if (bmi < 18.5){
            System.out.println("Vücut kitle endeksiniz ortalamanın altında.");
        }

        if (bmi > 18.5 && bmi < 24.9){
            System.out.println("Vücut kitle endeksiniz ortalama bir değerde");
        }

        if (bmi > 25 && bmi < 29.9){
            System.out.println(" Vücut kitle endeksiniz ortalamanın biraz üstünde.");
        }
        if (bmi >= 30.0){
            System.out.println("Vücut kitle endeksiniz  ortalama üstü");
        }
    }
}


