//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Student Andrew = new Student("Andrew",2.74,"R02227445");
        Student Alex = new Student("Alex",3.5,"R02227554");

        System.out.println(Andrew.equals(Alex));
    }
}