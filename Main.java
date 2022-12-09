import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int sicaklik;

        System.out.print("Sıcak Değerinizi Giriniz: ");
        sicaklik = inp.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }else if(sicaklik<25){
            if (sicaklik <15){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }else if(sicaklik == 15){
                System.out.println("Sinemaya Veya Pikniğe Gidebilirsiniz.");
            }else {
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        }else if(sicaklik<=34){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }else{
            System.out.println("Dışarısı etkinlik yapmaya uygun sıcaklıkta değil.");
        }


    }
}