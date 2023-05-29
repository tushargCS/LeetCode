class ParkingSystem {

    int b=0;
    int m=0;
    int s=0;
    public ParkingSystem(int big, int medium, int small) {
        b=big;
        s=small;
        m=medium;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(b>0) {b--;return true;}
        }
        else if(carType==2){
            if(m>0) {m--;return true;}
        }
         else if(carType==3){
            if(s>0) {s--;return true;}
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */