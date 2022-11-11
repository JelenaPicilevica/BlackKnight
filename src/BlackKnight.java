
import java.util.Scanner;

public class BlackKnight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of your Black Knight: ");
        String name = scanner.nextLine();

        int arms = 2;
        int legs = 2;
        int head = 1;
        boolean alive = true;


        strike(arms,legs,head,alive, name);

    }


    Scanner scanner = new Scanner(System.in);

    public static void strike (int numberOfArms, int numberOfLegs, int numberOfHeads, boolean alive, String name){
        Scanner scanner = new Scanner(System.in);
        while (alive==true){
            System.out.println("\nPress enter to do cut off ");
            scanner.nextLine();
            if (numberOfArms>0){
                numberOfArms-=1;
                System.out.println("You lose 1 arm!");
            }else if (numberOfLegs>0){
                numberOfLegs-=1;
                System.out.println("You lose 1 leg!");
            }else if (numberOfHeads==1){
                numberOfHeads-=1;
                alive=false;
                System.out.println("You lose a head. Black Knight " + name + " is dead!");
                return;
            }else{
                System.out.println("Something went wrong");
            }
        }
    }
}
