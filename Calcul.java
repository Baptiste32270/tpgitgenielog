// Fichier : Calcul.java

public class Calcul {

    /**
     * Additionne deux nombres.
     * 
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return La somme de a et b.
     */
    return a+b;
    }

    /**
     * Soustrait deux nombres.
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return La différence entre a et b.
     */
    public double soustraction(double a, double b) {
        return a - b;
    }

    /**
     * Multiplie deux nombres.
     * @param a Le premier nombre.
     * @param b Le deuxième nombre.
     * @return Le produit de a et b.
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

    /**
     * Divise deux nombres.
     * @param a Le premier nombre (dividende).
     * @param b Le deuxième nombre (diviseur).
     * @return Le quotient de a par b.
     * @throws IllegalArgumentException si le diviseur est zéro.
     */
    public double division(double a, double b) {
        if (b == 0) {
            // On lève une exception pour gérer le cas de la division par zéro.
            throw new IllegalArgumentException("Le diviseur ne peut pas être zéro !");
        }
        return a / b;
    }
}