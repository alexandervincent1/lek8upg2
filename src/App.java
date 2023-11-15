import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        int poäng = 0;
        System.out.println("Vad är ditt favorit programmerings språk");
        System.out.println("1. C++ 2. Java 3. Phyton");
        int Fråga1 = tangentbord.nextInt();
        while (Fråga1>3) {
            Fråga1=0;
            System.out.println("Fel svar vi testar igen");
            System.out.println("Vad är ditt favorit programmerings språk");
            System.out.println("1. C++ 2. Java 3. Phyton");
            Fråga1 = tangentbord.nextInt();
         }
         if (Fråga1 == 1) {
            poäng++;
            System.out.println("DItt favorit språk är C++. Du har "+poäng+" poäng");
        }
         else if (Fråga1 == 2) {
            poäng++;
            System.out.println("DItt favorit språk är Java. Du har "+poäng+" poäng");
        }
        else if (Fråga1 == 3) {
            poäng++;
            System.out.println("DItt favorit språk är Phyton. Du har "+poäng+" poäng");
        }

        System.out.println("Vad är ditt favorit spel?");
        System.out.println("1. CS:GO 2. LoL 3. WoW");
        int Fråga2 = tangentbord.nextInt();

        while (Fråga2>3) {
            Fråga1=0;
            System.out.println("Fel svar vi testar igen");
            System.out.println("Vad är ditt favorit spel?");
            System.out.println("1. CS:GO 2. LoL 3. WoW");
            Fråga1 = tangentbord.nextInt();
         }
         if (Fråga2 == 1) {
            poäng++;
            System.out.println("Ditt favoritspel är CS:GO. Du har "+poäng+" poäng");
        }
         else if (Fråga2 == 2) {
            poäng++;
            System.out.println("Ditt favoritspel är LoL.  Du har "+poäng+" poäng");
        }
        else if (Fråga2 == 3) {
            poäng++;
            System.out.println("Ditt favoritspel är WoW. Du har "+poäng+" poäng");
        }

        System.out.println("Du fick "+poäng+"/2 poäng");


    }
}
