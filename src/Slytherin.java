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
        return STR."\{super.toString()}; GSlytherin{cunning=\{cunning}, determination=\{determination}, ambition=\{ambition}, resourcefulness=\{resourcefulness}, thirstOfPower=\{thirstOfPower}\{'}'}";
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int sum1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstOfPower;
        int sum2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstOfPower;

        if (sum1 > sum2) {
            System.out.println(STR."\{student1.getName()} лучший Слизеринец, чем \{student2.getName()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student2.getName()} лучший Слизеринец, чем \{student1.getName()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
