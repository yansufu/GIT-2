/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git2;
import java.util.Scanner;

/**
 *
 * @author ANNISA D YANSAF
 */
public class GIT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SOAL 1
        System.out.println("Soal 1");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a temperature in celcius = ");
        double celcius = myObj.nextInt();
        double fahrenheit =  ((9.0/5.0)*celcius) + 32;
        System.out.println("Current temperature is " + fahrenheit + " fahrenheit.");
        
        //SOAL 2
        System.out.println("\nSoal 2");
        String[] movies = new String[]{"Harry Potter", "Lord of the Rings", "The Hobbit", "Pirates of the Caribbean"};
        //To access Pirates of the Caribbean, we can use the index from the array
        System.out.println(movies[3]);
        
        //SOAL 3
        System.out.println("\nSoal 3");
        int[] numbers = new int[]{1, 2, 10, 12};
        int num = 0;
        for (int i = 0; i < numbers.length ; i++){
            num = num + numbers[i];
        }
        double average = num / numbers.length;
        System.out.println("The average is " + average);
        
        //SOAL 4
        System.out.println("\nSoal 4");
        String[][] group = new String [][]{
            {"Rudi", "Budi", "Lila"},
            {"Erika", "Nina"},
            {"Lisa", "Anna"},
            {"Didit", "Resti", "Hana"}
        };
        
        for (int i = 0; i < group.length; i++){
            System.out.print("Group " + (i+1) + ": ");
            for (int j = 0; j < group[i].length; j++){
                System.out.print(group[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        //SOAL 5
        System.out.println("\nSoal 5");
        Scanner myMin = new Scanner(System.in);
        System.out.print("Enter a number of minute = ");
        var minute = myMin.nextInt();
        float sec = minute * 60;
        System.out.println(String.format(minute + " minutes is %f seconds", sec));
        
        //SOAL 6
        System.out.println("\nSoal 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a distance (in meter) = ");
        int distance = scanner.nextInt();
        System.out.print("Enter a duration (in minutes) = ");
        int duration = scanner.nextInt();
        double km = distance / 1000.00;
        double hour = duration / 60.00;
        System.out.println("Kecepatan kendaraan adalah " + km +"/"+ hour + " km/jam");
    }
    
}
