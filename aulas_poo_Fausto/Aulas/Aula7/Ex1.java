package Aula7;

import entidadesAula7.AlunoEx1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de aluno: ");
        int quant = sc.nextInt();
        sc.nextLine();
        AlunoEx1[] alunos = new AlunoEx1[quant];
        for (int i = 0; i>=quant;i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Nota1: ");
            float n1 = sc.nextFloat();
            System.out.println("Nota 2: ");
            float n2 = sc.nextFloat();
            alunos[i] = new AlunoEx1(nome, n1, n2);
            sc.nextLine();
        }
 /*     for (int i = 0; i< alunos.length; i++) {
            System.out.println(alunos[i].resultado());
        }
  */
        for (AlunoEx1 a: alunos ) {
            System.out.println(a.resultado());
        }

        sc.close();
    }

}
