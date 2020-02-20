import java.util.Scanner;
public class main
{

    public static class HumanitarianAid {
        public static void main(String[] args) {
            int box;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Сколько у Вас ящиков?");
            box = scanner.nextInt();
            Cargo cargo = new Cargo(box);
            cargo.fullPrint();
        }
    }

    static class Cargo {
        private int truck;
        private int container;
        private int box;

        public Cargo(int box) {
            this.box = box;
            if (box != 0) {
                container = box % 27 == 0 ? box / 27 : box / 27 + 1;
            }
            if (container != 0) {
                truck = container % 12 == 0 ? container / 12 : container / 12 + 1;
            }
        }

        public void fullPrint() {
            int b = 1;
            int c = 1;
            for (int i = 1; i <= truck; i++) {
                System.out.println("Грузовик " + i);
                int j = 0;
                while (j < 12 && c <= container) {
                    System.out.println("    Контейнер " + c);
                    int k = 0;
                    while (k < 27 && b <= box) {
                        System.out.println("        Ящик " + b);
                        k++;
                        b++;
                    }
                    j++;
                    c++;
                    System.out.println();
                }
            }
        }
    }
}
