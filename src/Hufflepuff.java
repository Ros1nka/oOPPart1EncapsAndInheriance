class Hufflepuff extends Hogwarts {
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

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.hardworking + student1.loyal + student1.honest;
        int sum2 = student2.hardworking + student2.loyal + student2.honest;

        if (sum1 > sum2) {
            System.out.println(STR."\{student1.getName()} лучший Пуффендуйец, чем \{student2.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student2.getName()} лучший Пуффендуйец, чем \{student1.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}

