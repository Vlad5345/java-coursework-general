import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Создаем игровое поле
        ArrayList<Integer> list = new ArrayList<>();
        int number = 0;

        int random = (int) (Math.random() * 7);
        for (int i = 0; i < 10; i++) {
            if (random == i || random + 1 == i || random + 2 == i) list.add(i,1);
            else list.add(i,0);
        }

        // Создаем игрока
        Players player1 = new Players();
        System.out.print("Введите свое имя: ");
        player1.name = reader.readLine();

        // Выполняем выстрел

        while (true) {
            Bah bah1 = new Bah();
            System.out.print("Сделайте выстрел: ");
            String a = reader.readLine();
            bah1.setList1(list);
            number++;

            if (bah1.Babah(a).equals("Потопил")){
                System.out.println(player1.name + " ,вы потопили корабль с " + number + " раза!");
                break;
            }
        }

    }
}
