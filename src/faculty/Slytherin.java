package faculty;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstOfPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int thirstOfPower) {
        super(name, surname, powerOfMagic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Slytherin{cunning=\{cunning}, determination=\{determination}, ambition=\{ambition}, resourcefulness=\{resourcefulness}, thirstOfPower=\{thirstOfPower}\{'}'}";
    }

    @Override
    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Slytherin student) {
        int sum1 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstOfPower;
        int sum2 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstOfPower;

        if (sum1 > sum2) {
            System.out.println(STR."\{student.getName()} лучший Слизеринец, чем \{this.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{this.getName()} лучший Слизеринец, чем \{student.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
