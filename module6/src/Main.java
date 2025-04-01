public class Main {
    public static void main(String[] args) {
        String[]arr = {"привет","ПоЛкА","гипербола"};
        String secondWord ;
        String result = "Слов с буквой 'О' не найдено";
        for (String word: arr){
            char letter = word.charAt(1);
            if(letter=='О'||letter=='о'){
                secondWord = word;
                StringBuilder builder = new StringBuilder(secondWord);
                builder.insert(3, " ");
                //builder.replace(1,2, "О");
                result = builder.toString();
                break;
            }

        }

        System.out.println(arr[0].toUpperCase());
        System.out.println(arr[1].toLowerCase());
        System.out.println(result);
    }
}