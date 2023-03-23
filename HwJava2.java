//Задача 2. Вывести все простые числа от 1 до 1000

public class JavaHw12 {
    static boolean prime(int n){
        int count = 0;
        for(int i = 1; i < n + 1; i++){
            if (n % i == 0){
                count ++;
            }
        }                                           
        if(count > 2){                              
            return false;                          
        }                                           
        return true;                               
    }                                               
    public static void main(String[] args){
        for(int i = 2; i < 1000; i++){
            if(prime(i) == true){
                System.out.print(i + " ");
            }
        }
    }
}
