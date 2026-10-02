package Creational.Prototype;

public abstract class Shape implements Cloneable{
    // implement Cloneable interface, and rewrite Clone() method.

    private String id;
    public String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
