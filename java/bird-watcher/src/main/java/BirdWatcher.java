
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1]++;
    }

    public void incrementTodaysCount() {
        getToday();
    }

    public boolean hasDayWithoutBirds() {
       for (int x : birdsPerDay) {
           if(x == 0) {
               return true;
           }
       }
       return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays > 0 && numberOfDays < birdsPerDay.length) {
            int sum = 0;
            for(int i = 1; i < numberOfDays; i++) {
                sum = sum + birdsPerDay[i];
            }
            return sum + birdsPerDay[0];
        } else if(numberOfDays > birdsPerDay.length) {
            int sum = 0;
            for(int i = 1; i < birdsPerDay.length; i++) {
                sum = sum + birdsPerDay[i];
            }
            return sum + birdsPerDay[0];
        }
       return birdsPerDay[0];
    }

    public int getBusyDays() {
        int count = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5) {
                count++;
            }
        }
        return count;
    }
}
