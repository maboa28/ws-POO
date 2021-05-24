package Aula7;

import entidadesAula7.Percusso;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Percusso[][] p = new Percusso[7][7];
        /// ------0
        p[0][1] = new Percusso(2,4,10);
        p[0][2] = new Percusso(11,25,30);
        p[0][3] = new Percusso(6,12,15);
        p[0][4] = new Percusso(15,-1,-1);
        p[0][5] = new Percusso(11,22,23);
        p[0][6] = new Percusso(1,3,3);
        ///------1
        p[1][0] = new Percusso(2,4,10);
        p[1][2] = new Percusso(7,25,30);
        p[1][3] = new Percusso(12,12,15);
        p[1][4] = new Percusso(4,-1,-1);
        p[1][5] = new Percusso(2,22,23);
        p[1][6] = new Percusso(15,3,3);

        System.out.println("Cidade 1: ");
        int cidade1 = sc.nextInt();
        System.out.println("Cidade 2: ");
        int cidade2 = sc.nextInt();

        Percusso atual = p[cidade1-1][cidade2-2];
        System.out.println("Avião: " + atual.getAvião());
        System.out.println("Carro: " + atual.getCarro());
        System.out.println("Ônibus: " + atual.getÔnibus());
    }
}
