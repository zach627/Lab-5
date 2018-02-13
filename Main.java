import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter a hexadecimal number: ");

        String input;
        char digit;
        long finalNum = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        input = input.toUpperCase();

        for(int l=input.length() -1;l>-1; l--) {


            digit = input.charAt(l);

            int i = (input.length() - 1 - l);

            //System.out.println((int)digit);
            if (digit == '0') {

            } else if (digit == 'x') {

            } else if (digit == 'X') {

            } else {
                if ((int) digit < 58) {
                    finalNum += ((int) (digit - 48) * Math.pow(16, i));
                } else {
                    switch (digit) {
                        case 'A': {
                            finalNum += (10 * Math.pow(16, i));
                            break;
                        }
                        case 'B': {
                            finalNum += (11 * Math.pow(16, i));
                            break;
                        }
                        case 'C': {
                            finalNum += (12 * Math.pow(16, i));
                            break;
                        }
                        case 'D': {
                            finalNum += (13 * Math.pow(16, i));
                            break;
                        }
                        case 'E': {
                            finalNum += (14 * Math.pow(16, i));
                            break;
                        }
                        case 'F': {
                            finalNum += (15 * Math.pow(16, i));
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("Your number is " + finalNum + " in decimal");
    }
}

