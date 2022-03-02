package day51_Collections_Map;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class NamesAndHiredDates {

    public static void main(String[] args) {

         Map <String, LocalDate> map = new LinkedHashMap<>();

             map.put("John", LocalDate.of(2018, 9, 5));
             map.put("Antony", LocalDate.of(2012, 7, 29));
             map.put("Jimmy", LocalDate.of(2014, 4, 1));
             map.put("James", LocalDate.of(2016, 11, 2));
             map.put("Josh", LocalDate.of(2020, 5, 15));
             map.put("Cory", LocalDate.of(2015, 6, 19));
             map.put("Anderson", LocalDate.of(2013, 8, 24));
             map.put("Steven", LocalDate.of(2017, 10, 2));

             //1. Display the names of the employee who were hired before 2015
            // Hint: You can use isBefore method of LocalDate

        for (Map.Entry<String, LocalDate> eachEmployee : map.entrySet()) {
            if(eachEmployee.getValue().isBefore(LocalDate.of(2015, 6, 19))){
                System.out.println("Employee who were hired before 2015 = "+eachEmployee.getKey());
            }

            // 2. display the name of the employee who were hired on 5/15/2020
            //  Hint: You can use isEqual method of LocalDate
            if(eachEmployee.getValue().isEqual(LocalDate.of(2020, 5, 15))){
                System.out.println("Employee who was hired on 5/15/2020 = "+eachEmployee.getKey());
            }

            //3. How many people were hired after 2014?
            //   Hint: You can use isAfter method of LocalDate

            if(eachEmployee.getValue().isAfter(LocalDate.of(2014, 12, 31))){
                System.out.println("Employee who was hired after 2014 = "+eachEmployee.getKey());
            }

        }

        for (Map.Entry<String, LocalDate> eachEmployee : map.entrySet()){
            // 4. display the name and hire date of the employee
            System.out.println(eachEmployee.getKey()+" = "+eachEmployee.getValue());

        }


    }

}

/**
 * 1.  Given the following map that contains the names and hired date of employees:
 *          Map<String, LocalDate> map = new LinkedHashMap<>();
 *             map.put("John", LocalDate.of(2018, 9, 5));
 *             map.put("Antony", LocalDate.of(2012, 7, 29));
 *             map.put("Jimmy", LocalDate.of(2014, 4, 1));
 *             map.put("James", LocalDate.of(2016, 11, 2));
 *             map.put("Josh", LocalDate.of(2020, 5, 15));
 *             map.put("Cory", LocalDate.of(2015, 6, 19));
 *             map.put("Anderson", LocalDate.of(2013, 8, 24));
 *             map.put("Steven", LocalDate.of(2017, 10, 2));
 *
 *         1. Display the names of the employee who were hired before 2015
 *                     Hint: You can use isBefore method of LocalDate
 *
 *         2. display the name of the employee who were hired on 5/15/2020
 *                     Hint: You can use isEqual method of LocalDate
 *
 *         3. How many people were hired after 2014?
 *                     Hint: You can use isAfter method of LocalDate
 *
 *         4. display the name and hire date of the employee
 */
