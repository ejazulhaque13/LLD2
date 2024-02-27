package LLD2_2;

public class sparrow {
    private Flyator ref;
    public void setFlyator(Flyator r){
        ref =r;
    }
    void fly(){
        if(ref==null){
            System.out.println("No Algo for flight provided");
            return;
        }
        ref.flightAlgo();
    }
}
