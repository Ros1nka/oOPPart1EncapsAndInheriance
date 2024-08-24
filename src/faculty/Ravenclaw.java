package faculty;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witi;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgress, int smart, int wise, int witi, int fullOfCreativity) {
        super(name, surname, powerOfMagic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witi = witi;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; GRavenclaw{smart=\{smart}, wise=\{wise}, witi=\{witi}, fullOfCreativity=\{fullOfCreativity}\{'}'}";
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Ravenclaw student) {
        int sum1 = this.smart + this.wise + this.witi + this.fullOfCreativity;
        int sum2 = student.smart + student.wise + student.witi + student.fullOfCreativity;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} лучший Когтевранец, чем \{student.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} лучший Когтевранец, чем \{this.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
