
package com.relay;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RelayMonitorTest {

    @Test
    void testRelayIsInitiallyOn() {
        RelayMonitor relay = new RelayMonitor();
        assertEquals("ON", relay.getStatus());
    }

    @Test
    void testTurnRelayOff() {
        RelayMonitor relay = new RelayMonitor();
        relay.turnOff();
        assertEquals("OFF", relay.getStatus());
    }

    @Test
    void testTurnRelayOn() {
        RelayMonitor relay = new RelayMonitor();
        relay.turnOff();
        relay.turnOn();
        assertEquals("ON", relay.getStatus());
    }

    @Test
    void testNormalRelay() {
        assertEquals(
            "NORMAL",
            Main.checkRelay("Relay 1", true, true, true)
        );
    }

    @Test
    void testRelayMismatch() {
        assertEquals(
            "MISMATCH",
            Main.checkRelay("Relay 3", true, false, true)
        );
    }
@Test
void testCommunicationFailure() {
    assertEquals(
        "COMMUNICATION FAILURE",
        Main.checkRelay("Relay 4", true, false, false)
    );
}
}
