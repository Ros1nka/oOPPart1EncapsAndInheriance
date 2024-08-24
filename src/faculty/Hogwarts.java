package faculty;

public abstract class Hogwarts {
    private String name;
    private String surname;
    protected int powerOfMagic;
    protected int transgress;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgress) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return STR."faculty.Hogwarts{name='\{name}\{'\''}, surname='\{surname}\{'\''}, powerOfMagic=\{powerOfMagic}, transgress=\{transgress}\{'}'}";
    }

    public abstract void printParametrs();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void compareStudents(Hogwarts student) {
        int sum1 = this.powerOfMagic + this.transgress;
        int sum2 = student.powerOfMagic + student.transgress;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} \{this.getSurname()} обладает бОльшей мощностью магии, чем \{student.getName()} \{student.getSurname()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} \{student.getSurname()} обладает бОльшей мощностью магии, чем \{this.getName()} \{this.getSurname()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}
