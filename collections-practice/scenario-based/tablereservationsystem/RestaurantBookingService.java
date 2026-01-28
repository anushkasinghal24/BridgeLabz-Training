package tablereservationsystem;

import java.util.*;

public class RestaurantBookingService{

    private Map<Integer,Table> tables = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();


    public RestaurantBookingService(){
        tables.put(1,new Table(1,4));
        tables.put(2,new Table(2,2));
        tables.put(3,new Table(3,6));
        tables.put(4,new Table(4,8));
        tables.put(5,new Table(5,10));
    
    }

    public void reserveTable(int tableNumber, String timeslot, String customerName) throws TableAlreadyBookedException{

        for(Reservation r:reservations){
            if(r.getTableNumber() == tableNumber && r.getTimeslot().equalsIgnoreCase(timeslot)){

                throw new TableAlreadyBookedException(
                    "Table "+tableNumber+" is already booked for "+timeslot

                );

            }
        }


        reservations.add(new Reservation(tableNumber,timeslot,customerName));
        System.out.println("Table booked successfully "+tableNumber+" for "+timeslot+" by "+customerName);
    }


    public void cancelReservation(int tableNumber, String timeslot){
        boolean removed = reservations.removeIf(r->r.getTableNumber()==tableNumber && r.getTimeslot().equalsIgnoreCase(timeslot));

        if(removed){
            System.out.println("Reservation cancelled for table "+tableNumber+" at "+timeslot);
        }else{
            System.out.println("No reservation found for table "+tableNumber+" at "+timeslot);
        
        }




    }


    public void showAvailableTables(String time){
        System.out.println("Available tables for "+time);

        for(int tableNumber:tables.keySet()){
            boolean booked=false;

            for(Reservation r:reservations){
                if(r.getTableNumber()==tableNumber && r.getTimeslot().equalsIgnoreCase(time)){
                    booked=true;
                    break;
                }
        }

        if(!booked){
            System.out.println("Table "+tableNumber);
        }
    
        }
    }


}