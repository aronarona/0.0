import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        if(x<1 || x>12){
        System.out.println("default");
        }
        else if   (x >= 3 && x <= 5){
            System.out.println("Spring");
        }else if
            (x >= 6 && x <= 8){
            System.out.println("Summer");
        }else if
            (x>=9 && x<=11){
            System.out.println("Autumn");
        }else{
            System.out.println("Winter");
        }
    }
}
