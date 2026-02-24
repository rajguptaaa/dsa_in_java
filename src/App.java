import java.util.*;

public class App {
    public static void main(String[] args){
        // System.out.println("Hello, World!");
        // System.out.print("Hello world with java\nraj"); //next line, println or \n

        //Input

        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // single word
        // System.out.println("Hello " + name);
        
        // String fullName = sc.nextLine(); //getline(cin, str);
        // System.out.println("Hello " + fullName);
        
        // int a = sc.nextInt();
        // System.out.println(a);
        
        //conditional
        // int age = sc.nextInt();
        // if(age > 18){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("NO");
        // }
        

        //switch cases
        // int n = sc.nextInt();
        // switch(n){
        //     case 1:{
        //         System.out.println(1);
        //         break;
        //     }
        //     case 2:{
        //         System.out.println(2);
        //         break;
        //     }
        //     case 3:{
        //         System.out.println(3);
        //         break;
        //     }
        //     default:{
        //         System.out.println("Invalid");
        //     }
        // }

        //loops
        // for(int i=1; i<=5; i++){
        //     System.out.println(i);
        // }

        // int i = 5;
        // while(i > 0){
        //     System.out.println(i);
        //     i--;
        // }

        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i < 0);

        //patterns
        for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int n = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }

        sc.close();
    }
}
