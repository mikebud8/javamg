


public class Batter extends Player{
    
    // Stores weather the Batter is on base or not, if so, what base is he on
    // 0 = not on a base
    // 1 = First base
    // 2 = Second base
    // 3 = Third base
    int onBase;
    
    /**
     *  Batter class constructor
     * 
     *  Takes in pOut, pSing, pDoub, pTrip, pHr0, onBase Then sets these as the objects variables.
     * 
    **/
    public Batter(int in_Out, int in_Sing, int in_Doub, int in_Trip, int in_Hr0, int in_onBase){
    
        Out = in_Out;
        
        Sing = in_Sing;
        
        Doub = in_Doub;
        
        Trip = in_Trip;
        
        Hr0 = in_Hr0;
        
        onBase = in_onBase;
        
    }
    
    public void set_onBase(int in_onBase){
        onBase = in_onBase;
    }
    
    public int get_onBase(){
        return onBase;
    }
    
}