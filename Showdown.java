import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;

/**
 *
 * @author crychair fair...
 */
public class Showdown {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Pitcher currentPitcher = new Pitcher(12, 16, 19, 0, 20);
    Batter currentBatter = new Batter(10, 4, 12, 15, 16, 20);
    
        Showdown showDown = new Showdown();
        int outcome = showDown.rollDice(20,1,"Pitcher");
            if(outcome <= currentBatter.get_onBase()){
                System.out.println("Batter's Advantage");
                int bOutcome = showDown.rollDice(20, 1,"Batter");
                //int bOutcome = 2; //debug hit
                
                if(bOutcome <= currentBatter.get_Out()){
                    System.out.println("You're out!!!");
                } else if(bOutcome <= currentBatter.get_Single()) {                   
                    System.out.println("You're safe at first.");
                } else if(bOutcome <= currentBatter.get_Double()) {
                    System.out.println("Stand up double!!");
                } else if(bOutcome <= currentBatter.get_Triple()) {
                    System.out.println("He slides into third!!");
                } else {
                    System.out.println("This guy is socking dingers!!!");
                }
            } else {
                System.out.println("Pitcher's Advantage");
                int pOutcome = showDown.rollDice(20, 1,"Batter");
                //int bOutcome = 2; //debug hit
                
                if(pOutcome <= currentPitcher.get_Out()){
                    System.out.println("You're out!!!");
                } else if(pOutcome <= currentPitcher.get_Single()) {                   
                    System.out.println("You're safe at first.");
                } else if(pOutcome <= currentPitcher.get_Double()) {
                    System.out.println("Stand up double!!");
                } else if(pOutcome <= currentPitcher.get_Triple()) {
                    System.out.println("He slides into third!!");
                } else {
                    System.out.println("This guy is socking dingers!!!");
                }
            }
     //   System.out.println("Your dice total was " + outcome);
    }

    public int rollDice(int dSides, int nDice, String player) {

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
        int randomNum = 0;
        int dTotal = 0;
        
        for(int i = 1; i <= nDice; i++){
        randomNum = ThreadLocalRandom.current().nextInt(1, dSides + 1);
        System.out.println(player + "'s roll equals " + randomNum);
        //dTotal = dTotal + randomNum;
        }
        return dTotal;
    }
    
}
