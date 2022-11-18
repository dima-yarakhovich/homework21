package Task_1;

public class Sponsor {
    private String name;
    private int proc;

    public Sponsor(String name, int proc) {
        this.name = name;
        this.proc = proc;
    }

    public String getName() {
        return name;
    }

    public int getProc() {
        return proc;
    }
    public void sponsorProc() {
        System.out.printf("Спонсор %s проспонсировал заезд %d%n", name, proc);
    }

    @Override
    public String toString() {
        return name + " сумма: " + proc + " рублей";
    }
}
