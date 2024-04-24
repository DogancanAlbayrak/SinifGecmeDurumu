import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        // We are creating an area for the user to enter their grades.

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        //Calculating the average of the grades entered by the user.

        double avarage = ((mat + fizik + turkce + kimya + muzik) / 5);

        //If the user has not entered a value between 0 and 100 while entering grades, they will receive an error message.

        if (mat < 0 && mat > 100 || fizik < 0 || fizik > 100 || turkce < 0 || turkce > 100 || kimya < 0 || kimya > 100 || muzik < 0 || muzik > 100) {
            System.out.print("Notlarınızın 0 ile 100 arasında olması gerekmektedir.");
        } else {

            //We are sending a message to the screen indicating whether the user has passed or failed based on the average grade.

            if (avarage <= 55) {
                System.out.println("Sınıfta Kaldınız !");
            } else {
                System.out.println("Tebrikler! Sınıfı Geçtiniz!");
            }

            //We are sending the user's grade average to the screen.

            System.out.println("Ortalamanız : " + avarage);

        }
    }
}
