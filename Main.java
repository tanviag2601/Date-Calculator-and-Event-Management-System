import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        DateCalculator calculator = new DateCalculator();
        EventManager manager = new EventManager();
        FileManager fileManager = new FileManager("events.txt");

        int choice = 0;

        while (choice != 9)
        {
            System.out.println();
            System.out.println("===== DATE CALCULATOR =====");
            System.out.println("1. Add Event");
            System.out.println("2. Display All Events");
            System.out.println("3. Search Event");
            System.out.println("4. Remove Event");
            System.out.println("5. Add Days to Date");
            System.out.println("6. Subtract Days from Date");
            System.out.println("7. Save Events");
            System.out.println("8. Load Events");
            System.out.println("9. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1)
            {
                System.out.println("Enter event name:");
                String name = sc.nextLine();

                System.out.println("Enter day:");
                int day = sc.nextInt();

                System.out.println("Enter month:");
                int month = sc.nextInt();

                System.out.println("Enter year:");
                int year = sc.nextInt();
                sc.nextLine();

                Date date = new Date(day, month, year);

                if (calculator.isValidDate(date))
                {
                    System.out.println("Enter event description:");
                    String description = sc.nextLine();

                    Event event = new Event(name, date, description);
                    manager.addEvent(event);

                    System.out.println("Event added successfully.");
                }
                else
                {
                    System.out.println("Invalid date.");
                }
            }

            else if (choice == 2)
            {
                manager.displayAllEvents();
            }

            else if (choice == 3)
            {
                System.out.println("Enter event name to search:");
                String name = sc.nextLine();

                Event event = manager.searchEvent(name);

                if (event != null)
                {
                    event.displayEvent();
                }
                else
                {
                    System.out.println("Event not found.");
                }
            }

            else if (choice == 4)
            {
                System.out.println("Enter event name to remove:");
                String name = sc.nextLine();

                boolean removed = manager.removeEvent(name);

                if (removed)
                {
                    System.out.println("Event removed successfully.");
                }
                else
                {
                    System.out.println("Event not found.");
                }
            }

            else if (choice == 5)
            {
                System.out.println("Enter day:");
                int day = sc.nextInt();

                System.out.println("Enter month:");
                int month = sc.nextInt();

                System.out.println("Enter year:");
                int year = sc.nextInt();

                System.out.println("Enter number of days to add:");
                int numberOfDays = sc.nextInt();

                Date date = new Date(day, month, year);

                if (calculator.isValidDate(date))
                {
                    if (numberOfDays >= 0)
                    {
                        Date result = calculator.addDays(date, numberOfDays);

                        System.out.println("Original Date: " + date);
                        System.out.println(
                            "Date after " + numberOfDays + " days: " + result
                        );
                    }
                    else
                    {
                        System.out.println("Number of days cannot be negative.");
                    }
                }
                else
                {
                    System.out.println("Invalid date.");
                }
            }

            else if (choice == 6)
            {
                System.out.println("Enter day:");
                int day = sc.nextInt();

                System.out.println("Enter month:");
                int month = sc.nextInt();

                System.out.println("Enter year:");
                int year = sc.nextInt();

                System.out.println("Enter number of days to subtract:");
                int numberOfDays = sc.nextInt();

                Date date = new Date(day, month, year);

                if (calculator.isValidDate(date))
                {
                    if (numberOfDays >= 0)
                    {
                        Date result = calculator.subtractDays(date, numberOfDays);

                        if (result != null)
                        {
                            System.out.println("Original Date: " + date);
                            System.out.println(
                                "Date before " + numberOfDays +
                                " days: " + result
                            );
                        }
                        else
                        {
                            System.out.println(
                                "Cannot go before 1/1/1."
                            );
                        }
                    }
                    else
                    {
                        System.out.println("Number of days cannot be negative.");
                    }
                }
                else
                {
                    System.out.println("Invalid date.");
                }
            }

            else if (choice == 7)
            {
                fileManager.saveEvents(manager);
            }

            else if (choice == 8)
            {
                fileManager.loadEvents(manager);
            }

            else if (choice == 9)
            {
                System.out.println("Exiting Date Calculator...");
            }

            else
            {
                System.out.println("Invalid choice.");
            }
        }
    }
}
