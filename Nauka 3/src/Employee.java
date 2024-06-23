public class Employee {
    public String imie;
    public String nazwisko;
    public String email;
    public double pesel;
    public double rokZatrudnienia;
    public int pensja = 3000;
    public double rokAktualny = 2024;

    public Employee(String imie, String nazwisko, String city, double pesel,double phoneNumber, String email, double rokZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    public static int calculateSalary(double rokZatrudnienia, double rokAktualny, double pensja) {
        double lataZatrudnienia = rokAktualny - rokZatrudnienia;
        pensja += pensja + (1000 * lataZatrudnienia);
        return (int) pensja;
    }
}



