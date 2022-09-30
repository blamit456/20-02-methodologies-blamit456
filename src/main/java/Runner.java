import java.util.Scanner;
import static java.lang.System.out;

// Name: Parth Mittal
// Date Started: September 30, 2022
// Date Completed: October 3, 2022

public class Runner {

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner( System.in );

//  Uncomment this section when you are ready to test out the Distance.

        out.print("Enter X1 :: ");
        int x1 = keyboard.nextInt();
        out.print("Enter Y1 :: ");
        int y1 = keyboard.nextInt();
        out.print("Enter X2 :: ");
        int x2 = keyboard.nextInt();
        out.print("Enter Y2 :: ");
        int y2 = keyboard.nextInt();

        out.printf( "distance == %.3f\n",Methodologies.howFar( x1, y1, x2, y2 ) );


//  Uncomment this section when you are ready to test out the Quadratics.



		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();
		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();
		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();


		System.out.println( Methodologies.getRootAdd( quadA,quadB,quadC ) );
		System.out.println( Methodologies.getRootSub( quadA,quadB,quadC ) );



//  Add a section of code to test the howFast method.

        out.print("Enter distance :: ");
        int distanceInMiles = keyboard.nextInt();
        out.print("Enter time in hours :: ");
        int hours = keyboard.nextInt();
        out.print("Enter time in minutes :: ");
        double minutes = keyboard.nextDouble();

        out.printf( "speed == %.3f\n", Methodologies.howFast(distanceInMiles, hours, minutes));
    }

}
