public class MyClass {
   public static void main(String[] args) {
   
    int num1,num2,num3;
    
    num1 = 1;
    num2 = 5;
    num3 = 10;
    
    
    //if e else básico
    if(num1 < num2){
        System.out.println("Verdadeiro");
    }
    else{
        System.out.println("Falso");
    }
    System.out.println("----------------");
    if(num3 < num2){
        System.out.println("Verdadeiro");
    }
    else{
        System.out.println("Falso");
    }
    System.out.println("----------------");
   
   
   
   //else if
   
   if(num3==num1){
       System.out.println("é igual");
   }
   else if(num3 == num1 + 9){
       System.out.println("é igual se somar mais 9");
   }
   else{
       System.out.println("é diferente mesmo se somar");
   }
   }
}