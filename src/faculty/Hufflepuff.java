package faculty;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgress, int hardworking, int loyal, int honest) {
        super(name, surname, powerOfMagic, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; GHufflepuff{hardworking=\{hardworking}, loyal=\{loyal}, honest=\{honest}\{'}'}";
    }

    @Override
    public void printParametrs() {
        System.out.println(this);
    }

    public void compareStudents(Hufflepuff student) {
        int sum1 = this.hardworking + this.loyal + this.honest;
        int sum2 = student.hardworking + student.loyal + student.honest;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} лучший Пуффендуйец, чем \{student.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} лучший Пуффендуйец, чем \{this.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}

