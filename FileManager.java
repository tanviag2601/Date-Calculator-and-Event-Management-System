import java.io.*;
public class FileManager
{
    private String fileName;

    // Constructor
    public FileManager(String fileName)
    {
        this.fileName = fileName;
    }

    // Save all events to the file
    public void saveEvents(EventManager manager)
    {
        try
        {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));

            for (int i = 0; i < manager.getEventCount(); i++)
            {
                Event event = manager.getEvent(i);

                writer.println(event.getEventName());
                writer.println(event.getEventDate().getDay());
                writer.println(event.getEventDate().getMonth());
                writer.println(event.getEventDate().getYear());
                writer.println(event.getEventDescription());

                writer.println("--------------------");
            }

            writer.close();

            System.out.println("Events saved successfully.");
        }
        catch (IOException e)
        {
            System.out.println("Error while saving events.");
        }
    }

    // Load events from the file
    public void loadEvents(EventManager manager)
    {
        try
        {
            BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
            );

            // Remove current events before loading saved events
            manager.clearEvents();

            String eventName;

            while ((eventName = reader.readLine()) != null)
            {
                String day = reader.readLine();
                String month = reader.readLine();
                String year = reader.readLine();
                String description = reader.readLine();

                // Read separator line
                reader.readLine();

                Date date = new Date(
                    Integer.parseInt(day),
                    Integer.parseInt(month),
                    Integer.parseInt(year)
                );

                Event event = new Event(
                    eventName,
                    date,
                    description
                );

                manager.addEvent(event);
            }

            reader.close();

            System.out.println("Events loaded successfully.");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No saved event file found.");
        }
        catch (IOException e)
        {
            System.out.println("Error while loading events.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Saved file contains invalid date data.");
        }
    }
}
