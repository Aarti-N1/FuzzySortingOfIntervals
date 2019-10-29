/*
 * Name 						StudentID
 * Aarti Nimhan					801098198
 */
public class CInterval <E extends Comparable<E>>{
    E start, end;
    public CInterval(){
    }
    
    public CInterval(E istart, E iend){
        this.start = istart;
        this.end = iend;
    }
    
    public E getStart(){
        return this.start;
    }
    
    public E getEnd(){
        return this.end;
    }
    
    public void setStart(E istart){
        this.start = istart;
    }
    
    public void setEnd(E iend){
        this.end = iend;
    }
}
