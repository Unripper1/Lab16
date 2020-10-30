import java.util.ArrayDeque;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayDeque<Integer> first=new ArrayDeque<Integer>();
        ArrayDeque <Integer> second=new ArrayDeque<Integer>();
        Scanner sc =new Scanner(System.in);
        for (int i=0;i<5;i++){

            first.addLast(sc.nextInt());
        }
        for (int i=0;i<5;i++){

            second.addLast(sc.nextInt());
        }
        int id=0;
        while(true){
            id++;
            if(id==106){
                System.out.println("botva");
                break;
            }
            int a = first.getFirst();
            first.removeFirst();
            int b = second.getFirst();
            second.removeFirst();
            if(a>b && a!=9 && b!=0){
                first.addLast(a);
                first.addLast(b);
            }
            if(a<b && b!=9 && a!=0){
                second.addLast(a);
                second.addLast(b);
            }
            if(a==0 && b==9) {
                first.addLast(a);
                first.addLast(b);
            }
            if(a==9 && b==0) {
                second.addLast(a);
                second.addLast(b);
            }
            if(first.isEmpty()){
                break;
            }
            if(second.isEmpty()){
                break;
            }
        }
        if(first.isEmpty()){
            System.out.println("second " +id);
        }
        if(second.isEmpty()){
            System.out.println("first " +id);
        }
    }
}
