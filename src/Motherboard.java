public class Motherboard {
    public static int remainingGigaByte = 10;
    public static int remainingAsus = 10;

    public String sellMotherboard(int cpu , int amt){
        if(cpu==1){
            remainingGigaByte-=amt;
            return ("Remaining Intel cpu  = "+ remainingGigaByte);
        }
        if(cpu==2){
            remainingAsus-=amt;
            return ("Remaining AMD cpu  = "+ remainingAsus);
        }
        return ("Invalid entry");
    }

    public Boolean checkStock(int cpu , int amt){
        if(cpu==1){
            if(amt<=remainingGigaByte) return true;
        }
        if(cpu==2){
            if(amt<=remainingAsus) return true;
        }
        return false;
    }
}