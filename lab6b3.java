import java.util.Scanner;

class vowels {
    String str;

    public vowels(String str) {
        this.str = str;
    }

    public void vowels() {
        int counter = 0,ac=0,ec=0,ic=0,oc=0,uc=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'|| c == 'U') {
                if(c=='a' || c == 'A'){
                    ac++;
                }
                if(c=='e' || c == 'E'){
                    ec++;
                }
                if(c=='i' || c == 'I'){
                    ic++;
                }
                if(c=='o' || c == 'O'){ 
                    oc++;
                }
                if(c=='u' || c == 'U'){
                    uc++;
                }
                counter++;
            }
        }
        System.out.println("Total numbers of vowels is " + counter);
        System.out.println("total a is " + ac);
        System.out.println("total e is " + ec);
        System.out.println("total i is " + ic);
        System.out.println("total o is " + oc);
        System.out.println("total u is " + uc);
    }

}

public class lab6b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.print("Enter a string: ");
            String qoute = sc.nextLine();

            vowels v = new vowels(qoute);

            v.vowels();
            if (qoute.equals("quit")) {
                System.out.println("Exiting the program");
                sc.close();
                break;
            }
        }
    }
}
