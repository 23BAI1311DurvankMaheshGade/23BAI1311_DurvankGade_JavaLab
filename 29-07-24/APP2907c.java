import java.util.Scanner;
public class APP2907c{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter the second number: ");
    int b = sc.nextInt();
    int lcm = (a > b) ? a : b;
    while (true) {
        if (lcm % a == 0 && lcm % b == 0) {
            System.out.println("The LCM of " + a + " and " + b + " is " + lcm);
            break;
        }
        lcm++;
    }
    }
}
