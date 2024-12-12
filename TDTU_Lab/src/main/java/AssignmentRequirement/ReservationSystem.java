/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentRequirement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author ADMIN
 */
public class ReservationSystem {

    private ArrayList<Accommodation> accommodations;

    public ReservationSystem(String accPath, String roomPath, String roomOfAccPath) throws FileNotFoundException {
        this.accommodations = loadAccommodation(accPath, roomPath, roomOfAccPath);
    }

    //Implement requirements 1
    public ArrayList<Accommodation> loadAccommodation(String accPath, String roomPath, String roomOfAccPath) throws FileNotFoundException {
        ArrayList<Accommodation> accs = new ArrayList<>();

        //Read file accommodation.csv
        try (Scanner sc = new Scanner(new File(accPath))) {
            while (sc.hasNext()) {
                String[] elements = sc.nextLine().split(",");
                switch (elements.length) {
                    case 5 ->
                        accs.add(new Homestay(Integer.parseInt(elements[0]),
                                elements[1], elements[2], elements[3], Float.parseFloat(elements[4])));
                    case 7 ->
                        accs.add(new Resort(Integer.parseInt(elements[0]),
                                elements[1], elements[2], elements[3],
                                Float.parseFloat(elements[6]), Integer.parseInt(elements[4]), elements[5].equals("yes")));
                    case 6 ->
                        accs.add(new Hotel(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                                Float.parseFloat(elements[5]), Integer.parseInt(elements[4])));
                    case 10 ->
                        accs.add(new Villa(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                                elements[4].equals("yes"), elements[5].equals("yes"), elements[6].equals("yes"),
                                elements[7].equals("yes"), Integer.parseInt(elements[8]), Integer.parseInt(elements[9])));
                    case 11 ->
                        accs.add(new CruiseShip(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3],
                                elements[4].equals("yes"), elements[5].equals("yes"), elements[6].equals("yes"),
                                elements[7].equals("yes"), Integer.parseInt(elements[9]), Integer.parseInt(elements[10]), elements[8].equals("yes")));
                    default -> {
                        System.out.println("Error Req1: Incorrecct format");
                        throw new AssertionError();
                    }
                }
            }
        }

        //Read file room_type.csv
        ArrayList<Room> rooms = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(roomPath))) {
            while (sc.hasNext()) {
                String[] elements = sc.nextLine().split(",");

                rooms.add(new Room(Integer.parseInt(elements[0]), elements[1],
                        Integer.parseInt(elements[2]), elements[3], Integer.parseInt(elements[4]),
                        Integer.parseInt(elements[5]), Double.parseDouble(elements[6]), Double.parseDouble(elements[7])));
            }
        }

        //Mapping room to accommodation
        try (Scanner sc = new Scanner(new File(roomOfAccPath))) {
            while (sc.hasNext()) {
                String[] elements = sc.nextLine().split(",");

                ArrayList<Room> tmp = new ArrayList<>();
                for (Accommodation a : accs) {
                    if (a.idAccomodation == Integer.parseInt(elements[0])) {
                        for (Room r : rooms) {
                            if (r.getRoomID() == Integer.parseInt(elements[1])) {
                                tmp.add(r);
                            }
                        }
                    }
                    if (a instanceof CommonAccommodation commonAcc) {
                        commonAcc.setRooms(tmp);
                    }
                }
            }
        }

        return accs;
    }

    //Implement requirements 2
    public ArrayList<Accommodation> searchForRoom(String city, int numOfPeople) {
        ArrayList<Accommodation> outputList = new ArrayList<>();
        ArrayList<Accommodation> luxurys = new ArrayList<>();
        ArrayList<Accommodation> commons = new ArrayList<>();

        for (Accommodation acc : this.accommodations) {
            switch (acc) {
                case LuxuryAccommodation element -> {
                    if (element.cityAccomodaion.equals(city)
                            && element.getMaxPeopleCanServe() >= numOfPeople) {
                        luxurys.add(element);
                    }
                }
                case CommonAccommodation element -> {
                    if (element.cityAccomodaion.equals(city)
                            && element.getRooms().stream().mapToInt(i -> i.getMaxPeople()).sum() >= numOfPeople) {
                        commons.add(element);
                    }
                }
                default -> {
                }
            }
        }

        luxurys = (ArrayList<Accommodation>) luxurys.stream().sorted((var a1, var a2) -> a1.compareTwoCity(a2)).collect(toList());
        commons = (ArrayList<Accommodation>) commons.stream().sorted((var a1, var a2) -> a1.compareTwoCity(a2)).collect(toList());

        outputList.addAll(luxurys);
        outputList.addAll(commons);
        return outputList;
    }

    //Implement requirement 3
    public ArrayList<Accommodation> searchForRoomByRange(String reservationPath, double priceFrom, double priceTo, Date checkin, Date checkout, String city, int numOfPeople) throws FileNotFoundException {
        ArrayList<Accommodation> ouputList = new ArrayList<>();
        HashMap<Integer, ArrayList<Reservation>> reser = new HashMap<>();
        HashMap<Integer, Accommodation> accs = new HashMap<>();

        try (Scanner sc = new Scanner(new File(reservationPath))) {
            while (sc.hasNext()) {
                String[] elements = sc.nextLine().split(",");

                switch (elements.length) {
                    case 4 -> {
                        long checkInLong = Long.parseLong(elements[2]);
                        long checkOutLong = Long.parseLong(elements[3]);

                        Date checkInDate = new Date(checkInLong);
                        Date checkOutDate = new Date(checkOutLong);
                        if (!reser.containsKey(Integer.valueOf(elements[1]))) {
                            reser.put(Integer.valueOf(elements[1]), new ArrayList<>());
                        }

                        reser.get(Integer.valueOf(elements[1])).add(
                                new Reservation(Integer.parseInt(elements[0]),
                                        Integer.parseInt(elements[1]), -1, checkInDate, checkOutDate)
                        );
                    }
                    case 5 -> {
                        long checkInLong = Long.parseLong(elements[3]);
                        long checkOutLong = Long.parseLong(elements[4]);
                        Date checkInDate = new Date(checkInLong);
                        Date checkOutDate = new Date(checkOutLong);
                        if (!reser.containsKey(Integer.valueOf(elements[1]))) {
                            reser.put(Integer.valueOf(elements[1]), new ArrayList<>());
                        }
                        reser.get(Integer.valueOf(elements[1])).add(
                                new Reservation(Integer.parseInt(elements[0]),
                                        Integer.parseInt(elements[1]), Integer.parseInt(elements[2]), checkInDate, checkOutDate)
                        );
                    }
                    default ->
                        System.out.println("Error: Invalid number of arguments");
                }
            }
        }

        for (Accommodation a : accommodations) {
            if (a.cityAccomodaion.equals(city)) {
                accs.put(a.idAccomodation, a);
            }
        }

        for (var key : accs.keySet()){
            Accommodation a = accs.get(key);
            ArrayList<Reservation> accReservations = reser.getOrDefault(key, new ArrayList<>());
            switch (a) {
                case CommonAccommodation common -> {
                    for (Room room : common.getRooms()) {
                        if (isWithinBudget(room.getRoomCost(), priceFrom, priceTo)
                                && !isReserved(checkin, checkout, accReservations, room.getRoomID())) {
                            ouputList.add(common);
                            break;
                        }
                    }
                }
                case LuxuryAccommodation luxury -> {
                    if (isWithinBudget(luxury.getCostForANight(), priceFrom, priceTo)
                            && !isReserved(checkin, checkout, accReservations, -1)) {
                        ouputList.add(luxury);
                        break;
                    }
                }
                default -> {
                }
            }
        }

        Collections.sort(ouputList, (Accommodation a1, Accommodation a2) -> a2.nameAccomodation.compareTo(a1.nameAccomodation));
        return ouputList;
    }
    
    public boolean isWithinBudget(double cost, double minCost, double maxCost) {
        return cost >= minCost && cost <= maxCost;
    }
    
    // kiểm tra có ngày trống không
    private boolean isReserved(Date checkin, Date checkout, ArrayList<Reservation> reservations, int roomId) {
        for (Reservation r : reservations) {
            if ((roomId == -1 || r.getRoomId()== roomId)
                    && r.getCheckin().compareTo(checkout) <= 0
                    && r.getCheckout().compareTo(checkin) >= 0) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Accommodation> getAccommodations() {
        return accommodations;
    }

    public void setAccommodations(ArrayList<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }
}
