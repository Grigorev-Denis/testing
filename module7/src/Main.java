
public class Main {
    public static void main(String[] args) {
Developer dev = new Developer();
dev.setName("Игорь");
dev.setSalary(150000.50f);
dev.work();

Manager man = new Manager();
man.setName("Павел");
man.setSalary(180000.70f);
man.work();


Circle cr = new Circle();
cr.draw();
Rectangle rec = new Rectangle();
rec.draw();
    }
}