import java.util.Scanner;
public class Main{
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

        Vending vendingMachine = new Vending(items);

        System.out.println(vendingMachine);


        while(true){

           
            System.out.print("Pick a row:   ");
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row:  ");
            int spot = scan.nextInt();
    
            boolean dispensed = vendingMachine.despenseDrink(row, spot);
            System.out.println("\n" + vendingMachine);    

            if(dispensed == true){
                System.out.print("\nEnjoy your drink! Press 1 to purchase another:  ");
            }else{
                System.out.print("\nSorry, we're out of this item. Press 1 to purchase another:  ");
            }
            if(scan.nextInt() != 1){
                break;
            }

        }
       
      
        // while(true){

        //     Vending vendingMachine = new Vending(items);
        //     System.out.println("\n" + vendingMachine);
            
        //     System.out.print("Pick a row:  ");
        //     int row = scan.nextInt();
        //     System.out.print("Pick a spot in that row:  ");
        //     int spot = scan.nextInt();
        //     boolean dispense = vendingMachine.despenseDrink(row, spot);
        //     System.out.println("\n" + vendingMachine);
            

        //     if(dispense == true){
        //         System.out.print("\nEnjoy your drink! Press 1 to purchase another:  ");
        //         scan.nextLine();
        //         String press = scan.nextLine();
        //         switch(press){
        //             case "1" : System.out.println("\n" + vendingMachine );break;
        //             default : break;
        //         }
        //     }else if(dispense == false){
        //         System.out.print("\nSorry, we're out of this item. Press 1 to purchase another: ");
        //         String secondPress = scan.nextLine();
        //         switch(secondPress){
        //             case "1" : continue;
        //             default : break;
        //         }
        //     }

        // }

     
      
       
    }
}