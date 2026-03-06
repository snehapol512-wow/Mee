package Collections.base.sets;
import java.util.Set;
import java.util.TreeSet;
public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(); //We use TreeSet to get any random order in ascending
     // Normally ascending order
     scores.add(100);
     scores.add(412);
     scores.add(424);
     scores.add(484);
     scores.add(371);
        System.out.println("LeaderBoard starts : " + scores);
    }
}
