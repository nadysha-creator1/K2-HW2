public class SlytherinStudent extends HogwartsStudent{
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;
    public SlytherinStudent (String name,
                             int magic,
                             int transgression,
                             int cunning,
                             int determination,
                             int ambition,
                             int ingenuity,
                             int thirsForPower) {
        super(name, magic,transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirsForPower;
    }

    public int getCunning(){
        return cunning;
    }
    public void setCunning (int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition(){
        return ambition;
    }
    public void setAmbition (int ambition) {
        this.ambition = ambition;
    }
    public int getIngenuity() {
        return ingenuity;
    }
    public void setIngenuity( int igenuity) {
        this.ingenuity = ingenuity;
    }
    public int getThirsForPower() {
        return thirstForPower;
    }
    public void setThirsForpower (int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public int ability() {
      return cunning+determination+ambition+ingenuity+thirstForPower;
    }
    public void compareSlytherin(SlytherinStudent slytherinStudent){
        int ability1 = ability();
        int  ability2 = slytherinStudent.ability();
        if (ability1 > ability2){
            System.out.printf(
                    "Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n",
                    getName(),
                    slytherinStudent.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2> ability1){
            System.out.printf(
                    "Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n",
                    slytherinStudent.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else{
            System.out.printf(
                    "Слизеренец %s такой же, как слизеренец %s: %d VS %d%n",
                    slytherinStudent.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString(){
      return String.format("%s;хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d",
                super.toString(),
                cunning,
                determination,
                ambition,
                ingenuity,
                thirstForPower
      );
    }
}

