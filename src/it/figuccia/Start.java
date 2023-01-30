package it.figuccia;

import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        int endOfMonth = today.lengthOfMonth();

        System.out.println("there are " + (endOfMonth-today.getDayOfMonth())
                + " days to the end of "+ today.getMonth()
        );
        System.out.println("there are "+(today.lengthOfYear()-today.getDayOfYear())
                + " days to the end of "+today.getYear()
        );
    }
}
