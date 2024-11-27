import java.lang.reflect.Array;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String[][][] questions = {
                {
                        {"1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?"},
                        {
                            "a. Ada c. Lovelace",
                            "b. Jude Milhon",
                            "c. Martha Ackelsberg",
                            "d. Jane Jacobs"

                        },
                        {
                            "b"
                        }

                },
                {
                        {"2. ¿Quién es Fuencisla Clemares?"},
                        {
                                "a. La directora general de IBM Europa, Oriente Medio y África",
                                "b. La vicepresidenta de Microsoft Western Europe",
                                "c. La directora general de Google en España y Portugal",
                                "d. Fundadora y CEO de Marsi Bionics"

                        },
                        {
                            "c"
                        }

                },
                {
                        {"3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?"},
                        {
                                "a. Primera programadora de software",
                                "b. Una actriz de cine",
                                "c. Inventora del procesador de datos",
                                "d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS"

                        },
                        {
                            "b",
                            "d"

                        }

                },
                {
                        {"4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?"},
                        {
                                "a. Katherine Johnson, Dorothy Vaughan y Mary Jackson",
                                "b. Jessica Miller, Emily Johnson, Sarah Davis",
                                "c. bell hooks, Toni Morrison y Alice Walker",
                                "d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman"

                        },
                        {
                            "a"
                        }

                },
        };
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        System.out.println("Bienvenido al juego Quiz, te voy a hacer 4 preguntas, por cada pregunta tendrás 4 opciones para escoger");
        System.out.println("¡Buena Suerte");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0][0] + "\n");
            for (int j = 0; j < 4; j++) {
                System.out.println(questions[i][1][j] + "\n");
            }
            System.out.println("Escoge la letra de tu respuesta:");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(questions[i][2][0]) ) {
                System.out.println("acertaste");
                points += 5;
            }
            if (questions[2][2][1].equalsIgnoreCase(answer)) {
                System.out.println("acertaste");
                points +=5;
            }
        }
            System.out.printf("has sacado %s/20 puntos%n", points);
            if(points>15){
                System.out.println("Tú si que sabes mucho");
            } else if (points<15 && points>= 5) {
                System.out.println("No lo has hecho mal");
            } else {
                System.out.println("No lo has hecho mal");
            }
        System.out.println(points);
    scanner.close();
            //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada c. Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

    }

    
}