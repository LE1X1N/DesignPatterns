package Behavioral.Iterator;

public class NameRepository implements Container{   // Concreate Aggregate
    
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override 
    public Iterator getIterator(){
        return new NameIterator();
    }


    // inner class which implements Iterator
    private class NameIterator implements Iterator{     // Concrete Iterator
        int index = 0; 

        @Override 
        public boolean hasNext(){
            if (index < names.length){
                return true;
            }
            return false;
        }
        
        @Override 
        public Object next(){
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}
