package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile{
    public static void main(String[] args){

        UserProfile obj = new UserProfile();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name");
        String userName = input.nextLine();

        System.out.println("\nEnter your Favourite genre from the list");
        obj.printArray();
        String userGenre = input.nextLine();

        UserProfile object = new UserProfile();

        System.out.println("User Profile Created");

    }
}