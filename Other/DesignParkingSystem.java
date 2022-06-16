public class DesignParkingSystem {
        private int bigCount;
        private int mediumCount;
        private int smallCount;

        public DesignParkingSystem(int big, int medium, int small) {
            this.bigCount = big;
            this.mediumCount =medium;
            this.smallCount= small;
        }

        public boolean addCar(int carType) {
            if(carType==1 && bigCount>0){
                bigCount--;
                return true;

            }else if(carType == 2 && mediumCount>0){
                mediumCount--;
                return true;
            }else if(carType==3 && smallCount >0){
                smallCount--;
                return true;
            }
            return false;
        }
    }


