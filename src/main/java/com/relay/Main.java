
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

        // Get scenario from command-line argument
        String scenario = args.length > 0
                ? args[0].toUpperCase()
                : "ALL";

        if (!scenario.equals("ALL")
                && !scenario.equals("NORMAL")
                && !scenario.equals("MISMATCH")
                && !scenario.equals("COMMUNICATION_FAILURE")) {

            System.out.println("Invalid scenario: " + scenario);
            System.out.println("Available options: ALL, NORMAL, MISMATCH, COMMUNICATION_FAILURE");
            return;
        }

        System.out.println("Smart Relay Monitoring System");
        System.out.println("--------------------------------");
        System.out.println("Selected Scenario: " + scenario);

        displayRelay("Relay 1", true, true, true, scenario);
        displayRelay("Relay 2", true, true, true, scenario);
        displayRelay("Relay 3", true, false, true, scenario);
        displayRelay("Relay 4", true, false, false, scenario);
    }

    public static void displayRelay(
            String relayName,
            boolean relayOn,
            boolean feedbackOn,
            boolean communicationOK,
            String scenario) {

        String status = checkRelay(
                relayName, relayOn, feedbackOn, communicationOK);

        if (scenario.equals("ALL") || scenario.equals(status)) {
            System.out.println("\n" + relayName);
            System.out.println("Relay Status: " + status);
        }
    }
}
