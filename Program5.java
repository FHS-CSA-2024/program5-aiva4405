//import stuff here?

//Your code here

public class Program5 {
    public static void main(String[] args) {
        int royaleMiles = 286;
        int royaleGallons = 9;
        double royaleMpg = (double)royaleMiles / royaleGallons;
        
        int koopaMiles = 412;
        int koopaGallons = 40;
        double koopaMpg = (double)koopaMiles / koopaGallons;
        
        int pipeMiles = 361;
        int pipeGallons = 18;
        double pipeMpg = (double)pipeMiles / pipeGallons;
        
        int badMiles = 161;
        int badGallons = 11; 
        double badMpg = (double)badMiles / badGallons;
        
        System.out.println("Mario kart racer's average miles per gallon:");
        System.out.print("Royale: ");
        System.out.format("%.1f", royaleMpg);
        System.out.println(" mpg");
        
        System.out.print("Koopa King: ");
        System.out.format("%.1f", koopaMpg);
        System.out.println(" mpg");
        
        System.out.print("Pipe Frame: ");
        System.out.format("%.1f", pipeMpg);
        System.out.println(" mpg");
        
        System.out.print("Badwagon: ");
        System.out.format("%.1f", badMpg);
        System.out.println(" mpg");
        
    }
}



//Paste console output below:
/*

Mario kart racer's average miles per gallon:
Royale: 31.8 mpg
Koopa King: 10.3 mpg
Pipe Frame: 20.1 mpg
Badwagon: 14.6 mpg

*/
