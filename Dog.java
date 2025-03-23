public class Dog {
    public String breed; // порода
    public String color; // цвет
    static int count = 0; // Создано экземпляров
    public void getCount (){ // Надо вызывать при создании экземпляра, потом заменить на конструктор
        count += 1;
        System.out.println("Создано экземпляров собачек: " + count);
    }

}
