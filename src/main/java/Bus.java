import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPerson(Person person) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePerson() {
        this.passengers.remove(0);
    }

    public void pickUpPerson(BusStop busStop) {
        Person person = busStop.removePerson();
        this.addPerson(person);
    }
}

