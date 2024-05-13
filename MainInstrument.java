public class MainInstrument {

    public static void main(String[] args) {
        
        Instrument[][] instruments = {
           {new Instrument("Guitar", "Beginner", 150), new Instrument("Guitar", "Intermediate", 215), new Instrument("Guitar", "Advanced", 130)},
           {new Instrument("Piano", "Beginner", 250), new Instrument("Piano", "Intermediate", 232), new Instrument("Piano", "Advanced", 185)},
           {new Instrument("Violin", "Beginner", 280), new Instrument("Violin", "Intermediate", 280), new Instrument("Violin", "Advanced", 310)},
       };
       
       String[] instrumentNames = new String[3];
       
       //Getting the names
       for(int i = 0; i < instruments.length; i++){
           for(int j = 0; j < instruments[i].length; j++){
               instrumentNames[i] = instruments[i][0].getInstrumentName();
           }
       }
       
       //Printing names
       for(int i = 0; i < instruments.length; i++){
           System.out.println(instrumentNames[i]);
       }
       
       String[] level = new String[3];
       //Getting the level
       for(int i = 0; i < instruments.length; i++){
           for(int j = 0; j < instruments[i].length; j++){
               level[i] = instruments[0][j].getLevel();
           }
       }

       System.out.println(instruments[0][0].getLevel());
       System.out.println(instruments[0][1].getLevel());
       System.out.println(instruments[0][2].getLevel());
       
       //Printing levels
    //    for(int i = 0; i < instruments.length; i++){
    //        System.out.println(level[i]);
    //    }
      
   }
    
}
