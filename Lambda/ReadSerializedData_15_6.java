// Exercise 15.6
// A small helper program that reads newmast.ser and prints it to the screen,
// so you can check that the serialization worked. Run this after FileMatch_15_6.
import java.io.*;
import java.util.ArrayList;

public class ReadSerializedData_15_6 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("newmast.ser"))) {
            ArrayList<Account_15_6> accounts = (ArrayList<Account_15_6>) input.readObject();
            System.out.println("Contents of newmast.ser:");
            for (Account_15_6 account : accounts) {
                System.out.println(account);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading newmast.ser: " + e.getMessage());
        }
    }
}
