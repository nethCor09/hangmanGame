# Juego del ahorcado
## breve explicacion de 1Godoy123

Este programa implementa el juego del Ahorcado en Java. La clase Ahorcado contiene toda la lógica y estructura del juego. El atributo palabraSecreta almacena la palabra a adivinar en mayúsculas. palabraOculta es un arreglo de caracteres que comienza con guiones bajos y se va llenando a medida que se adivinan letras. letrasAdivinadas registra qué posiciones ya fueron acertadas. El arreglo dibujoAhorcado contiene representaciones gráficas del muñeco del ahorcado en distintas etapas.

El jugador tiene 6 intentos, y por cada error se avanza una etapa del dibujo. El método jugar() controla el ciclo del juego, pidiendo letras al usuario, validándolas y actualizando el estado. Si la letra no está, se pierde un intento. Si el jugador completa correctamente palabraOculta, gana. Si se queda sin intentos, pierde.

El programa demuestra conceptos de programación como arreglos, ciclos, condicionales, entrada por teclado, y separación de responsabilidades mediante métodos.

<p align="center">
  <img src="https://github.com/user-attachments/assets/0a20471f-a05c-4741-96c4-e388a83a4f06" alt="Ahorcado" width="200"/>
</p>


