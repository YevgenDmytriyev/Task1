package Main;

public class Task1 {

    /*
    psvm - create main method
    sout - print to console
    Cntr + Alt + L - format the code
     */

    public static void main(String[] args) {

        System.out.println("Task");

        int a = 10;
        int b = 20;

        final int c;

        System.out.println("a = " + a + ";");
        System.out.println("b = " + b + ";");

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a + ";");
        System.out.println("b = " + b + ";");

    }
}

