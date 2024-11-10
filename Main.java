import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fern fern1 = new Fern("Андрей", 54, 6);
        Fern fern2 = new Fern("Витя", 42, 4);
        Fern fern3 = new Fern("Евкакий", 46, 5);
        Beautibloom beautibloom1 = new Beautibloom("Павел", 46.2, 7, 2.2);
        Beautibloom beautibloom2 = new Beautibloom("Максон", 11.4, 4, 3.2);
        Beautibloom beautibloom3 = new Beautibloom("Олег", 23, 2, 1);
        Succulent succulent1 = new Succulent("Вовка", 12.2, 6);
        Succulent succulent2 = new Succulent("Леха", 32.1, 2);
        Succulent succulent3 = new Succulent("Даник", 8.24, 4);
        Succulent succulent4 = new Succulent("Артём", 10, 1);
        Plant[] plants = {fern1, fern2, fern3, beautibloom1, beautibloom2, beautibloom3, succulent1, succulent2, succulent3, succulent4};
        //вся инфа по красивоцветущим
        System.out.println("Вся инфа по красивоцветущим:");
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] instanceof Beautibloom) {
                Beautibloom beautibloom = (Beautibloom) plants[i];
                System.out.printf("%s:\n", beautibloom.name);
                System.out.printf("\tВысота: %s\n", beautibloom.height);
                System.out.printf("\tПродолжительность жизни: %s\n", beautibloom.old);
                System.out.printf("\tПродолжительность цветения: %s\n", beautibloom.bloom);
            }
        }
        //вывод тех, у кого меньше 5 лет
        System.out.println("Расстения, продолжительность жизни которых меньше 5 лет:");
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].old < 5) {
                System.out.println(plants[i].name);
                System.out.printf("\tПродолжительность жизни: %s\n", plants[i].old);
            }
        }
        System.out.println("Введите число: ");
        double input = in.nextDouble();
        System.out.printf("Вывод папоротников, высота которых больше %s:\n", input);
        //вывод папоротников, высота которых больше заданной 
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] instanceof Fern && plants[i].height > input) {
                System.out.println(plants[i].name);
                System.out.printf("\tВысота: %s\n", plants[i].height);
            }
        }
    }
}
