import java.util.ArrayList;

public class Tester extends Employee{

    public ArrayList <String> ListaRodzajówTestów = new ArrayList<>();
    String nazwaTestu;
    public Tester(String imie, String nazwisko, String email, double pesel, double rokZatrudnienia) {
        super(imie, nazwisko, email, pesel, rokZatrudnienia);
    }
    public void addTestType(String nazwaTestu){
    this.ListaRodzajówTestów.add(nazwaTestu);
    }

}
