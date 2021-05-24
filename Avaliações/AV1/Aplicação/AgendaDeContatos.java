package Aplicação;

import Entidades.Contato;
import java.util.Scanner;

public class AgendaDeContatos {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);

        String[] agenda = new String[5];


        System.out.println("Digite os contatos: ")
        char status = s;
        while (status == 'n') {
            for (int i=0; i<agenda.lenght(); i++) {
                Contato cont = new Contato();
                System.out.println("Dados do contato #" + (i+1) + ":")
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Numero de Telefone: ");
                sc.nextLine();
                int numeroDeTelefone = sc.nextInt();
                cont.
            }
            System.out.print("Deseja adicionar mais um aluno[s/n]?")
            status = sc.next().charAt(0);
            if ( status == 's') {
                for (int i=0; i<agenda.lenght; i++) {

                    System.out.println("Dados do contato #" + (i+1) + ":")
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Numero de Telefone: ");
                    sc.nextLine();
                    int numeroDeTelefone = sc.nextInt();
                }
            }
        }

        sc.close();
    }
}
