import java.util.Objects;

public class BiologyStudent implements Citizen{
    private int identityCardNumber;
    private String adress;

    public BiologyStudent() {
    }

    public BiologyStudent(int identityCardNumber, String adress) {
        this.identityCardNumber = identityCardNumber;
        this.adress = adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiologyStudent that = (BiologyStudent) o;
        return identityCardNumber == that.identityCardNumber && Objects.equals(adress, that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityCardNumber, adress);
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "identityCardNumber=" + identityCardNumber +
                ", adress='" + adress + '\'' +
                '}';
    }


}
