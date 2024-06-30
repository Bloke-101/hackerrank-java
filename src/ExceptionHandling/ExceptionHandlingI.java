package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingI {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            int y = in.nextInt();

            System.out.println(x / y);

        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}