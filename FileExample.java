import java.io.*;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        // File dir = new File("d:/Jayasri/java-tests/java-streams");
        // File files[] = dir.listFiles();
        // for (File file : files) {
        // System.out.println(file.getName() + " Can Write: " + file.canWrite() + "Is
        // Hidden: " + file.isHidden()
        // + " Length: " + file.length() + " bytes");
        // }

        String s = "Hello, This is Java";
        // Create scanner Object and pass string in it
        Scanner scan = new Scanner(s);
        // Check if the scanner has a token
        System.out.println("Boolean Result: " + scan.hasNext());
        // Print the string
        System.out.println("String: " + scan.nextLine());
        scan.close();
        System.out.println("--------Enter Your Details-------- ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter your age: ");
        int i = in.nextInt();
        System.out.println("Age: " + i);
        System.out.print("Enter your salary: ");
        double d = in.nextDouble();
        System.out.println("Salary: " + d);
        in.close();
    }
}
