public class Main {
    public static void main(String[] args){
        boolean isAGnu = false;
        if(isAGnu == true)
            System.out.println("It's a Gnu");
        if(isAGnu != true)
            System.out.println("it's not true it's not a Gnu");
        if(isAGnu)
            System.out.println("Hah it's really a gnu");
        if(!isAGnu)
            System.out.println("Oh no a shortened version says it's not a Gnu");
        if(isAGnu)
            System.out.println("Yay short version says it is a Gnu");
        else
            System.out.println("It was not a Gnu so not a Gnu was the only other option");

        String animal = "Dog";

        if(animal == "Cat")
            System.out.println("It's a cat");
        else if (animal == "Gnu")
            System.out.println("It's a Gnu");
        else if (animal == "Wombat")
            System.out.println("It's a Eombat");
        else
            System.out.println("It's a lovely dog");

        int myNumber = 50;
        if(myNumber == 50)
            System.out.println("My number is 50");
        if(myNumber < 100)
            System.out.println("My number is less than 100");
        if(myNumber > 1)
            System.out.println("My number is greater than 1");
        if(myNumber <= 50)
            System.out.println("My number is either 50 or less");
        if(myNumber >= 50)
            System.out.println("my number is either 50 or more");
        if(myNumber >40 && myNumber<60)
            System.out.println("My number is between 41 and 59");
        if(myNumber == 1 || myNumber == 50)
            System.out.println("My number is either 1 or 50");
        if((myNumber == 1 || myNumber == 50) && myNumber > 5)
            System.out.println("My number is either 1 or 50 but is higher than 5 so it's 50 ");

        boolean isGnu = false;

        boolean wasGnu = isGnu ? true : false;

        if(wasGnu)
            System.out.println("wasGnu is true");
        else
            System.out.println("wasGnu was not true");

    }
}
