import java.util.*;

public class Ex02Deque {
    public static void main(String[] args) {
        Deque<Estudante> studentDeque = new ArrayDeque<>();

        EstudanteGraduacao eg1 = new EstudanteGraduacao("Maria", "Rua A", "Java Programming");
        EstudanteGraduacao eg2 = new EstudanteGraduacao("João", "Rua B", "Python Basics");

        System.out.println("=== Testing Deque operations ===");

        studentDeque.addFirst(eg1);
        studentDeque.addLast(eg2);

        System.out.println("Offer result: " + studentDeque.offerFirst(eg1));

        System.out.println("\nTesting poll (empty deque):");
        studentDeque.clear();
        Estudante polledStudent = studentDeque.poll();
        System.out.println("Polled student: " + (polledStudent == null ? "null" : polledStudent.getNome()));

        System.out.println("\nTesting remove (empty deque):");
        try {
            studentDeque.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}