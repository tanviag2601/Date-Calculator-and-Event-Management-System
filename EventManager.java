import java.util.*;
public class EventManager
{
    private ArrayList<Event> events;

    // Constructor
    public EventManager()
    {
        events = new ArrayList<Event>();
    }

    // Add a new event
    public void addEvent(Event event)
    {
        events.add(event);
    }

    // Remove an event by its name
    public boolean removeEvent(String eventName)
    {
        for (int i = 0; i < events.size(); i++)
        {
            if (events.get(i).getEventName().equalsIgnoreCase(eventName))
            {
                events.remove(i);
                return true;
            }
        }

        return false;
    }

    // Search for an event by its name
    public Event searchEvent(String eventName)
    {
        for (int i = 0; i < events.size(); i++)
        {
            if (events.get(i).getEventName().equalsIgnoreCase(eventName))
            {
                return events.get(i);
            }
        }

        return null;
    }

    // Display all events
    public void displayAllEvents()
    {
        if (events.size() == 0)
        {
            System.out.println("No events found.");
            return;
        }

        for (int i = 0; i < events.size(); i++)
        {
            System.out.println();
            System.out.println("Event " + (i + 1));
            events.get(i).displayEvent();
        }
    }

    // Get total number of events
    public int getEventCount()
    {
        return events.size();
    }

    // Get an event using its index
    public Event getEvent(int index)
    {
        if (index >= 0 && index < events.size())
        {
            return events.get(index);
        }

        return null;
    }

    // Remove all current events
    public void clearEvents()
    {
        events.clear();
    }
}
