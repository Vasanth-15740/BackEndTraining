package Day5.EnumInJava;

class EnumInJava1 {
    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        for(Day day :Day.values()){
            switch (day){
                case SUNDAY:
                    System.out.println("Sunday is a holiday");
                    break;
                case MONDAY:
                    System.out.println("Monday is a working day");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday is a working day");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday is a working day");
                    break;
                case THURSDAY:
                    System.out.println("Thursday is a working day");
                    break;
                case FRIDAY:
                    System.out.println("Friday is a working day");
                    break;
                case SATURDAY:
                    System.out.println("Saturday is a holiday");
                    break;
            }
        }

    }
}
