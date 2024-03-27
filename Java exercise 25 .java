import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
  int x, quant, idade;
  double soma = 0 ;
  double media = 0;
     System.out.print("Digite a quantidade de Pessoas no grupo: ");
    quant = entrada.nextInt();

    for ( x = 1 ; x <= quant; x++) {
      System.out.println("Digite a idade:");
      idade = entrada.nextInt();
      soma = soma + idade;    
    }
      media = soma / quant;
    if (media <=25 ){
      System.out.println("A turma é jovem dinâmica");
    }else if (media > 25 && media <= 60){
      System.out.println("A turma é adulta.");
    }else if (media > 60){
      System.out.println("A turma é velha guarda(idosos).");
    }
    System.out.println("A média das idades é: " + media);
  }
}
