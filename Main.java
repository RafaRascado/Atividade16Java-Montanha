// Faça um programa para uma loja de tintas. O programa deverá
// pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3
// metros quadrados e que a tinta é vendida em latas de 18
// litros, que custam R$ 80,00. Informe ao usuário a quantidades
// de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double tamanhoInformadoEmMetro;
    double valorDaTinta = 80;
    double quantidadeDeTintaEmLitro;
    int quantidadeLataDeTinta = 18;
    double resultado;
    double valorTotal;

    //O método Math.ceil é utilizado para aproximar os valores para o número crescente mais próximo

    System.out.println("Informe quantos metros quadrados será pintado: ");

    Scanner tamanho = new Scanner(System.in);
    tamanhoInformadoEmMetro = tamanho.nextInt();
    quantidadeDeTintaEmLitro = Math.ceil(tamanhoInformadoEmMetro / 3);

    if (quantidadeDeTintaEmLitro > 18) {

      resultado = Math.ceil(quantidadeDeTintaEmLitro / quantidadeLataDeTinta);

      valorTotal = resultado * valorDaTinta;
      System.out.println("O valor total da compra será: R$ " + valorTotal
          + " E a quantidade de latas a serem compradas é: " + resultado);
    } else {
      resultado = 1;
      System.out.println(
          "O valor da compra será: R$" + valorDaTinta + " a quantidade de latas a serem compradas serão: " + resultado);
    }
  }
}