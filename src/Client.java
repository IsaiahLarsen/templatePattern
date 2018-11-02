/*
 * Program to verify credit cards
 * this is the driver program
 */
public class Client {
    public static void main(String[] args) {

        //Will print valid unless one of the checks fails then it will print the errors for that card

        //visa card
        System.out.println("Visa Card Info:");
        TemplatePattern myVisa =
                new VisaCard("432156334125", 11, 2018);
        if (myVisa.isValid())
            System.out.println("Valid Credit Card Information");


        //diner card

        System.out.println("\nDiner Card Info:");
        TemplatePattern myDiner =
                new DinersCard("38520000023237", 11, 2018);
        if (myDiner.isValid())
            System.out.println("Valid Credit Card Information");

        // master card
        System.out.println("\nMaster Card Info:");
        TemplatePattern myMaster =
                new MasterCard("5555555555554444", 11, 2018);
        if (myMaster.isValid())
            System.out.println("Valid Credit Card Information");




    }
}