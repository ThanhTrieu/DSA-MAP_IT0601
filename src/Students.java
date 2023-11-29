public class Students {
    public String id;
    public String name;

    public Students(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ID = "+ id +" , name = " + name + "] ";
    }
}
