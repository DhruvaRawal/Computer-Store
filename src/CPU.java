public class CPU {
    public static int remainingIntel = 10;
    public static int remainingAMD = 10;

    public String sellCPU(int cpu , int amt){
        if(cpu==1){
            remainingIntel-=amt;
            return ("Remaining Intel cpu  = "+ remainingIntel);
        }
        if(cpu==2){
            remainingAMD-=amt;
            return ("Remaining AMD cpu  = "+ remainingAMD);

        }
        return ("Invalid entry");
    }

    public Boolean checkStock(int cpu , int amt){
        if(cpu==1){
            if(amt<=remainingIntel) return true;
        }
        if(cpu==2){
            if(amt<=remainingAMD) return true;
        }
        return false;
    }
}