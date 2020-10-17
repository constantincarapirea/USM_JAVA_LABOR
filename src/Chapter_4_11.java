import java.util.Scanner;
public class Chapter_4_11 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int mil,gol ,trip = 0, tripCoun=0;
        double milGalon,TotalLPG=0;
        while(trip !=-1)
        {
            System.out.print("Get used galon:");
            gol =in.nextInt();
            System.out.print("Get driven miles:");
            mil=in.nextInt();
            milGalon=(double)mil/gol;
            System.out.println("Trip mil/galon:"+milGalon);
            TotalLPG =mil+TotalLPG;
            System.out.print("trip nr.-1 to Exit:");
            trip=in.nextInt();
            tripCoun++;
        }
        System.out.println("Total trip :"+ tripCoun);
        System.out.println("Total mil/galon:"+ TotalLPG);
    }
}
