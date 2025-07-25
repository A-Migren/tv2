import java.util.Scanner;


class Tv {
    private String model; //объявление поля класса
    private double size; //объявление поля класса
    private int volume; //объявление поля класса

    public Tv(String model, double size, int volume) {
        this.model = model;
        this.size = size;
        this.volume = volume;
        //Объявление методов класса
    }
    @Override //переопределяем метод класса, чтобы его возвращаемые значения были читаемы
    public String toString() {
        return "Телевизор: " + model + ", диагональ: " + size + "\", громкость: " + volume;
    }
}
class App { //Создаем класс App в котором и создадим при помощи сканнера экземпляр класса
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите модель: ");
        String manualModel = scanner.nextLine();

        System.out.print("Введите диагональ (дюймы): ");
        double manualSize = scanner.nextDouble();

        System.out.print("Введите громкdость (0-100): ");
        int manualVolume = scanner.nextInt();

        Tv manualTv = new Tv(manualModel, manualSize, manualVolume);
        System.out.println(manualTv);
        scanner.close();
    }
}