import java.util.ArrayList;
public class Ex3 {
    public static void main(String[] args) {

        ArrayList<Integer> par = new ArrayList<>();

        for (int i = 2; par.size() < 20; i += 2) par.add(i);
        par.removeIf(n -> n % 4 == 0);
        System.out.println(par);
    }
}