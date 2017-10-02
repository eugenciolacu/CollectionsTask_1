package main.java.model;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class WorkersMap {

    private Map <LocalDateTime, Worker> tmapOfWorkers = new TreeMap<>();

    {
        tmapOfWorkers.put(LocalDateTime.of(2017, Month.SEPTEMBER, 18, 8, 0, 0),
                        new Worker("Eugen", "Ciolacu", 36, true,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway"))));
        tmapOfWorkers.put(LocalDateTime.of(2016, Month.OCTOBER, 1, 8, 0, 0),
                        new Worker("Pavel", "Turcu", 30, false,
                        new ArrayList<String> (Arrays.asList("Moldova", "Tanzania", "Kazakhstan"))));
        tmapOfWorkers.put(LocalDateTime.of(2015, Month.NOVEMBER, 5, 9, 0, 0),
                        new Worker("Tom", "Cruse", 50, true,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway", "Moldova", "Tanzania", "Kazakhstan"))));
        tmapOfWorkers.put(LocalDateTime.of(2014, Month.DECEMBER, 10, 10, 20, 0),
                        new Worker("Megan", "Fox", 30, false,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway", "Moldova", "Tanzania", "Kazakhstan", "Romania", "Denmark"))));
        tmapOfWorkers.put(LocalDateTime.of(2013, Month.JANUARY, 15, 12, 0, 0),
                        new Worker("Andrea", "Balan", 35, true,
                        new ArrayList<String> (Arrays.asList("Moldova", "Tanzania", "Kazakhstan", "Romania", "Denmark"))));
        tmapOfWorkers.put(LocalDateTime.of(2013, Month.JANUARY, 15, 12, 0, 0),
                        new Worker("Ion", "Popa", 18, false,
                        new ArrayList<String> (Arrays.asList("Moldova", "Romania", "Ukraine"))));
        tmapOfWorkers.put(LocalDateTime.of(2012, Month.FEBRUARY, 3, 8, 30, 0),
                        new Worker("Eugen", "Ciolacu", 36, true,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway"))));
        tmapOfWorkers.put(LocalDateTime.of(2005, Month.AUGUST, 4, 9, 50, 0),
                        new Worker("Eugen", "Ciolacu", 36, true,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway"))));
        tmapOfWorkers.put(LocalDateTime.of(2015, Month.JUNE, 22, 9, 0, 0),
                        new Worker("Pamela", "Anderson", 55, true,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway", "Moldova", "Tanzania", "Kazakhstan", "Romania", "Denmark"))));
        tmapOfWorkers.put(LocalDateTime.of(2011, Month.MARCH, 15, 8, 0, 0),
                        new Worker("Igor", "Dodon", 45, false,
                        new ArrayList<String> (Arrays.asList("Uzbekistan", "Russia", "Kazakhstan", "North Korea"))));
        tmapOfWorkers.put(LocalDateTime.of(2005, Month.MARCH, 13, 11, 0, 0),
                        new Worker("Marian", "Lupu", 50, true,
                        new ArrayList<String> (Arrays.asList("Uzbekistan", "Russia", "Kazakhstan", "North Korea"))));
        tmapOfWorkers.put(LocalDateTime.of(2006, Month.MARCH, 13, 11, 0, 0),
                        new Worker("Vlad", "Filat", 50, false,
                        new ArrayList<String> (Arrays.asList("Uzbekistan", "Russia", "Kazakhstan", "North Korea", "Romania", "Ukraine"))));
        tmapOfWorkers.put(LocalDateTime.of(2008, Month.MARCH, 23, 15, 0, 0),
                        new Worker("Mihai", "Ghimpu", 60, true,
                        new ArrayList<String> (Arrays.asList("Uzbekistan", "Kazakhstan", "North Korea", "Romania", "Ukraine", "Tanzania"))));
        tmapOfWorkers.put(LocalDateTime.of(2011, Month.JUNE, 17, 7, 30, 0),
                        new Worker("Megan", "Fox", 30, false,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway", "Moldova", "Tanzania", "Kazakhstan", "Romania", "Denmark"))));
        tmapOfWorkers.put(LocalDateTime.of(2014, Month.MAY, 28, 8, 30, 0),
                        new Worker("Jet", "Lee", 55, true,
                        new ArrayList<String> (Arrays.asList("USA", "Canada", "Cyprus", "Germany", "Norway", "Japan", "China", "Turkey", "Denmark"))));
        tmapOfWorkers.put(LocalDateTime.of(2010, Month.FEBRUARY, 7, 10, 30, 0),
                        new Worker("Julia", "Gilas", 30, false,
                        new ArrayList<String> (Arrays.asList("Germany", "Norway", "Japan", "China", "Turkey", "Denmark"))));
        tmapOfWorkers.put(LocalDateTime.of(2017, Month.JANUARY, 3, 14, 30, 0),
                        new Worker("Raquele", "Pomeplan", 33, true,
                        new ArrayList<String> (Arrays.asList("Germany", "Norway", "Japan", "China", "Turkey", "Denmark", "Spain", "Portugal", "Peru"))));
        tmapOfWorkers.put(LocalDateTime.of(2015, Month.APRIL, 3, 11, 30, 0),
                        new Worker("Sara", "Conor", 33, false,
                        new ArrayList<String> (Arrays.asList("Germany", "Norway", "Japan", "China", "Turkey", "Denmark", "Spain", "Portugal", "Peru", "USA", "Russia"))));
        tmapOfWorkers.put(LocalDateTime.of(2016, Month.APRIL, 3, 23, 00, 0),
                        new Worker("Johny", "Walker", 80, true,
                        new ArrayList<String> (Arrays.asList("Germany", "Norway", "Japan", "China", "Turkey", "Denmark", "Spain", "Portugal", "Peru", "USA", "Russia"))));
        tmapOfWorkers.put(LocalDateTime.of(2015, Month.NOVEMBER, 8, 23, 30, 0),
                        new Worker("Jack", "Daniels", 80, false,
                        new ArrayList<String> (Arrays.asList("Germany", "Norway", "Japan", "China", "Turkey", "Denmark", "Spain", "Portugal", "Peru", "USA", "Russia"))));
    }


    private Map <LocalDateTime, Worker> workersReadyForTrip(LocalDateTime startDate, LocalDateTime endDate){
        Map <LocalDateTime, Worker> workersReadyForTripMap = new HashMap<>();
        List <Worker> tmp = new ArrayList<>();

        for(Map.Entry <LocalDateTime, Worker> entry : tmapOfWorkers.entrySet()) {
            LocalDateTime key = entry.getKey();
            Worker value = entry.getValue();
            tmp.add(value);

            if (value.isReadyForTrip() && key.isAfter(startDate) && key.isBefore(endDate) && !workersReadyForTripMap.containsValue(value)){
                workersReadyForTripMap.put(key, value);
            }
        }

        return workersReadyForTripMap;
    }

    private Map <String, ArrayList <Worker>> countriesToVisitByWorkers(LocalDateTime begin, LocalDateTime end){
        Map <String, ArrayList <Worker>> tmp = new TreeMap <>((o1, o2) -> o2.compareTo(o1));
        List <String> countries = new ArrayList<>();
        Map <LocalDateTime, Worker> workersReadyForTripMap = workersReadyForTrip(begin, end);

        for(Map.Entry <LocalDateTime, Worker> entry : workersReadyForTripMap.entrySet()){
            LocalDateTime key = entry.getKey();
            Worker value = entry.getValue();

            List <String> countriesTmp = value.getCountries();
            for(String country : countriesTmp){
                if (!countries.contains(country))
                    countries.add(country);
            }
        }

        for(String country : countries){
            ArrayList <Worker> w = new ArrayList<>();
            for(Map.Entry <LocalDateTime, Worker> entry : workersReadyForTripMap.entrySet()){
                Worker value = entry.getValue();
                if(value.canVisitCountry(country) && !w.contains(value))
                    w.add(value);
            }
            tmp.put(country, w);
        }

        return Collections.unmodifiableMap(tmp);
    }

    public void printCountriesToVisitByWorkersHiredBetween(LocalDateTime begin, LocalDateTime end){
        Map <String, ArrayList <Worker>> tmp = countriesToVisitByWorkers(begin, end);

        for(Map.Entry <String, ArrayList <Worker>> entry : tmp.entrySet()) {
            String key = entry.getKey();
            ArrayList<Worker> value = entry.getValue();

            System.out.print(key + " - ");
            for(int i = 0; i < value.size(); i++){
                System.out.print(value.get(i).getFirstName() + " " + value.get(i).getLastName() + "   ");
            }
            System.out.println();
        }
    }










}
