import java.util.*;

public class ComputerStore {
    static Vector GPU = new Vector();
    static Vector CPU = new Vector();
    static Vector PSU = new Vector();
    static Vector Motherboard = new Vector();
    static Vector Storage = new Vector();

    static void stock() {
        GPU.add("NVIDIA");
        GPU.add( "Radeon");

        CPU.add("Intel Core");
        CPU.add( "AMD Ryzen");

        PSU.add("Corsair");
        PSU.add("EVGA");

        Motherboard.add("GigaByte");
        Motherboard.add("Asus");

        Storage.add("Hard Disk Drive");
        Storage.add("Solid State Drive");
    }

    static void purchase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to purchase ?");
        System.out.println("1.GPU");
        System.out.println("2.CPU");
        System.out.println("3.PSU");
        System.out.println("4.Motherboard");
        System.out.println("5.Storage");
        System.out.println(" ");
        System.out.print("Enter Option : ");
        int i = sc.nextInt();

        if (i == 1) {
            GPU g = new GPU();
            System.out.println("The stock of GPU is : " + GPU);
            System.out.println("Which Gpu do you want to purchase ?");
            System.out.println("1. NVIDIA ");
            System.out.println("2. Radeon ");
            System.out.print("Enter Option : ");
            int gpu = sc.nextInt();
            System.out.println("How many you want ?");
            int amt = sc.nextInt();
            
            while(!g.checkStock(gpu, amt)){
                System.out.println("We don't have that much in stock! \n Please enter lesser number.");
                amt = sc.nextInt();
            }
            System.out.println(g.sellGPU(gpu, amt));
        }

        if (i == 2) {
            System.out.println("The stock of CPU is : " + CPU);
            CPU c = new CPU();
            System.out.println("Which Cpu do you want to purchase ?");
            System.out.println("1. Intel Core ");
            System.out.println("2. AMD Ryzen");
            System.out.print("Enter Option : ");
            int cpu = sc.nextInt();
            System.out.println("How many you want ?");
            int amt = sc.nextInt();
            
            while(!c.checkStock(cpu, amt)){
                System.out.println("We don't have that much in stock! \n Please enter lesser number.");
                amt = sc.nextInt();
            }
            
            System.out.println(c.sellCPU(cpu, amt));
        }

        if (i==3){
            System.out.println("The stock of PSU is : " + PSU);
            PSU p = new PSU();
            System.out.println("Which Psu do you want to purchase ?");
            System.out.println("1. Corsair ");
            System.out.println("2. EVGA");
            System.out.print("Enter Option : ");
            int psu = sc.nextInt();
            System.out.println("How many you want ?");
            int amt = sc.nextInt();

            while(!p.checkStock(psu, amt)){
                System.out.println("We don't have that much in stock! \n Please enter lesser number.");
                amt = sc.nextInt();
            }

            System.out.println(p.sellPSU(psu, amt));
        }

        if (i==4){
            System.out.println("The stock of Motherboard is : " + Motherboard);
            Motherboard m = new Motherboard();
            System.out.println("Which Motherboard do you want to purchase ?");
            System.out.println("1. GigaByte ");
            System.out.println("2. Asus");
            System.out.print("Enter Option : ");
            int motherboard = sc.nextInt();
            System.out.println("How many you want ?");
            int amt = sc.nextInt();

            while(!m.checkStock(motherboard, amt)){
                System.out.println("We don't have that much in stock! \n Please enter lesser number.");
                amt = sc.nextInt();
            }

            System.out.println(m.sellMotherboard(motherboard, amt));
        }

        if (i==5){
            System.out.println("The stock of Storage is : " + Storage);
            Storage s = new Storage();
            System.out.println("Which Storage do you want to purchase ?");
            System.out.println("1. Hard Disk Drive ");
            System.out.println("2. Solid State Drive");
            System.out.print("Enter Option : ");
            int storage = sc.nextInt();
            System.out.println("How many you want ?");
            int amt = sc.nextInt();

            while(!s.checkStock(storage, amt)){
                System.out.println("We don't have that much in stock! \n Please enter lesser number.");
                amt = sc.nextInt();
            }

            System.out.println(s.sellStorage(storage, amt));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        stock();

        System.out.println("----- Welcome to our store -----");
        System.out.println("\nDo you want to purchase anything ? ");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.print("Enter Option : ");
        int f = sc.nextInt();

        while (f==1) {
            purchase();
            System.out.println("\nDo you want to continue ?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Enter Option : ");
            f=sc.nextInt();
        }
        System.out.println("----- Thanks for Visiting our Store -----");
        sc.close();
    }
}