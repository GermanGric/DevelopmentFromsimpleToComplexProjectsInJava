//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Дмитрий";
        String empty = " ";

        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());

        String blank = " \t \n  ";
        System.out.println(blank.isBlank());

    }
}