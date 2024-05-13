import java.util.Scanner;
public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
         Items[][] items = new Items[][] {
            { new Items("Pepsi", 1.99, 3) , new Items("Fresca", 1.49, 3), new Items("Brisk", 2.49, 2) },
            { new Items("Fanta", 1.99, 2) , new Items("Barq's", 1.49, 2), new Items("A & W", 2.49, 3) },
            { new Items("Crush", 1.99, 2) , new Items("C-Cola", 1.49, 2), new Items("Berry", 2.49, 1) }
        };

        Vending machine = new Vending(items);
        System.out.println(machine);



        while(true){

            System.out.print("Pick a  row:  ");
            int row = scan.nextInt();
            System.out.print("Pick a spot:  ");
            int spot = scan.nextInt();
            boolean choice = machine.dispense(row, spot);
            System.out.println(machine);
            if(choice == true){
                System.out.print("Enjoy your drink! press 1 pick another drink: ");
                int pressed = scan.nextInt();
                  System.out.println(machine);
            }else {
                System.out.println("Sorry we are out of that drink!" + "\n");
            }

        }
        
    }
}