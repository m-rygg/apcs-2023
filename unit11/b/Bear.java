package unit11.b;

// let's explore inheritance!
// to do
// wip - lightboard
//solve project euler #11 OR #13
//complete Crossword.java FRQ

//need to 
public class Bear {
    private Zoo whereILive;
    private String name;
    public Bear(String theName){
        this.name = theName;
    }
    public Bear(){
        this.name = "Mr. Bear";
    }
    public String getName(){
        return name;
    }
}

// https://wwf.panda.org/wwf_news/?163461/Is-the-giant-panda-a-bear
class Panda extends Bear {
    //always have to call one constructor
    //implicit construct called if it exists
    private String myPanda;
    public Panda(String pandaName){
        //super();
        super(pandaName);
        myPanda = pandaName;
    }
    public Panda(){

    }
}

// https://en.wikipedia.org/wiki/List_of_giant_pandas
class Zoo {
    private Panda inhabitant;
}

public static void main(String args[]) {
    Bear meiLan = new Panda("Mei Lan");
    System.out.println(meiLan.getName());
    Bear mrBear = new Bear();
    Panda mrPandaBear = new Panda();
}





// Zookeeper, Visitor, etc.
