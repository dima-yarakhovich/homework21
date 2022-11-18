package Task_1;

public class Mechanic<F extends Transport> {
    private final String name;
    private final String fullName;
    private final String company;

    public Mechanic(String name, String fullName, String company) {
        this.name = name;
        this.fullName = fullName;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean goDiagnostik(F f) {
        return f.goDiagnostik();
    }

    public void repair(F f) {
        f.repair();
    }

    @Override
    public String toString() {
        return name + " " + fullName + " ,из компании " + company;
    }
}

