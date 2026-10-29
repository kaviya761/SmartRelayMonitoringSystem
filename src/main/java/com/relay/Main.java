
package com.relay;

public class Main {

    public static String checkRelay(
            String relayName,
            boolean relayOn,
            boolean feedbackOn,
            boolean communicationOK) {

        if (!communicationOK) {
            return "COMMUNICATION FAILURE";
        }

        if (relayOn != feedbackOn) {
            return "MISMATCH";
        }

        return "NORMAL";
    }

    public static void main(String[] args) {

        System.out.println("Smart Relay Monitoring System");
        System.out.println("--------------------------------");

        System.out.println("\nRelay 1");
        System.out.println("Relay Status: " +
            checkRelay("Relay 1", true, true, true));

        System.out.println("\nRelay 2");
        System.out.println("Relay Status: " +
            checkRelay("Relay 2", true, true, true));

        System.out.println("\nRelay 3");
        System.out.println("Relay Status: " +
            checkRelay("Relay 3", true, false, true));

        System.out.println("\nRelay 4");
        System.out.println("Relay Status: " +
            checkRelay("Relay 4", true, false, false));
    }
}
