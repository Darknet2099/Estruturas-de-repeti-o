import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner input= new Scanner(System.in);
  int N = 0;
  int Ndiv = 0;
  int primos = 0;
      System.out.print("Digite o valor de N: ");
    N = input.nextInt();
    for (int x = 1; x<=3; x++){
      System.out.println(x);
    } System.out.println("Etapa 2");
    for (int x = 5; x <= N; x++) {
      Ndiv = N % x;
      if (x % 2 != 0 && x % 3 != 0 && x % 5 !=0 ){
      Ndiv++;
    System.out.println(Ndiv);
      }
  
  }
    
  }
}
