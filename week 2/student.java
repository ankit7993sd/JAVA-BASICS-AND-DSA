public class student {
      static void greet() {
            System.out.println("Hello ");
        }
        static int sum(int a,int b){
            
            int add = a+b;
            return add;
             
        }
      
         
    
    static void main(String[] args){
        String name = "Ankit";
        System.out.println("Sum = "+sum(19,20));
        int Age = 20;
        String Branch = "BTECH";
        System.out.println("Hello "+name);
         System.out.println("Age "+Age);
          System.out.println("Branch " +Branch);

        student.greet();

    }
    
}
