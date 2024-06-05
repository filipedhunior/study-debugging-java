package br.com.dio.debbuging;

public class Main {
    // Por padrão o Java procura o metodo main para iniciar o programa
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
    }

    // esta por padrão em public, por isso esta omitido
    static void a() {   
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        // Imprime a stackTrace do metodo atual
        Thread.dumpStack(); 
        System.out.println("Finalizou o método c.");
    }

}
