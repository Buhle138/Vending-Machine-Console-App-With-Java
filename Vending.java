public class Vending {

    private Items[][] items;

    public Vending(Items[][] items){
        this.items = new Items[items.length][items[0].length];
        for(int i = 0; i < items.length; i++){
            for(int j = 0; j < items[i].length; j++){
                this.items[i][j] = new Items(items[i][j]); /*We are updating the field items with objects coming from the outside array which is items. */
            }
        }
    }

    public Items getItems(int row, int spot) {
        return new Items(this.items[row][spot]); /*Getting the copy object from  the items field. */
    }

    public void setItems(Items items, int row, int spot) {
        this.items[row][spot] = new Items(items);
    }

    public boolean despenseDrink(int row, int spot){
        if(this.items[row][spot].getQuantity() > 0){

            int chosenItem =  this.items[row][spot].getQuantity() - 1;

            this.items[row][spot].setQuantity(chosenItem);

            return true;
        }
            return false;


            
        

    }

    public String toString(){

        String temp = "  ";

        for (int i = 0; i < this.items.length; i++) {

           

            for (int j = 0; j < this.items[i].length; j++) {

                temp +=  this.items[i][j].toString();
                
            }

           temp += "\n\n";

          

         
        }

        temp += "\t************************************************";

        return temp;

    }
    
}
