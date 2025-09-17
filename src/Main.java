//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        DogWalkCompany company = new DogWalkCompany();
        System.out.println(company);
        int hour = company.addDogs();
        System.out.println(company);
        DogWalker walker = new DogWalker(4, company);
        System.out.println(walker.walkDogs(hour) + " dogs walked.");
        System.out.println(company.numAvailableDogs(hour) + " dogs remaining.");

        for (int i = 7; i < 11; i++)
            company.addDogs();

        System.out.println(company);
        walker = new DogWalker(3, company);
        System.out.println("$" + walker.dogWalkShift(7, 10) + ".00 earned");
    }
}