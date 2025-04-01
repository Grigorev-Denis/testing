public class Car {
    public String model;
    public int year;
    public void makeBeBe(){
        if (year <= 1970){
            System.out.println("*Сигналит в ретро стиле*");
        }
        if (year > 1970 && year < 2000){
            System.out.println("*Сигналит в стиле диско*");
        }
        if (year >= 2000) {
            System.out.println("*Сигналит современно*");
        }
    }

    public Car (String model, int year){
        this.model = model;
        this.year = year;
    }
}

