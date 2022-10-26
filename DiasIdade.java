import java.lang.reflect.Array;
import java.util.Scanner;

public class DiasIdade {
    public static void main(String[] args) {
        int ageInDays = getDays();
        int[] age = calculateAge(ageInDays);
        System.out.println("Você tem " + age[2] + " anos " + age[1] + " meses e " + age[2] + " dias.");
    }

    public static int getDays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite em dias a sua idade:");
        try {
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println("Favor digitar um valor númerico real!");
            return getDays();
        }
    }

    public static int[] calculateAge(int ageInDays) {
        int[] age = new int[3];
        age[2] = ageInDays / 365;
        age[1] = ((ageInDays % 365) / 30);
        age[0] = ((ageInDays % 365) % 30);
        return age;
    }
}
