import java.util.Scanner;

public class Main {
    static int action_today;


    public static void main(String[] arg) {

        Area area = new Area();
        Maths maths = new Maths();
        Perimeter perimeter = new Perimeter();

        boolean calculate = true;
        Scanner scan = new Scanner(System.in);

            System.out.println("What do you want to do today:");
        while (calculate){
            System.out.println("What else do you want to do");
            System.out.println("Enter 1 - Areas of Triangles");
            System.out.println("Enter 2 - Areas of Rectangle");
            System.out.println("Enter 3 - Areas of Circles");
            System.out.println("Enter 4 - For General Arithmetic");
            System.out.println("Enter 5 - Perimeter of Triangles");
            System.out.println("Enter 6 - Perimeter of Rectangle");
            System.out.println("Enter 7 - Perimeter of Circle");
            System.out.println("Enter 0 - to end program");
            System.out.print("Your Choice: ");
            action_today = scan.nextInt();

            if (action_today == 1) { // Triangles
                System.out.print("Enter Base: ");
                area.base = scan.nextDouble();
                System.out.print("Enter Height: ");
                area.height = scan.nextDouble();
                System.out.println("The Area of your rectangle is: " + area.Triangle());

            }
            // Perimeter
            else if (action_today == 5){// Triangle
                System.out.print("Enter 1st side");
                perimeter.a = scan.nextDouble();
                System.out.print("Enter 2nd side");
                perimeter.b = scan.nextDouble();
                System.out.print("Enter 3rd side");
                perimeter.c = scan.nextDouble();
                System.out.println("The perimeter of your triangle is " + perimeter.Triangle());

            }
            else if (action_today == 6){// Rectangle
                System.out.print("Enter length: ");
                perimeter.length = scan.nextDouble();
                System.out.print("Enter width: ");
                perimeter.width = scan.nextDouble();
                System.out.println("The perimeter of your triangle is " + perimeter.Rectangle());
            }

            else if (action_today == 7){// Circle
                System.out.print("Enter radius: ");
                perimeter.radius = scan.nextDouble();
                System.out.println("The perimeter of your triangle is " + perimeter.Circle());
            }
            else if(action_today == 0) {
                calculate = false;
            }
            else if (action_today == 2) {    // Rectangles
                System.out.print("Enter Length: ");
                double length = scan.nextDouble(); // accept the input

                System.out.print("Enter Breadth: ");    // request for input
                double breadth = scan.nextDouble();      // accept the input

                // print result to command line
                System.out.println("The Area of your rectangle is: " + area.Rectangle(length, breadth));
            }
            else if (action_today == 3) {    // Circles
                System.out.print("What is the Radius of Your Circle? ");
                area.radius = scan.nextDouble();
                area.Circle();
                // area.result() below is calling a method in the area class that returns the value of the variable result
                System.out.println("The Area of your Circle is: " + area.result());


            }
            else if(action_today == 4) {// general Arithmetic
                boolean arithmetric = true;

                 {
                    System.out.println("What type of operation ");
                     while(arithmetric){
                    System.out.println("Enter 1- for addition ");
                    System.out.println("Enter 2- for subtraction ");
                    System.out.println("Enter 3- for multiplication ");
                    System.out.println("Enter 4- for division ");
                    System.out.println("Enter 0 - to go back");
                    System.out.print("Your Choice: ");
                    action_today = scan.nextInt();



                    switch (action_today) {
                        case 0:
                            arithmetric = false;
                            break;
                        case 1:
                            System.out.print("Enter 1st Number: ");
                            maths.a = scan.nextDouble();
                            System.out.print("Enter 2nd Number: ");
                            maths.b = scan.nextDouble();
                            System.out.println(maths.Add());
                            break;
                        case 2:
                            System.out.print("Enter 1st Number: ");
                            maths.a = scan.nextDouble();
                            System.out.print("Enter 2nd Number: ");
                            maths.b = scan.nextDouble();
                            maths.subtract();
                            System.out.println(maths.getResult());
                            break;
                        case 3:
                            System.out.print("Enter 1st Number: ");
                            maths.a = scan.nextDouble();
                            System.out.print("Enter 2nd Number: ");
                            maths.b = scan.nextDouble();
                            maths.multiply();
                            System.out.println(maths.getResult());
                            break;
                        case 4:
                            System.out.print("Enter 1st Number: ");
                            maths.a = scan.nextDouble();
                            System.out.print("Enter 2nd Number: ");
                            maths.b = scan.nextDouble();
                            maths.divide();
                            System.out.println(maths.getResult());
                            break;
                        default:
                            System.out.println("Sorry, Enter a number between 1 - 4");
                    }


                }



            }


        }

    }
}}
