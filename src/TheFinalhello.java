import java.util.Scanner;

public class TheFinalhello {

    public static void main(String arg[]) {
        String name, lastName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("PLease tell your name?");
        name = keyboard.next();
        System.out.println("Your last name");
        lastName = keyboard.next();

        System.out.println(heyThere (name,lastName));

        System.out.println(heyThereFrench(name,lastName));

        System.out.println(heyThereTwi(name,lastName));

        System.out.println(heyThereOromo(name,lastName));
        
    }

    public static String heyThere(String name,String lastName) {

        return "English: Hello, " + name + "! \n Your first name: "+name+"\n Your last name: "+lastName;
    }

    public static String heyThereFrench(String name, String lastName) {

        return "French: Bonjoure, " + name + "! \n Your first name: "+name+"\n Your last name: " +lastName;
    }

    public static String heyThereTwi(String name, String lastName) {

        return "Twi: Mahai, "+ name + "! \n Your first name: "+name+"\n Your last name: " +lastName;
    }

    public static String heyThereOromo(String name, String lastName) {

        return "Afan Oromo: Akam, "+ name + "! \n Your first name: "+name+"\n Your last name: " +lastName;
    }
}