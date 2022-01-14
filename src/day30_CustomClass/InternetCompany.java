package day30_CustomClass;

public class InternetCompany {


        public String provider;
        public double price;
        public double speed;
        public  char rate;

        public void setInfo(String provider, double price, double speed, char rate) {
            this.provider = provider;
            this.price = price;
            this.speed = speed;
            this.rate = rate;
        }





        public String toString() {
            return "InternetCompany{" +
                    "provider='" + provider + '\'' +
                    ", price=$" + price +
                    ", speed=" + speed +
                    ", rate=" + rate +
                    '}';
        }
    }



