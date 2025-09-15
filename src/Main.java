//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        DogWalkCompany company = new DogWalkCompany();
        DogWalker walker = new DogWalker(4, company);

        System.out.println(walker.dogWalkShift(12, 16));
    }
}