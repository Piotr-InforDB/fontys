package Event;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private String name;

    public Event(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static List<Event> getEvents(){
        List<Event> array = new ArrayList<Event>();

        //ToDo change to DB query
        array.add(new Event("Event 1"));
        array.add(new Event("Event 2"));
        array.add(new Event("Event 3"));

        return array;
    }

}
