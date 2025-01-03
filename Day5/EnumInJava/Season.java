package Day5.EnumInJava;

class EnumInJava2 {

    enum Season {
        WINTER("-2°C"),
        SPRING("20°C"),
        SUMMER("40°C"),
        FALL("10°C");

        String averageTemperature;

        Season(String averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public String getAverageTemperature() {
            return averageTemperature;
        }
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " Avg Temperature: " + season.getAverageTemperature());
        }
    }
}
