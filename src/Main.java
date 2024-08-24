import faculty.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Gryffindor ronWeaslye = new Gryffindor("Рон", "Уизли", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        Slytherin drakoMalfoy = new Slytherin("Драко", "Малфой", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        Hufflepuff zachariahSmith = new Hufflepuff("Захария", "Смит", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби ", rnd100(), rnd100(), rnd100(), rnd100(), rnd100(), rnd100());

        System.out.println(hermioneGranger.toString());
        System.out.println(ronWeaslye.toString());

        harryPotter.compareStudents(hermioneGranger);

        harryPotter.compareStudents(drakoMalfoy);

        padmaPatil.compareStudents(zhouChang);
    }

    public static int rnd100() {
        Random rnd = new Random();
        return rnd.nextInt(101);
    }
}

