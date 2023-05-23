package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        
        int num1 = entrada.nextInt();
        
        System.out.print("Ingresa otro número: ");
        
        int num2 = entrada.nextInt();
        
        EsMultiplo(num1, num2);    
        
    }
    
    public static void EsMultiplo(int num1, int num2){
        if(num1%num2 == 0){
            System.out.print("El número "+num1+" es múltiplo de "+num2);
        }else{
            System.out.print("El número "+num1+" no es múltiplo de "+num2);
        }
        System.out.println("");
    }
    
}
