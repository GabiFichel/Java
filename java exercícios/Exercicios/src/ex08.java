import java.util.ArrayList;
import java.util.Arrays;
public class ex08 {
    public static void main (String[] args){
        String[] disciplinas = {"matemática", "filosofia", "história", "física"};
        ArrayList <String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
        novaLista.add("geografia");
        novaLista.add("lingua inglesa");
        for (String i: novaLista) {
            System.out.println("Disciplina: " +i);
        }
    }
}
