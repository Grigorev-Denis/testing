

public class Main {
    public static void main(String[] args) {
        String[] arr = {"привет","ПоЛкА","гипербола"};
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
        getRandomWord(arr);
    }


    public static void getRandomWord(String[] words){    // сделал статическим чтобы не создавать экземпляр класса Main
        int a = 0;  // диапазон "от"
        int b = words.length - 1; // диапазон "до", вычитаем 1, т.к это будет последним индексом массива
        int randomIndex = a + (int)(Math.random() * ((b - a) + 1)); // рандомное число, которое будет индексом массива
        System.out.println(words[randomIndex]);
    }

}