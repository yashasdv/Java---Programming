import java.util.Scanner;

public class ExtractingDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int OriginalNumber = num;

        int divisor = 1;
        if(num/divisor>=10) {
            divisor*=10;
        }

        num = OriginalNumber;
        while(divisor>0){
            int digit = num/divisor;
            System.out.print(digit);

            num=num%divisor;
            divisor/=10;
        }
        sc.close();

    }

}
