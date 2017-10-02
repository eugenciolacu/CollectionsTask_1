package main.java;

import main.java.model.WorkersMap;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args){
        WorkersMap wm = new WorkersMap();

        wm.printCountriesToVisitByWorkersHiredBetween(LocalDateTime.of(2000, Month.JANUARY, 3, 14, 30, 0),
                                                        LocalDateTime.of(2017, Month.SEPTEMBER, 29, 14, 30, 0));

    }
}
