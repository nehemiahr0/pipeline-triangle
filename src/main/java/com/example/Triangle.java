package com.example;

public class Triangle {
    
    // Méthode de logique
    public boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // LE POINT D'ENTRÉE INDISPENSABLE
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        
        // Petit test rapide au démarrage
        int a = 3, b = 6, c = 5;
        System.out.println("Test de calcul de triangle pour 3, 6, 5 :");
        if (triangle.isTriangle(a, b, c)) {
            System.out.println("Resultat : C'est bien un triangle !");
        } else {
            System.out.println("Resultat : Ce n'est pas un triangle.");
        }
    }
}