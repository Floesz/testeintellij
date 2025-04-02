package app;

import entities.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria",20);
        System.out.println("Nome: " + cliente.getName());
        System.out.print("Idade: " + cliente.getIdade());
    }
}