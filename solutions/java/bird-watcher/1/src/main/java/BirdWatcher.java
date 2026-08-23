
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
      int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        int todaysBirds = birdsPerDay.length - 1;
        return birdsPerDay[todaysBirds];
    }

    public boolean hasDayWithoutBirds() {
       for(int birds : birdsPerDay) {
           if (birds <= 0) {
               return true;
           }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birds = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            birds = birds + birdsPerDay[i];
        }
        return birds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int birds : birdsPerDay) {
            if (birds >= 5) {
                busyDays ++;
            }
        }
        return busyDays;
    }
    public void incrementTodaysCount() {
        int todaysBirds = birdsPerDay.length - 1;
        birdsPerDay[todaysBirds] = birdsPerDay[todaysBirds] + 1;
    }
}