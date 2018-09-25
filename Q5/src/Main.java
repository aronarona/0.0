import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  Scanner scn=new Scanner(System.in);
	  int x=scn.nextInt( );
	  int y=scn.nextInt( );
	  int z=scn.nextInt( );
	  if(y+z>=x){
	  System.out.println("True");
      }else{
	  System.out.println("False");
      }
    }
}
