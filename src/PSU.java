public class PSU {
    public static int remainingCorsair = 10;
    public static int remainingEVGA = 10;

    public String sellPSU(int psu , int amt){
        if(psu==1){
            remainingCorsair-=amt;
            return ("Remaining Intel cpu  = "+ remainingCorsair);
        }
        if(psu==2){
            remainingEVGA-=amt;
            return ("Remaining AMD cpu  = "+ remainingEVGA);

        }
        return ("Invalid entry");
    }

    public Boolean checkStock(int psu , int amt){
        if(psu==1){
            if(amt<=remainingCorsair) return true;
        }
        if(psu==2){
            if(amt<=remainingEVGA) return true;
        }
        return false;
    }
}
