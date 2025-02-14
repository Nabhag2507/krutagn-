import java.util.Scanner;

class ComplexNumber{
    int realNum;
    int imagNum;
    public ComplexNumber(int realNum, int imagNum){
        this.realNum = realNum;
        this.imagNum = imagNum;
    }

    public void addition(ComplexNumber n){
        this.realNum += n.realNum;
        this.imagNum += n.imagNum;

        System.out.print("Your ans is "+realNum+"+i"+imagNum);
    }
}

public class lab6b5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        int real1 = scanner.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int imag1 = scanner.nextInt();
        System.out.print("Enter real part of second complex number: ");
        int real2 = scanner.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int imag2 = scanner.nextInt();

        ComplexNumber c1 = new ComplexNumber(real1, imag1);
        ComplexNumber c2 = new ComplexNumber(real2, imag2);

        c1.addition(c2);
        scanner.close();
    }
}
