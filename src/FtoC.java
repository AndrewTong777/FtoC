import java.util.Scanner;
public class FtoC {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("F to C (1) or C to F (2)");
        int result = scan.nextInt();

        if (result ==1){
            //calculate f to c

            System.out.println("You have chosen F to C!");
            System.out.println("Enter F Value: ");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5/9;
            System.out.println("C is: ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);

        }else if (result == 2) {
            //calculate c to f

            System.out.println("You have chosen C to F!");
            System.out.println("Enter C value: ");
            double value2 = scan.nextDouble();
            double finalResult = value2 * 1.8 + 32;
            System.out.println("F is: ");
            System.out.println(Math.round(finalResult * 10.0) / 10.0);

        } else {
            //this is for any num that isn't the option of choice 1 or 2
            System.out.println("Not a valid response!");

        }
    }
}
