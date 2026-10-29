
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
void testRelayOffNormally() {
    assertEquals("NORMAL",
        Main.checkRelay("Relay 2", false, false, true));
}

@Test
void testRelayMismatchWhenFeedbackIsOn() {
    assertEquals("MISMATCH",
        Main.checkRelay("Relay 2", false, true, true));
}

}
