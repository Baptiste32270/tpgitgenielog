// Fichier : Main.java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Création d'un objet Calcul pour accéder à ses méthodes.
        Calcul maCalculatrice = new Calcul();

        // Création d'un objet Scanner pour lire les entrées de l'utilisateur.
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--- Calculatrice Simple ---");

            // Demande du premier nombre
            System.out.print("Entrez le premier nombre : ");
            double nombre1 = scanner.nextDouble();

            // Demande de l'opérateur
            System.out.print("Entrez l'opérateur (+, -, *, /) : ");
            char operateur = scanner.next().charAt(0);

            // Demande du second nombre
            System.out.print("Entrez le second nombre : ");
            double nombre2 = scanner.nextDouble();

            double resultat = 0;

            // Utilisation d'une structure switch pour choisir la bonne opération
            switch (operateur) {
                case '+':
                    resultat = maCalculatrice.addition(nombre1, nombre2);
                    break;
                case '-':
                    resultat = maCalculatrice.soustraction(nombre1, nombre2);
                    break;
                case '*':
                    resultat = maCalculatrice.multiplication(nombre1, nombre2);
                    break;
                case '/':
                    resultat = maCalculatrice.division(nombre1, nombre2);
                    break;
                default:
                    // Cas où l'opérateur n'est pas valide
                    System.out.println("Opérateur non valide !");
                    return; // Quitte le programme
            }

            // Affichage du résultat
            System.out.println("Le résultat de " + nombre1 + " " + operateur + " " + nombre2 + " est : " + resultat);

        } catch (IllegalArgumentException e) {
            // Capture l'exception de la division par zéro
            System.err.println("Erreur : " + e.getMessage());
        } catch (Exception e) {
            // Capture d'autres erreurs possibles (ex: l'utilisateur entre du texte au lieu d'un nombre)
            System.err.println("Erreur de saisie. Veuillez entrer des nombres valides.");
        } finally {
            // Ferme le scanner pour libérer les ressources
            scanner.close();
        }
    }
}