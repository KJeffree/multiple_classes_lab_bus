import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;
    private Bus bus;

    @Before
    public void before() {
        busStop = new BusStop("Ocean Terminal");
        person = new Person();
        bus = new Bus("Ocean Terminal", 80);
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, busStop.personCount());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.personCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addToQueue(person);
        busStop.removePerson();
        assertEquals(0, busStop.personCount());
    }

}
