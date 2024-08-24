package faculty;

public class Gryffindor extends Hogwarts {
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
        return STR."\{super.toString()}; faculty.Gryffindor{nobility=\{nobility}, honor=\{honor}, bravery=\{bravery}\{'}'}";
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Gryffindor student) {
        int sum1 = this.nobility + this.honor + this.bravery;
        int sum2 = student.nobility + student.honor + student.bravery;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} лучший Гриффиндорец, чем \{student.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} лучший Гриффиндорец, чем \{this.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
