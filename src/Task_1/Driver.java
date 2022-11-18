package Task_1;

public class Driver<F extends Transport> {

    private final String FIO;
    private String catLicense;
    private final double experience;
    private final F avto;




    protected Driver(String FIO, String catLicense, double experience, F avto) {
        this.FIO = FIO;
        this.catLicense = catLicense;
        this.experience = experience;
        this.avto = avto;
        setCatLicense(catLicense);
    }


    public String getFIO() {
        return FIO;
    }

    public String getCatLicense() {
        return catLicense;
    }

    public void setCatLicense(String catLicense) {
        if (catLicense == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.catLicense=catLicense;
    }

    public double getExperience() {
        return experience;
    }


    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void pauseMoving() {
        System.out.println("Остановиться");
    }

    public void refillAuto() {
        System.out.println("Заправиться");
    }


    @Override
    public String toString() {

        return "Водитель: ФИО= " +this.getFIO()+ " управляет автомобилем "+ this.avto.getBrand()+" / "+this.avto.getModel() +" и будет участвовать в заезде";

    }


}



