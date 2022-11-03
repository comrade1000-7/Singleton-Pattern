import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        List<Integer> list = new ArrayList<>();

        logger.log("Запускаем программу");
        logger.log("Введите размер списка");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        logger.log("Введите верхнюю границу для значений");
        int threshold = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            list.add(new Random().nextInt(threshold));
        }
        logger.log("Вот случайный список " + list);
        logger.log("Введите порог для фильтра");
        int filterNum = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filterNum);
        list = filter.filterOut(list);
        logger.log("Прошло фильтр " + list.size() + " из " + input);
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список " + list);
        logger.log("Завершаем программу");
    }

}
