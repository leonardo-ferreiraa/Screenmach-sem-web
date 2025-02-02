package com.example.screenmach;
import java.util.Scanner;
public class Principal {
    private Scanner leitura = new Scanner(System.in);
    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
    }
}
