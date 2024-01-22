import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 17;
        double gpa = 3.8;
        boolean isRaining = false;
        System.out.println(age + "|" + gpa + "|" + isRaining);


        String city = "Columbus";
        System.out.println(city);
        System.out.println(city.toUpperCase());

        int dailyHighs[] = {50,60,70,80,90,100,110,120};
        System.out.println(dailyHighs.length);

        for(int i=0; i < dailyHighs.length; i++) {
            System.out.println(dailyHighs[i]);


        }

        Scanner input = new Scanner(System.in);


        System.out.println("what is thou name?");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println(name.toLowerCase());


    }
}