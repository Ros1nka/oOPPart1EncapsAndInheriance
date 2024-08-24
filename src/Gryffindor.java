class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Gryffindor{nobility=\{nobility}, honor=\{honor}, bravery=\{bravery}\{'}'}";
    }

    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.nobility + student1.honor + student1.bravery;
        int sum2 = student2.nobility + student2.honor + student2.bravery;

        if (sum1 > sum2) {
            System.out.println(STR."\{student1.getName()} лучший Гриффиндорец, чем \{student2.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student2.getName()} лучший Гриффиндорец, чем \{student1.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
