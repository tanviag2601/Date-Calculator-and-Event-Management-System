public class DateCalculator
{
    // Check whether a year is a leap year
    public boolean isLeapYear(int year)
    {
        if (year % 400 == 0)
        {
            return true;
        }
        else if (year % 100 == 0)
        {
            return false;
        }
        else if (year % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Return number of days in a month
    public int daysInMonth(int month, int year)
    {
        if (month == 2)
        {
            if (isLeapYear(year))
            {
                return 29;
            }
            else
            {
                return 28;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }
        else
        {
            return 31;
        }
    }

    // Check whether a date is valid
    public boolean isValidDate(Date date)
    {
        if (date.getYear() < 1)
        {
            return false;
        }

        if (date.getMonth() < 1 || date.getMonth() > 12)
        {
            return false;
        }

        if (date.getDay() < 1 ||
            date.getDay() > daysInMonth(date.getMonth(), date.getYear()))
        {
            return false;
        }

        return true;
    }

    // Add number of days to a date
    public Date addDays(Date date, int numberOfDays)
    {
        if (numberOfDays < 0)
        {
            return null;
        }

        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        while (numberOfDays > 0)
        {
            day++;

            if (day > daysInMonth(month, year))
            {
                day = 1;
                month++;

                if (month > 12)
                {
                    month = 1;
                    year++;
                }
            }

            numberOfDays--;
        }

        return new Date(day, month, year);
    }

    // Subtract number of days from a date
    public Date subtractDays(Date date, int numberOfDays)
    {
        if (numberOfDays < 0)
        {
            return null;
        }

        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        while (numberOfDays > 0)
        {
            // Cannot go before 1/1/1
            if (day == 1 && month == 1 && year == 1)
            {
                return null;
            }

            day--;

            if (day < 1)
            {
                month--;

                if (month < 1)
                {
                    month = 12;
                    year--;
                }

                day = daysInMonth(month, year);
            }

            numberOfDays--;
        }

        return new Date(day, month, year);
    }
}
