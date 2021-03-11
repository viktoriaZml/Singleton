import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();
    Scanner scanner = new Scanner(System.in);
    logger.log("Запускаем программу");
    logger.log("Просим пользователя ввести входные данные для списка");
    System.out.println("Введите размер списка:");
    int n = scanner.nextInt();
    System.out.println("Введите верхнюю границу для значений:");
    int m = scanner.nextInt();
    logger.log("Создаём и наполняем список");
    Random random = new Random();
    List<Integer> list = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      list.add(random.nextInt(m));
    }
    System.out.println("Вот случайный список:" + list);
    logger.log("Просим пользователя ввести входные данные для фильтрации");
    System.out.println("Введите порог для фильтра:");
    int f = scanner.nextInt();
    Filter filter = new Filter(f);
    List<Integer> outList = filter.filterOut(list);
    logger.log("Выводим результат на экран");
    System.out.println("Отфильтрованный список:" + outList);
    logger.log("Завершаем программу");
  }
}
