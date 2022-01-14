package day31_Constractors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {



        Offer offer1 = new Offer();
        offer1.setInfo("Va", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer1.setInfo("Ca", "Sony Inc", "QA", 120000, false, false, false, false);

        Offer offer3 = new Offer();
        offer1.setInfo("Fl", "Apple", "Tester", 100000, true, true, true, true);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("---------------------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>( Arrays.asList( myOffers )  );
        fullTimeOffers.removeIf( p -> !p.isFullTime ); // removes the offer if the offer is NOT fulltime

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>( Arrays.asList( myOffers )  );
        localOffers.removeIf( p -> !p.location.equals("VA") ); // removes the offer if the offer is not from local area

        System.out.println(localOffers.size());


    }


}




