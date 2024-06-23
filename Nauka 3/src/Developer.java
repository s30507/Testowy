import java.util.ArrayList;

public class Developer extends Employee{
    public ArrayList<Technology> technologieKtoreZnam = new ArrayList();


    public void addTechnology(Technology t){
        this.technologieKtoreZnam.add(t);
    }


    public Developer(String imie, String nazwisko, String email, double pesel,double phoneNumber, String email, double rokZatrudnienia) {
        super(imie, nazwisko, email, pesel, phoneNumber, email, rokZatrudnienia);
    }
}
