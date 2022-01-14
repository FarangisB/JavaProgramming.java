package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class InternetCompanyObject1 {

    public static void main(String[] args) {

        InternetCompany internetCompany1 = new InternetCompany();
        InternetCompany internetCompany2 = new InternetCompany();
        InternetCompany internetCompany3 = new InternetCompany();
        InternetCompany internetCompany4 = new InternetCompany();
        InternetCompany internetCompany5 = new InternetCompany();


        internetCompany1.setInfo("Verizon",65.99,5.6,'A');
        internetCompany2.setInfo("Spectrum",70.5,8.5,'B');
        internetCompany3.setInfo("Optimum",98,10.4,'C');
        internetCompany4.setInfo("T-mobile",100.5,7.5,'D');
        internetCompany5.setInfo("Vodafone",80.7,4.5,'A');

        InternetCompany[] internetCompanies= {internetCompany1,internetCompany2,internetCompany3,internetCompany4,internetCompany5};

        for (InternetCompany each : internetCompanies) {


            if (each.price < 90) {
                System.out.println(each.provider);
            }
        }
        ArrayList<InternetCompany> maxSpeed1 =  new ArrayList<>();
        maxSpeed1.addAll(Arrays.asList(internetCompanies));

        double maxSpeed = internetCompany1.speed;
        for (InternetCompany each1: maxSpeed1) {
            if (each1.speed>maxSpeed){
                maxSpeed=each1.speed;
            }

        }

        double finalMaxSpeed = maxSpeed;
        maxSpeed1.removeIf(p->p.speed< finalMaxSpeed);

       for (InternetCompany each : maxSpeed1) {
            System.out.println(each.provider+" "+each.speed);
        }


        System.out.println(maxSpeed1);


    }
}


