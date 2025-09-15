public class DogWalkCompany
{
    /**
     * Returns the number of dogs, always greater than 0, that are available
     * for a walk during the time specified by hour
     * Precondition: 0 <= hour <= 23
     */
    public int numAvailableDogs(int hour)
    {
        if (hour <= 6)
        {
            return (int)((Math.random() * 2) + 1);
        }
        else if (hour <= 12)
        {
            return (int)((Math.random() * 7) + 1);
        }
        else if (hour <= 18)
        {
            return (int)((Math.random() * 5) + 1);
        }
        else {
            return (int)((Math.random() * 3) + 1);
        }
    }

    /**
     * Decreases, by numberDogsWalked, the number of dogs available for a walk
     * during the time specified by hour
     * Preconditions: 0 <= hour <= 23
     *                numberDogsWalked > 0
     */
    public void updateDogs(int hour, int numberDogsWalked)
    {
        int dogsNeededToBeWalked = numAvailableDogs(hour);
        dogsNeededToBeWalked -= numberDogsWalked;
    }
}
