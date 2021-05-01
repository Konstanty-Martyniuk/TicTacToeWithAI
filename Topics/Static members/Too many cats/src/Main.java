class Cat {
    // write static and instance variables
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        Cat.counter++;
        // do not forget to check the number of cats
        if (Cat.getNumberOfCats() > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}