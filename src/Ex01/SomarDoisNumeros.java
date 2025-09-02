package Ex01;
import java.util.*;

class Main {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Digite um numero: ");
            int num1 = sc.nextInt();
            
            System.out.println("Digite outro numero: ");
            int num2 = sc.nextInt();
            
            int soma = num1 + num2;
            
            System.out.printf("Soma: %d\n", soma);
        
        sc.close();
    }
    
    
}