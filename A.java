package gestaoversoes;
/*
 * @author Ricardo Caldeira
 */

public class A {
    private int a1;
    private float a2;
    private String a3;
    private String a_princ4;

    public int getA1() {
        return a1;
    }
    
    public void setA1(int a1) {
        this.a1 = a1;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }
    
    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }
    
    public String getA_princ4() {
        return a_princ4;
    }

    public void setA_princ4(String a_princ4) {
        this.a_princ4 = a_princ4;
    }

    public float soma(){
        return a1+a2;
    }
}
