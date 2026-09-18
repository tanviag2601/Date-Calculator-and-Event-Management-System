public class Event
{
    private String eventName;
    private Date eventDate;
    private String eventDescription;

    // Constructor
    public Event(String eventName, Date eventDate, String eventDescription)
    {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
    }

    // Get event name
    public String getEventName()
    {
        return eventName;
    }

    // Get event date
    public Date getEventDate()
    {
        return eventDate;
    }

    // Get event description
    public String getEventDescription()
    {
        return eventDescription;
    }

    // Set event name
    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }

    // Set event date
    public void setEventDate(Date eventDate)
    {
        this.eventDate = eventDate;
    }

    // Set event description
    public void setEventDescription(String eventDescription)
    {
        this.eventDescription = eventDescription;
    }

    // Display event details
    public void displayEvent()
    {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Description: " + eventDescription);
    }

    // Convert event to String
    public String toString()
    {
        return eventName + " - " + eventDate + " - " + eventDescription;
    }
}

