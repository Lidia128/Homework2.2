public class Main {
    public static void main(String[] args) {

        Humen maxim = new Humen("Максим", "Минск", 1987, "бренд-менеджера");
        Humen any = new Humen("Аня", "Москва", 1993, "методиста образовательных программ");
        Humen katy = new Humen("Катя", "Калининград", 1994, "продакт-менеджера");
        Humen artem = new Humen("Артем", "Москва", 1995, "работает директором по развитию бизнеса");
        Humen vladimer = new Humen("Владимир", "Казань", 2001, null);

        printInfo(maxim);
        printInfo(any);
        printInfo(katy);
        printInfo(artem);
        printInfo(vladimer);
    }
    private static void printInfo(Humen humen) {
        System.out.println("Привет! Меня зовут " + humen.name + ". Я из города " + humen.getTown() + ". Я родился в "
                + humen.getYearOfBirth() + " году. Я работаю на должности " + humen.job + ". Будем знакомы!");
    }}


