class MyHashSet {
    ArrayList<Integer> [] hashset;
    public MyHashSet() {
        hashset = new ArrayList[10000];
        for(int i=0;i<10000;i++){
            hashset[i] = new ArrayList<>();
        }
    }
    
    public void add(int key) {
        if(!this.contains(key)){
            hashset[key%10000].add(key);
        }
    }
    
    public void remove(int key) {
        hashset[key%10000].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return hashset[key%10000].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */