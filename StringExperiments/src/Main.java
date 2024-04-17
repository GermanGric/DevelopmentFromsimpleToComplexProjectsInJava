import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Дмитрий";
        String surname = "Петров";
        LocalDate birthday = LocalDate.of(2000,8,8);
        String personInfo = name +" " + surname + " - " + birthday;
        System.out.println(personInfo);

    }
}