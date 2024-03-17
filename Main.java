// Демонстарція роботи блоку коду

class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        // Ціль цього циклу являється блок
        for(x=0; x<10; x++) {
            System.out.println("Значення х: " + x);
            System.out.println("Значення y: " + y);
            y = y -2;
        }
    }
}