public class Instrument {

    private String instrumentName;
    private String level;
    private int price;
    
    public Instrument(String instrumentName, String level, int price){
        this.instrumentName = instrumentName;
        this.level = level;
        this.price = price;
    }
    
    public String getInstrumentName(){
        return this.instrumentName;
    }
    
    public String getLevel(){
        return this.level;
    }
    
    public int getPrice(){
        return this.price;
    }
    
}
