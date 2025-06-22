import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class JediMeditation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        boolean hasYoda = false;
        List<String> jediList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String[] inputs = scanner.nextLine().split(" ");
            for (String input : inputs){
                jediList.add(input);
            }
        }

        Iterator<String> jediIterator = jediList.iterator();
        while(jediIterator.hasNext()){
            String jedi = jediIterator.next();
            if(jedi.startsWith("y")){
                jediIterator.remove();
                hasYoda = true;
            }
        }
        if(hasYoda){
            orderWithYoda(jediList);
        }
        else{
            orderWithoutYoda(jediList);
        }
    }

    public static void orderWithoutYoda(List<String> jediList){
        List<String> masters = new ArrayList<>();
        List<String> knights = new ArrayList<>();
        List<String> padawans = new ArrayList<>();
        List<String> toshkoSlav = new ArrayList<>();

        for (String jedi : jediList) {
            if (jedi.startsWith("m")) {
                masters.add(jedi);
            }
            else if (jedi.startsWith("k")) {
                knights.add(jedi);
            }
            else if (jedi.startsWith("p")) {
                padawans.add(jedi);
            }
            else if (jedi.startsWith("t") || jedi.startsWith("s")) {
                toshkoSlav.add(jedi);
            }
        }

        List<String> orderedListOfJedi = new ArrayList<>();
        orderedListOfJedi.addAll(toshkoSlav);
        orderedListOfJedi.addAll(masters);
        orderedListOfJedi.addAll(knights);
        orderedListOfJedi.addAll(padawans);

        System.out.println(String.join(" ", orderedListOfJedi));
    }
    public static void orderWithYoda(List<String> jediList){
        List<String> masters = new ArrayList<>();
        List<String> knights = new ArrayList<>();
        List<String> padawans = new ArrayList<>();
        List<String> toshkoSlav = new ArrayList<>();

        for (String jedi : jediList) {
            if (jedi.startsWith("m")) {
                masters.add(jedi);
            }
            else if (jedi.startsWith("k")) {
                knights.add(jedi);
            }
            else if (jedi.startsWith("p")) {
                padawans.add(jedi);
            }
            else if (jedi.startsWith("t") || jedi.startsWith("s")) {
                toshkoSlav.add(jedi);
            }
        }

        List<String> orderedListOfJedi = new ArrayList<>();
        orderedListOfJedi.addAll(masters);
        orderedListOfJedi.addAll(knights);
        orderedListOfJedi.addAll(toshkoSlav);
        orderedListOfJedi.addAll(padawans);

        System.out.println(String.join(" ", orderedListOfJedi));
    }
}