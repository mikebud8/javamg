
/**
 *  public class Player
 * 
 *  a Player object which will store pitecher stats
 * 
**/
public class Player{
    
    //0-pOut if rolled outcome is Out
    public int Out;
    //pOut-pSing if rolled outcome is Single
    public int Sing;
    //pSing-pDoub if rolled outcome is Double
    public int Doub;
    //pDoub-pTrip if rolled outcome is Triple
    public int Trip;
    //pTrip-pHr0 if rolled outcome is HoemRun
    public int Hr0;
    
    
    // Setters for all variables
    public void set_Out(int in_Out){
        Out = in_Out;
    } 
    public void set_Sing(int in_Sing){
        Sing = in_Sing;
    } 
    public void set_Doub(int in_Doub){
        Doub = in_Doub;
    } 
    public void set_Trip(int in_Trip){
        Trip = in_Trip;
    } 
    public void set_Hr0(int in_Hr0){
        Hr0 = in_Hr0;
    } 
    
    
    // Getters for all variables
    public int get_Out(){
        return Out;
    } 
    public int get_Single(){
        return Sing;
    } 
    public int get_Double(){
        return Doub;
    } 
    public int get_Triple(){
        return Trip;
    } 
    public int get_Homerun(){
        return Hr0;
    } 
}
    
    
