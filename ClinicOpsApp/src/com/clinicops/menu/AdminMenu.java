package com.clinicops.menu;

import com.clinicops.util.ScannerHelper;

import java.util.Scanner;

public class AdminMenu {

    private static final int DOCTOR_ENTRY = 1;
    private static final int BULK_ENTRY = 2;
    private static final int VIEW_AUDIT = 3;
    private static final int DISPLAY_DOCTORS = 4;
    private static final int LOGOUT = 5;

    // Doctor Data (class-level)
    private static String doc1Name = "", doc1Spec = "", doc1Shift = "";
    private static int doc1Exp = 0;

    private static String doc2Name = "", doc2Spec = "", doc2Shift = "";
    private static int doc2Exp = 0;

    private static String doc3Name = "", doc3Spec = "", doc3Shift = "";
    private static int doc3Exp = 0;

    public static void show(Scanner scanner) {

        boolean logout = false;

        while (!logout) {

            displayAdminOptions();

            int choice = ScannerHelper.readIntWithPrompt(scanner, "Enter choice: ");

            switch (choice) {

                case DOCTOR_ENTRY:
                    registerDoctors(scanner);
                    break;

                case BULK_ENTRY:
                    System.out.println("[Bulk CSV logic will be implemented]");
                    break;

                case VIEW_AUDIT:
                    System.out.println("[Audit log logic will be implemented]");
                    break;

                case DISPLAY_DOCTORS:
                    displayDoctors();
                    break;

                case LOGOUT:
                    logout = true;
                    System.out.println("Logging out Admin...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void displayAdminOptions() {
        System.out.println("\n--- CLINIC ADMIN MENU ---");
        System.out.println("1. Doctors' Entry");
        System.out.println("2. Bulk Entry (CSV)");
        System.out.println("3. View Audit Logs");
        System.out.println("4. Display All Doctors");
        System.out.println("5. Logout");
    }

    private static void registerDoctors(Scanner scanner) {

        System.out.println("\n--- Enter Doctor Details ---");

        // Doctor 1
        System.out.println("\nDoctor 1:");
        doc1Name = ScannerHelper.readStringWithPrompt(scanner, "Name: ");
        doc1Spec = ScannerHelper.readStringWithPrompt(scanner, "Specialization: ");
        doc1Exp = ScannerHelper.readIntWithPrompt(scanner, "Experience: ");
        doc1Shift = ScannerHelper.readStringWithPrompt(scanner, "Shift: ");

        // Doctor 2
        System.out.println("\nDoctor 2:");
        doc2Name = ScannerHelper.readStringWithPrompt(scanner, "Name: ");
        doc2Spec = ScannerHelper.readStringWithPrompt(scanner, "Specialization: ");
        doc2Exp = ScannerHelper.readIntWithPrompt(scanner, "Experience: ");
        doc2Shift = ScannerHelper.readStringWithPrompt(scanner, "Shift: ");

        // Doctor 3
        System.out.println("\nDoctor 3:");
        doc3Name = ScannerHelper.readStringWithPrompt(scanner, "Name: ");
        doc3Spec = ScannerHelper.readStringWithPrompt(scanner, "Specialization: ");
        doc3Exp = ScannerHelper.readIntWithPrompt(scanner, "Experience: ");
        doc3Shift = ScannerHelper.readStringWithPrompt(scanner, "Shift: ");

        System.out.println("\nDoctors registered successfully!");
    }

    private static void displayDoctors() {

        System.out.println("\n--- CLINIC: REGISTERED DOCTORS ---");

        if (doc1Name.isEmpty() && doc2Name.isEmpty() && doc3Name.isEmpty()) {
            System.out.println("No doctors registered yet.");
            return;
        }

        if (!doc1Name.isEmpty()) {
            System.out.println("ID: D001 | Name: " + doc1Name +
                    " | Spec: " + doc1Spec +
                    " | Exp: " + doc1Exp +
                    " | Shift: " + doc1Shift);
        }

        if (!doc2Name.isEmpty()) {
            System.out.println("ID: D002 | Name: " + doc2Name +
                    " | Spec: " + doc2Spec +
                    " | Exp: " + doc2Exp +
                    " | Shift: " + doc2Shift);
        }

        if (!doc3Name.isEmpty()) {
            System.out.println("ID: D003 | Name: " + doc3Name +
                    " | Spec: " + doc3Spec +
                    " | Exp: " + doc3Exp +
                    " | Shift: " + doc3Shift);
        }
    }
}