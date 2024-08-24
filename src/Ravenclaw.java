class Ravenclaw extends Hogwarts {
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

    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.smart + student1.wise + student1.witi + student1.fullOfCreativity;
        int sum2 = student2.smart + student2.wise + student2.witi + student2.fullOfCreativity;

        if (sum1 > sum2) {
            System.out.println(STR."\{student1.getName()} лучший Когтевранец, чем \{student2.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student2.getName()} лучший Когтевранец, чем \{student1.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
