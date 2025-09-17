public class DogWalker {
    /**
     * The maximum number of dogs this walker can walk simultaneously
     * per hour
     */
    private int maxDogs;

    /**
     * The dog-walking company this walker is associated with
     */
    private DogWalkCompany company;

    /**
     * Assigns max to maxDogs and comp to company
     * Precondition: max > 0
     */
    public DogWalker(int max, DogWalkCompany comp)
    {
        maxDogs = max;
        company = comp;
    }

    /**
     * Takes at least one dog for a walk during the time specified by
     * hour, as described in part (a)
     * Preconditions: 0 <= hour <= 23
     * maxDogs > 0
     */
    public int walkDogs(int hour)
    {
        int dogsAvailable = company.numAvailableDogs(hour);
        int dogsBeingWalked = Math.min(maxDogs, dogsAvailable);
        company.updateDogs(hour, dogsBeingWalked);
        return dogsBeingWalked;
    }

    /**
     * Performs an entire dog-walking shift and returns the amount
     * earned, in dollars, as described in part (b)
     * Preconditions: 0 <= startHour <= endHour <= 23
     * maxDogs > 0
     */
    public int dogWalkShift(int startHour, int endHour)
    {
        int currentHour = startHour;
        int totalEarned = 0;

        while(currentHour <= endHour)
        {
            int dogsBeingWalked = walkDogs(currentHour);

            if (dogsBeingWalked == maxDogs || (currentHour >= 9 && currentHour <= 17)) {
                totalEarned += 3;
            }

            totalEarned += 5 * dogsBeingWalked;
            currentHour++;
        }

        return totalEarned;
    }


}
