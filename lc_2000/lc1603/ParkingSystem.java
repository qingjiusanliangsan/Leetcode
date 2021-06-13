package lc_2000.lc1603;

public class ParkingSystem {
    int[] con = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        con[0]=big;
        con[1]=medium;
        con[2]=small;
    }

    public boolean addCar(int carType) {
        if(con[carType-1]>0){
            --con[carType-1];
            return true;
        }
        return false;
    }
}
