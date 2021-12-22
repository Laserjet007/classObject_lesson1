public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Cat: " + name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        System.out.println(cat);
    }
}

// Результат:
// Cat: Барсик


