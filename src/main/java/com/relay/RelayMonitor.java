package com.relay;

public class RelayMonitor {

    private boolean relayOn = true;

    public String getStatus() {
        if (relayOn) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    public void turnOn() {
        relayOn = true;
    }

    public void turnOff() {
        relayOn = false;
    }
}
