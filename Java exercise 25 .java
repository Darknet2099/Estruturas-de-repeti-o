import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
  int x, nota , N ;
  double soma = 0 , media;
     System.out.print("Digite a quantidade de Pessoas: ");
      N = entrada.nextInt();
    
    for ( x = 1 ; x <= N; x++){
      System.out.println("Digite a idade da pessoa");
      nota = entrada.nextInt();
      soma += nota;
    }
      media = soma / N;
      System.out.println("A média de idades é = " + media);
    if (media <= 25) {
      System.out.println("A turma é composta por jovens dinâmicos.");
    }
    if (media > 25 && media < 60) {
      System.out.println("A turma é composta por adultos.");
    }
    if (media >= 60){
    System.out.println("O grupo é composto por idosos.");
    }
  }
}
