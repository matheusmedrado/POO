import java.util.*;

public class Ex01Collections {
    public static void main(String[] args) {
        EstudanteGraduacao eg1 = new EstudanteGraduacao("Maria", "Rua A", "Java Programming");
        EstudanteGraduacao eg2 = new EstudanteGraduacao("João", "Rua B", "Python Basics");
        EstudanteGraduacao eg3 = new EstudanteGraduacao("Ana", "Rua C", "Web Development");

        ArrayList<EstudanteGraduacao> studentList = new ArrayList<>();
        studentList.add(eg1);
        studentList.add(eg2);
        studentList.add(eg3);

        System.out.println("=== ArrayList before sorting ===");
        for (EstudanteGraduacao e : studentList) {
            e.print();
        }

        Collections.sort(studentList, new Comparator<EstudanteGraduacao>() {
            @Override
            public int compare(EstudanteGraduacao e1, EstudanteGraduacao e2) {
                return e1.getNome().compareTo(e2.getNome());
            }
        });

        System.out.println("\n=== ArrayList after sorting by name ===");
        for (EstudanteGraduacao e : studentList) {
            e.print();
        }

        HashSet<EstudanteGraduacao> studentSet = new HashSet<>();
        studentSet.add(eg1);
        studentSet.add(eg2);
        studentSet.add(eg1);

        System.out.println("\n=== HashSet (no duplicates) ===");
        for (EstudanteGraduacao e : studentSet) {
            e.print();
        }
    }
}