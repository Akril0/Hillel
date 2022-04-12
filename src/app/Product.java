package app;

// Модель объекта Товара.
public class Product implements Sales{
    int qnty;
    private final String name;
    double price;

    public Product(String name, int qnty, double price) {
        this.name = name;
        this.qnty = qnty;
        this.price = price;
    }


    // Метод этого класса
    public String infoProduct() {
        String name = getName();
        String resultSale = Rounder.roundValue(calcSales(qnty, price));
        return "Товар: " + name + "\nОбъем продаж (грн.): " + resultSale;
    }

    // Метод этого класса переопределяющий метод интерфейса
    @Override
    public double calcSales(int quota, double price) {
        return quota * price;
    }

    public String getName() {
        return name;
    }
}

