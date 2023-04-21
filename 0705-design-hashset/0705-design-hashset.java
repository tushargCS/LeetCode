class MyHashSet {

    ArrayList<Integer>obj ;
    public MyHashSet() {
        obj = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!obj.contains(key)){obj.add(key);}
        else{}
    }
    
    public void remove(int key) {
        if(obj.indexOf(key)!=-1){obj.remove(obj.indexOf(key));}
    }
    
    public boolean contains(int key) {
        if(!obj.contains(key)){return false;}
        else{return true;}
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */