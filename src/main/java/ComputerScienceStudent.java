import java.util.Objects;

public class ComputerScienceStudent implements Citizen{
    private int identityCardNumber;
    private String adress;

    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(int identityCardNumber, String adress) {
        this.identityCardNumber = identityCardNumber;
        this.adress = adress;
    }


    @Override
    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return identityCardNumber == that.identityCardNumber && Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityCardNumber, adress);
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "identityCardNumber=" + identityCardNumber +
                ", adress='" + adress + '\'' +
                '}';
    }
}
