
public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegistrationPlate that = (RegistrationPlate) o;

        if (!getRegCode().equals(that.getRegCode())) return false;
        return getCountry().equals(that.getCountry());
    }

    @Override
    public int hashCode() {
        int result = getRegCode().hashCode();
        result = 31 * result + getCountry().hashCode();
        return result;
    }
}