import java.util.Random;

public class Methodologies {

    public static double howFar(int x1, int y1, int x2, int y2 ) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static double howFast( int distanceInMiles, int hours, int minutes ) {
        double speed =  distanceInMiles/(hours + minutes/60.0);
        return Math.round(speed);
    }

    public static double getRootAdd( int a, int b, int c ) {
        return (-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    }

    public static double getRootSub( int a, int b, int c ) {
        return (-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
    }

}//end of class