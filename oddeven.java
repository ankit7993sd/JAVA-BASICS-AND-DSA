public class oddeven {
    static boolean oddevens(int a ){
        if (a%2==0)
            return true;
        else
            return false;

    }
    public static void main(String[] args){
       System.out.println("Is the number odd ? " + oddevens(4));
    }
    
}
