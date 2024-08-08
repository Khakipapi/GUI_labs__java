
/*Purpose of this program is to Write a small program that uses the dynamic binding.
 *In your comments explain which statement(s) is doing the dynamic binding.
 * Author: Farmer, Jeannette
 * Date: 02/18/2022
 * Class: CMIS 242
 * Instructor: Thomas Timko

 */

import java.util.Scanner;

public class CMIS242WK6FarmerJReply {

    // class college
    public static class College {

        //private int students ;
        protected float cost;

        public College(float cost) {

        }

        // Constructor college
        public College() {

        }

        // boolean status
        public boolean status(boolean Private, boolean Public) {
            if (Private) {

                System.out.println("This College is private, certainly");

            }
            if (Public) {

                System.out.println("This College is public, certainly");
            }
            return false;
        }

        // method Education
        public void Education() {

            System.out.println("There are private and public colleges.");
        }

        public void Name() {
            System.out.println("What is the name of the school? ");
        }
    }

    public static class Private extends College {

        public Private(float cost) {
            super(cost);
            // TODO Auto-generated constructor stub
        }

        // constructor private
        public Private() {

        }

        public void educate() {
            System.out.println("This college cost is wonderful! ");

        }

        @Override
        public void Name() {
            System.out.println("What is the name of the private school?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("You go to " + name);
        }
    }

    public static class Public extends College {


        // Constructor public
        public Public() {

        }

        public void educate() {
            System.out.println("This college is amazing for low incomes.");


        }

        @Override
        public void Name() {
            System.out.println("What is the name of the public school?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("You go to " + name);
        }
    } // extended Public class



    public static void main( String[] args) {
        // Scanner scan
        Scanner scan = new Scanner(System.in);
        boolean status= true;
        int choice;
        float cost= 0;
        College college= new College(); // object college
        Private privat = new Private(); // object private


        college.Education();
        do {                                   // do function
            System.out.println("\nMENU\t ");
            System.out.println("1: Private College");
            System.out.println("2: public College");
            System.out.println("3: Self Study");
            System.out.println("9: Exit program");
            System.out.println("What college do you attend? ");
            System.out.print("Enter your selection : ");
            choice = scan.nextInt();

            switch(choice){
                case 1:

                    if (choice==1) {

                        System.out.println("What is the cost of this college tuition ? ");
                        cost = scan.nextFloat();
                        if(cost >= 30000) {
                            System.out.println(status);
                            System.out.println("This College is private, certainly.");
                        }
                        else {
                            System.out.println("This is great for a private College.");
                        }

                        privat.educate(); // dynamic binding will happen here as of if/ else statement
                        privat.Name();//dynamic binding of the name of school.
                    }continue;

                case 2:
                    if ( choice== 2) {
                        Public publi = new Public();
                        System.out.println("What is the cost? ");
                        cost = scan.nextFloat();
                        if (cost< 30000) {
                            System.out.println(status);
                            System.out.println("This College is public, certainly.");
                        }



                        else {
                            System.out.println("This is expensive for a public College.");
                            System.out.println("this is too expensive, not possible.");
                            //choice = scan.nextInt();
                            System.out.println("What is the cost? ");
                            cost = scan.nextFloat();

                        }
                        publi.educate();  // dynamic binding will happen here as of if/ else statement
                        publi.Name();//dynamic binding of the name of school.
                    } continue;
                case 3: if (choice == 3)
                {

                }

                default: {
                    System.out.println("Error, Please try again...");
                    continue;
                } // end default
                case 9:
                    System.out.print("Thank you for using the program. Goodbye!\n");

            }
            scan.close();  // close scan
        }while (choice != 9);

    } // end main
} // end CMIS242WK6FarmerJ