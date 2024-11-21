package Eesercizi_recap_21_11.Override;

public class TestClass {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    
}
