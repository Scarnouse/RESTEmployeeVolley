package es.vcarmen.restemployeevolley.models;

/**
 * Created by Lolo on 17/01/2017.
 */
public class Department {

    private int nDept;
    private String nameDept;

    public Department(int nDept, String nameDept){
        this.nDept = nDept;
        this.nameDept = nameDept;
    }

    public int getnDept() {
        return nDept;
    }

    public String getNameDept() {
        return nameDept;
    }

    @Override
    public String toString() {
        return getnDept() + " " + getNameDept();
    }
}
