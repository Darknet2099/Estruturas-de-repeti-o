import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner Delta = new Scanner(System.in);
    int x ;
    System.out.println(" Insira um número entre 0 e 10: ");
    x = Delta.nextInt();
    while( x >10 || x<0){
      System.out.println( "Numero Invalido, insira novamente. ");
    x = Delta.nextInt();
      }
    }

  }
