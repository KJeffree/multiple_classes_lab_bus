import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 80);
        person = new Person();
        busStop = new BusStop("Ocean Terminal");
        busStop.addToQueue(person);
    }

    @Test
    public void checkBusStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPerson() {
        bus.addPerson(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePerson() {
        bus.addPerson(person);
        bus.removePerson();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassenger() {
        bus.pickUpPerson(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.personCount());
    }

}
