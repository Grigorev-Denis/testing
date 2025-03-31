public class Main {
    public static void main(String[] args) {
        String[]arr = {"привет","ПаЛкА","гипербола"};
        String secondWord = arr[1];
        StringBuilder builder = new StringBuilder(secondWord);
        builder.insert(3, " ");
        builder.replace(1,2, "О");
        String result = builder.toString();

        System.out.println(arr[0].toUpperCase());
        System.out.println(arr[1].toLowerCase());
        System.out.println(result);
    }
}