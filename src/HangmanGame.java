import java.util.Scanner;

public class HangmanGame {
    private String palabraSecreta;
    private char[] palabraOculta;
    private boolean[] letrasAdivinadas;
    private String[] dibujoAhorcado;
    private int intentosRestantes;

    public HangmanGame(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta.toUpperCase();
        this.palabraOculta = new char[palabraSecreta.length()];
        this.letrasAdivinadas = new boolean[palabraSecreta.length()];
        this.intentosRestantes = 6;
        inicializarPalabraOculta();
        inicializarDibujoAhorcado();
    }
    private void inicializarPalabraOculta() {
        for(int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }
    }
    
    private void inicializarDibujoAhorcado() {
        dibujoAhorcado = new String[] {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
        };
    }
    
  public void jugar() {
        Scanner sc = new Scanner(System.in);

        while (intentosRestantes > 0) {
            mostrarEstadoJuego();
            System.out.print("\nIngresa una letra: ");
            char letra = sc.next().toUpperCase().charAt(0);

            if (!validarCaracter(letra)) {
                intentosRestantes--;
                System.out.println("Letra incorrecta.");
            }

            if (validarPalabra(String.valueOf(palabraOculta), palabraSecreta)) {
                System.out.println("\n¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
                return;
            }
        }

        System.out.println(dibujoAhorcado[6]);
        System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
        sc.close();
    }

    private boolean validarPalabra(String palabraOculta, String palabraSecreta) {
        return palabraOculta.equals(palabraSecreta);
    }
 private void mostrarEstadoJuego() {
        System.out.println("\nPalabra actual: " + String.valueOf(palabraOculta));
        System.out.println("Intentos restantes: " + intentosRestantes);
        System.out.println(dibujoAhorcado[6 - intentosRestantes]);
    }
//hasta aqui mi parte :)    
