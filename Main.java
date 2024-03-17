// Демонстрація роботи оператора if.

class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if(x < y) System.out.println("Значення х меньше у");
        x = x * 2;
        if(x == y) System.out.println("Значення x рівне у");
        x = x * 2;
        if(x > y); System.out.println("Значення x більше у");

        //  Тут нічого не відобразиться
        if(x == y)System.out.println("Цей вивід ви не побачете");
    }
}