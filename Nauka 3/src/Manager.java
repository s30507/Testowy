import java.util.ArrayList;

public class Manager extends Employee {
    int danymiesiac=10;
public ArrayList <Goal> celeKtoreOsiagnąłem = new ArrayList<>();
public void addGoals(Goal g){
    if(danymiesiac==g.miesiac) {
        this.celeKtoreOsiagnąłem.add(g);
    }
}


    public Manager(String imie, String nazwisko, String email, double pesel, double rokZatrudnienia) {
        super(imie, nazwisko, email, pesel, rokZatrudnienia);
    }

}
