public class GPU {
    public static int remainingNvidia = 10;
    public static int remainingRadeon = 10;

    public String sellGPU(int gpu , int amt){
        if(gpu==1){
            remainingNvidia-=amt;
            return ("Remaining Nvidia GPU  = "+ remainingNvidia);
        }
        if(gpu==2){
            remainingRadeon-=amt;
            return ("Remaining Radeon GPU  = "+ remainingRadeon);

        }
        return ("Invalid entry");
    }

    public Boolean checkStock(int gpu , int amt){
        if(gpu==1){
            if(amt<=remainingNvidia) return true;
        }
        if(gpu==2){
            if(amt<=remainingRadeon) return true;
        }
        return false;
    }
}

