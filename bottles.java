package bottles;

/**
 *
 * @author zerellgardner
 */
public class Bottles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] bob) {
        
        int beerNum = 99;
        String word = "bottles";
        
        while (beerNum > 0){
            
            if (beerNum == 1){
                word = "bottle";
                
            }
            
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take on down");
            System.out.println("Pass it around");
            
            beerNum = beerNum - 1;
            
            if (beerNum == 0) {
                
                System.out.println("No more bottles of beer on the wall");
                
            }
            
            
            
            
        }
        
        
    }
    
}
