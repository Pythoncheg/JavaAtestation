package Gift.Items;


    public abstract class BaseClass implements GameInteface {
        protected int id;
        protected String name;
        protected int frequencyDrop;

    protected BaseClass(int id, String name, int frequencyDrop) {
        this.id = id;
        this.name = name;
        this.frequencyDrop = frequencyDrop;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){return frequencyDrop;}
    @Override
    public String toString(){
        return name +
                " ID:" + id +
                " Шанс выпадения:" + frequencyDrop;
    }
}
