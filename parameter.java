public class parameter {
    static int sum (int x , int y ){
        return x+y;
    }
    static void sum(int x){
        System.out.println("X="+x);

    }

    static float sub(float a , int b ){
        return b-a;
    }



    public static void main(String[] args){
        System.out.println(sum(3,9));

        sum(19);
        System.out.println(sub(1.79f,12));

    }
    
}
