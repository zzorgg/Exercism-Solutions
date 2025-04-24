public class Lasagna {
    public int expectedMinutesInOven() {
        int expected = 40;
        return expected;
    }

   public  int remainingMinutesInOven(int minutes) {
        int remaining = expectedMinutesInOven() - minutes;
        return remaining;
    }

    public int preparationTimeInMinutes(int layers) {
        int prep = layers * 2;
        return prep;
    }

    public int totalTimeInMinutes(int layers, int time) {
        int prepration = preparationTimeInMinutes(layers);
        return prepration + time;
    }
}