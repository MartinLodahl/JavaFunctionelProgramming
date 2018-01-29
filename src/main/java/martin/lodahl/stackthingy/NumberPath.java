package martin.lodahl.stackthingy;

public class NumberPath<Long> implements Path<Long>{

    private Long first;
    private NumberPath<Long> rest;

    public NumberPath(Long first, NumberPath rest){
        this.first = first;
        this.rest = rest;
    }
    
    @Override
    public Long getFirst() {
        return first;
    }

    @Override
    public Path<Long> getRest() {
        return rest;
    }

    
    @Override
    public String toString(){
        if(rest==null){
            return first+"";
        }
        String s = first+rest.toString();
        return s;
    }
    
}
