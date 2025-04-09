public class Instruments {
    private String typeOfInst;
    private boolean haveStrings;

    public void setTypeOfInst(String typeOfInst){
        this.typeOfInst = typeOfInst;
    }
    public void setHaveStrings(boolean haveStrings){
        this.haveStrings = haveStrings;
    }

    public String getTypeOfInst(){
        return typeOfInst;
    }
    public boolean getHaveStrings(){
        return haveStrings;
    }

    public class Enum {
        public int strings;
        public Enum(int strings){
            this.strings = strings;
        }
    }
}
