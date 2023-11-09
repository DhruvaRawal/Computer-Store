public class Storage {
    public static int remainingHDD = 10;
    public static int remainingSSD = 10;

    public String sellStorage(int storage , int amt){
        if(storage==1){
            remainingHDD-=amt;
            return ("Remaining Intel cpu  = "+ remainingHDD);
        }
        if(storage==2){
            remainingSSD-=amt;
            return ("Remaining AMD cpu  = "+ remainingSSD);

        }
        return ("Invalid entry");
    }

    public Boolean checkStock(int cpu , int amt){
        if(cpu==1){
            if(amt<=remainingHDD) return true;
        }
        if(cpu==2){
            if(amt<=remainingSSD) return true;
        }
        return false;
    }
}