package com.company;

import Event.Event;
import Helpers.Helpers;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException{

        System.out.println("");
        System.out.println("Select action:");
        System.out.println("1. Buy ticket");
        System.out.println("2. Login");
        System.out.print(">");

        int option = Integer.parseInt(Helpers.readLine());
        Helpers.clear();

        if(option == 1){
            Main.selectEvent();
        }
        else if(option == 2){

        }
    }

    static void selectEvent() throws IOException {
        Helpers.clear();
        System.out.println("Select event");

        List<Event> events = Event.getEvents();

        int index = 0;
        for (Event event : events) {
            System.out.println((index + 1) + " " + event.getName());
            index++;
        }

        String eventInput = Helpers.readLine();
        int eventIndex;

//        Check if integer
        try{
            eventIndex = Integer.parseInt(eventInput);
        }
        catch(Exception exception){
            System.out.println("Er is iets foutgegaan, Probeer opnieuw.");
            Main.selectEvent();
            return;
        }

//        Check if event index is correct
        if(eventIndex > events.size() || eventIndex <= 0){
            System.out.println("Onjuiste event.");
            Main.selectEvent();
            return;
        }

        System.out.println("Select Ticket type");

    }
}
