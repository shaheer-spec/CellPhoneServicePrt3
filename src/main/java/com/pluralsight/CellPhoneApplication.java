package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Phone 1: What is the serial number? ");
        int serialNumber = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Phone 1: What model is the phone for? ");
        String model = myScanner.nextLine();
        System.out.print("Phone 1: Who is the carrier for? ");
        String carrier = myScanner.nextLine();
        System.out.print("Phone 1: What is the phone number? ");
        String phoneNumber = myScanner.nextLine();
        System.out.print("Phone 1: Who is the owner of the phone? ");
        String owner = myScanner.nextLine();
        System.out.println("====================================================");

        CellPhone phone1 = new CellPhone();
        phone1.setSerialNumber(serialNumber);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);

        CellPhone phone2 = new CellPhone();
        System.out.print("Phone 2: What is the serial number? ");
        int serialNumber2 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Phone 2: What model is the phone for? ");
        String model2 = myScanner.nextLine();
        System.out.print("Phone 2: Who is the carrier for? ");
        String carrier2 = myScanner.nextLine();
        System.out.print("Phone 2: What is the phone number? ");
        String phoneNumber2 = myScanner.nextLine();
        System.out.print("Phone 2: Who is the owner of the phone? ");
        String owner2 = myScanner.nextLine();
        System.out.println("====================================================");

        phone2.setSerialNumber(serialNumber2);
        phone2.setModel(model2);
        phone2.setCarrier(carrier2);
        phone2.setPhoneNumber(phoneNumber2);
        phone2.setOwner(owner2);

        System.out.print("Phone 2: What is the serial number? ");
        int serialNumber3 = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Phone 2: What model is the phone for? ");
        String model3 = myScanner.nextLine();
        System.out.print("Phone 2: Who is the carrier for? ");
        String carrier3 = myScanner.nextLine();
        System.out.print("Phone 2: What is the phone number? ");
        String phoneNumber3 = myScanner.nextLine();
        System.out.print("Phone 2: Who is the owner of the phone? ");
        String owner3 = myScanner.nextLine();

        CellPhone phone3 = new CellPhone(serialNumber3, model3, carrier3, phoneNumber3, owner3);

        display(phone1);
        display(phone2);
        display(phone3);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
        phone3.dial(phone2);

    }

    public static void display(CellPhone phone) {
        System.out.println("Phone Details: ");
        System.out.println("The serial number: " + phone.getSerialNumber());
        System.out.println("The model: " + phone.getModel());
        System.out.println("The carrier: " + phone.getCarrier());
        System.out.println("The phone number: " + phone.getPhoneNumber());
        System.out.println("The owner of the phone: " + phone.getOwner());
        System.out.println("====================================================");
    }
}
