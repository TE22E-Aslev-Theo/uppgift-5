import java.util.Scanner;

public class javajj {

    public static void main(String[] args) {
        
        Scanner tangetbord = new Scanner(System.in);
        System.out.println("Divisions program:");
        String tal1 = tangetbord.nextLine();
        String tal2 = tangetbord.nextLine();
        System.out.println("tal 1: " +tal1);
        System.out.println("tal 2: "+tal2);
        System.out.println((Float.parseFloat(tal1)) / Float.parseFloat(tal2));

        System.out.println("Ange ett substantiv:");
        String substantiv = tangetbord.nextLine();
        System.out.println("Substantiv: "+substantiv);
        System.out.println("Ange PluralÄndelse: ");
        String substantivändelse = tangetbord.nextLine();
        System.out.print(substantiv+substantivändelse);
        
        tangetbord.close();
    }
    
}