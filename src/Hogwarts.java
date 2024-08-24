public class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgress;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgress) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return STR."Hogwarts{name='\{name}\{'\''}, surname='\{surname}\{'\''}, powerOfMagic=\{powerOfMagic}, transgress=\{transgress}\{'}'}";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.powerOfMagic + student1.transgress;
        int sum2 = student2.powerOfMagic + student2.transgress;

        if (sum1 > sum2) {
            System.out.println(STR."\{student1.getName()} \{student1.getSurname()} обладает бОльшей мощностью магии, чем \{student2.getName()} \{student2.getSurname()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student2.getName()} \{student2.getSurname()} обладает бОльшей мощностью магии, чем \{student1.getName()} \{student1.getSurname()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
