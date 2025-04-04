public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.setTypeOfInst("Струнный");
        guitar.setHaveStrings(true);
        Instruments.Enum guitarEnum = guitar.new Enum(6);
        guitar.play(guitarEnum.strings);


        Piano piano = new Piano();
        piano.setTypeOfInst("Клавишный");
        piano.setHaveStrings(true);
        Instruments.Enum pianoEnum = piano.new Enum(230);
        piano.play(pianoEnum.strings);

    }
}