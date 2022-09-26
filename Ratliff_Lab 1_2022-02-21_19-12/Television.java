public class Television{
    //this class emulates a Television
    //Elyssa Ratliff 2/15/2022
    
    //fields
    private final String MANUFACTURER; //contains name of maker
    private final int SCREEN_SIZE; //the dagonal screen size
    private boolean powerOn; //toggle for power status
    private int channel; //current channel
    private int volume; //control volume
    
    /*
    *The contstructor for out Tv arguments are passed int
    *for the consant values. Other fields are set to default
    *values
    */
    public Television(String brand, int size){
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    
    //getters or accessors
    public int getVolume(){
        return volume;
    }
    public int getChannel(){
        return channel;
    }
    public String getManufacturer(){
        return MANUFACTURER;
    }
    public int getScreenSize(){
        return SCREEN_SIZE;
    }
    
    //setters or mutators
    public void setChannel(int station){
        channel = station;
    }
    public void power(){
        if (powerOn == true){
            powerOn = false;
        }else{
            powerOn = true;
        }
        //there is a shorter way to write this
        //if powerOn == true
        //then !powerOn == false
        //so we could write
        //powerOn = !powerOn
    }
    //this method increases the volume
    public void increaseVolume(){
        if(volume < 100){
             volume++;
        }
    }
    //this method decreases the volume
    public void decreaseVolume(){
        if(volume > 0){
            volume--;
        }
    }
}












