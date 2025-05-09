import java.util.Scanner;

public class Ahorcado {
    private String palabraSecreta;
    private char[] palabraOculta;
    private boolean[] letrasAdivinadas;
    private String[] dibujoAhorcado;
    private int intentosRestantes;

    public Ahorcado(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta.toUpperCase();
        this.palabraOculta = new char[palabraSecreta.length()];
        this.letrasAdivinadas = new boolean[palabraSecreta.length()];
        this.intentosRestantes = 6;
        inicializarPalabraOculta();
        inicializarDibujoAhorcado();
    }
private boolean validarPalabra(String palabraOculta, String palabraSecreta){
    boolean esValida;
    
    if(palabra Oculta.equals(palabraSecreta)){
        esValida = true;
    }else{
        esValida = false;
    }
    return esValida;
    }
