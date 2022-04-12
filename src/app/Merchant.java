package app;

// Модель объекта Продавца.
public class Merchant implements Bonus{


    private final String email;
    private final String name;
    private final String phone;
    // Конструктор этого класса
    public Merchant(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Метод этого класса
    public String infoMerchant() {
        return "Продавец: " + this.name + ", " + this.phone + ", " + this.email + "\n";
    }


    // Метод этого класса переопределяющий метод интерфейса.
    @Override
    public double calcBonus(double sales) {
        double bonus;
        if (sales <= 10000) {
            bonus = sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            bonus = sales * 10 / 100;
        } else {
            bonus = sales * 15 / 100;
        }
        return bonus;
    }


}
