import java.util.*;

public class IndianHolidays2025 {
    public static void main(String[] args) {
        Map<String, String> holidays = new LinkedHashMap<>();

        holidays.put("New Year's Day", "1 January 2025");
        holidays.put("Republic Day", "26 January 2025");
        holidays.put("Maha Shivaratri", "28 February 2025");
        holidays.put("Holi", "17 March 2025");
        holidays.put("Good Friday", "18 April 2025");
        holidays.put("Eid al-Fitr (Tentative)", "31 March 2025");
        holidays.put("Independence Day", "15 August 2025");
        holidays.put("Raksha Bandhan", "9 August 2025");
        holidays.put("Janmashtami", "18 August 2025");
        holidays.put("Gandhi Jayanti", "2 October 2025");
        holidays.put("Dussehra", "2 October 2025");
        holidays.put("Diwali", "21 October 2025");
        holidays.put("Christmas", "25 December 2025");

        System.out.println("Holidays in India - 2025:");
        for (Map.Entry<String, String> holiday : holidays.entrySet()) {
            System.out.println(holiday.getKey() + " - " + holiday.getValue());
        }
    }
}