
// Name : AKSH_SURANI
// ID : 21CE140
// Div: CE2 C2

class Additions{
    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int add(int a, int b,int c)
    {
        int mul=a*b*c;
        return mul;
    }
}
public class practical_5 {
    public static void main(String[] args) {
        Additions A = new Additions();

        System.out.println(" 1st Call : "+A.add(1,2));
        System.out.println(" 2nd call : "+A.add(1,2,3));
       


    }
}
