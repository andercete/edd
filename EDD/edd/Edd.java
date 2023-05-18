package edd;

import java.util.Scanner;
/**
 * Clase principal para el programa Reto.
 */
public class Edd {
	/**
     * 
     * Esta clase implementa un cuestionario de preguntas sobre Mongolia que se
     * ejecuta en la consola.
     * El cuestionario consta de seis categorías de preguntas diferentes, cada una
     * de las cuales se
     * selecciona ingresando un número correspondiente en la consola. Cada categoría
     * de preguntas
     * consta de tres preguntas de opción múltiple, con una puntuación otorgada por
     * cada respuesta
     * correcta y una puntuación final al final del cuestionario. El cuestionario se
     * puede detener
     * en cualquier momento ingresando "0" en la consola.
     * Esta clase utiliza la entrada estándar para obtener las respuestas del
     * usuario y la salida
     * estándar para mostrar las preguntas y las respuestas correctas.
     * Método principal que inicia el programa. 
     * @param args Los argumentos de la línea de comandos. No se utilizan en este programa.
     */
    public static void main(String[] args) {
    	/**
         * Método principal que inicia el programa.
         * 
         * @param args Los argumentos de la línea de comandos. No se utilizan en este programa.
         */
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("Escoge una de las siguientes opciones:");
            System.out.println("1. Información");
            System.out.println("2. Preguntas");
            System.out.println("0. Salir");

            opcion = input.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Has elegido la opción de información.");
                    // Inicio del bucle que muestra las opciones de información y espera la entrada
                    // del usuario para seleccionar una opción
                    boolean salirInfo = false;
                    while (!salirInfo) {
                        System.out.println("Escoge una de las siguientes opciones:");
                        System.out.println("1. Historia");
                        System.out.println("2. Idioma");
                        System.out.println("3. Comida");
                        System.out.println("4. Geografía");
                        System.out.println("5. Cultura");
                        System.out.println("0. Volver al menú anterior");

                        opcion = input.nextLine();

                        switch (opcion) {
                            // Muestra información sobre la historia de Mongolia
                            case "1":
                                System.out.println("Información sobre la historia de Mongolia:");
                                System.out.println(
                                        "Mongolia es un país con una rica historia que se remonta a los tiempos del imperio Mongol, liderado por Genghis Khan en el siglo XIII.");
                                System.out.println(
                                        "Desde entonces, Mongolia ha pasado por muchos cambios políticos y culturales, desde la ocupación china hasta la era soviética, y finalmente la independencia en 1990.");
                                System.out.println(
                                        "El país también es famoso por ser la tierra natal de muchos exploradores, como Genghis Khan y Marco Polo, y es conocido por su tradición nómada y su cultura pastoral.");
                                // Mensaje que indica al usuario que puede presionar Enter para continuar o 0
                                // para volver al menú anterior
                                System.out.println("Presiona Enter para continuar o 0 para volver al menú anterior..");
                                // Final del case "1"
                                break;
                            // Muestra información sobre el idioma de Mongolia
                            case "2":
                                System.out.println("Información sobre el idioma de Mongolia:");
                                System.out.println(
                                        "El idioma oficial de Mongolia es el mongol, que se escribe con un alfabeto cirílico modificado.");
                                System.out.println(
                                        "Además del mongol, también se hablan otros idiomas en Mongolia, como el chino y el ruso, debido a la influencia de sus países vecinos.");
                                // Mensaje que indica al usuario que puede presionar Enter para continuar o 0
                                // para volver al menú anterior
                                System.out.println("Presiona Enter para continuar o 0 para volver al menú anterior..");
                                // Final del case "2"
                                break;
                            // Muestra información sobre la comida de Mongolia
                            case "3":
                                System.out.println("Información sobre la comida de Mongolia:");
                                System.out.println(
                                        "La gastronomía mongola se caracteriza por ser rica en carnes y lácteos, lo que refleja la tradición nómada del país.");
                                System.out.println(
                                        "Uno de los platos más conocidos es el 'buuz', un tipo de empanada rellena de carne de cordero o vaca y verduras, que se cocina al vapor.");
                                System.out.println(
                                        "También es popular el 'khuushuur', una empanada frita similar al 'buuz', pero más grande y con un relleno diferente.");
                                System.out.println(
                                        "Otro plato típico es el 'khorkhog', que consiste en carne de cordero cocida en un caldero de metal con piedras calientes y verduras.");
                                // Mensaje que indica al usuario que puede presionar Enter para continuar o 0
                                // para volver al menú anterior
                                System.out.println("Presiona Enter para continuar o 0 para volver al menú anterior..");
                                // Final del case "3"
                                break;
                            // Muestra información sobre la geografia de Mongolia
                            case "4":
                                System.out.println("Información sobre la geografía de Mongolia:");
                                System.out.println(
                                        "Mongolia es un país sin salida al mar que se encuentra en Asia Oriental, entre Rusia y China.");
                                System.out.println(
                                        "Gran parte de su territorio es estepa, y también cuenta con montañas, como los montes Altái y el Khangai, y desiertos, como el de Gobi.");
                                System.out.println(
                                        "El río más importante es el Selenga, que desemboca en el lago Baikal en Rusia.");
                                // Mensaje que indica al usuario que puede presionar Enter para continuar o 0
                                // para volver al menú anterior
                                System.out.println("Presiona Enter para continuar o 0 para volver al menú anterior..");
                                // Final del case "4"
                                break;
                            // Muestra información sobre la cultura de Mongolia
                            case "5":
                                System.out.println("Información sobre la cultura de Mongolia:");
                                System.out.println(
                                        "Mongolia tiene una cultura rica y única que ha sido moldeada por siglos de tradiciones nómadas.");
                                System.out.println(
                                        "La cultura mongol es conocida por sus festivales tradicionales, como Naadam, que celebra los deportes nacionales como la lucha libre, el tiro con arco y la carrera de caballos.");
                                System.out.println(
                                        "La música y la danza también son una parte importante de la cultura mongol, con instrumentos tradicionales como el morin khuur, un instrumento de cuerda con cabeza de caballo, y la danza de la garza, que representa la libertad y la gracia.");
                                System.out.println(
                                        "La vestimenta tradicional incluye ropas de colores brillantes y chaquetas de seda bordadas, y la comida tradicional incluye productos lácteos como el queso y el yogur, así como platos de carne de cordero y caballo.");
                                // Mensaje que indica al usuario que puede presionar Enter para continuar o 0
                                // para volver al menú anterior
                                System.out.println("Presiona Enter para continuar o 0 para volver al menú anterior..");
                                // Final del case "5"
                                break;
                            case "0":
                                salirInfo = true;
                                break;

                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    }
                    break;

                case "2":
                    // Opción de preguntas
                    System.out.println("Has elegido la opción de preguntas.");
                    boolean salirPreguntas = false;
                    while (!salirPreguntas) {
                        // Menú de opciones para preguntas
                        System.out.println("Escoge una de las siguientes opciones:");
                        System.out.println("1. Historia");
                        System.out.println("2. Idioma");
                        System.out.println("3. Comida");
                        System.out.println("4. Geografía");
                        System.out.println("5. Cultura");
                        System.out.println("6. Todas las opciones anteriores");
                        System.out.println("0. Volver al menú anterior");

                        // Capturar la opción seleccionada por el usuario
                        opcion = input.nextLine();

                        switch (opcion) {
                            case "1":
                // Preguntas sobre la historia de Mongolia
                int puntuacion = 0;
                String[] preguntasHistoria = {
                    "¿Quién lideró el imperio Mongol en el siglo XIII?",
                    "¿Cuándo obtuvo Mongolia su independencia?",
                    "¿Qué tradiciones son conocidas en Mongolia?"
                };
                String[][] opcionesHistoria = {
                    {"a) Genghis Khan", "b) Marco Polo", "c) Cristóbal Colón"},
                    {"a) En el siglo XIII", "b) En 1990", "c) Nunca ha obtenido su independencia"},
                    {"a) La tradición nómada y la cultura pastoral", "b) La tradición marítima y la cultura pesquera", "c) La tradición industrial y la cultura urbana"}
                };
                String[] respuestasHistoria = {"a", "b", "a"};

                System.out.println("Preguntas sobre la historia de Mongolia:");
                for (int i = 0; i < preguntasHistoria.length; i++) {
                    System.out.println((i + 1) + ". " + preguntasHistoria[i]);
                    for (String opcionHistoria : opcionesHistoria[i]) {
                        System.out.println("   " + opcionHistoria);
                    }
                    String respuesta = input.nextLine();
                    if (respuesta.equalsIgnoreCase(respuestasHistoria[i])) {
                        System.out.println("¡Correcto!");
                        puntuacion += 1;
                    } else if (respuesta.equalsIgnoreCase("0")) {
                        // Salir de las preguntas
                        break;
                    } else {
                        System.out.println("Incorrecto. La respuesta correcta es " + respuestasHistoria[i] + ".");
                    }
                }

                // Mostrar la puntuación final
                System.out.println("Tu puntuación final es: " + puntuacion + "/3");
                break;
                            /**
                             * 
                             * Método que implementa el juego de preguntas sobre el idioma de Mongolia.
                             * 
                             * El usuario debe responder 3 preguntas y se le otorga una puntuación final de
                             * acuerdo a sus respuestas.
                             * 
                             * Las preguntas tienen opciones de respuesta múltiple y se deben introducir las
                             * letras correspondientes a cada opción.
                             * 
                             * Si el usuario introduce "0" en cualquier momento, se sale del juego.
                             */
                            case "2":
    // Preguntas sobre el idioma de Mongolia
    int puntuacion2 = 0;
    String[] preguntasIdioma = {
        "¿Cuál es el idioma oficial de Mongolia?",
        "¿Qué alfabeto utiliza el idioma mongol?",
        "¿Cuántas vocales tiene el idioma mongol?"
    };
    String[][] opcionesIdioma = {
        {"a) Mandarín", "b) Mongol", "c) Ruso"},
        {"a) Alfabeto cirílico", "b) Alfabeto latino", "c) Alfabeto árabe"},
        {"a) 5", "b) 8", "c) 12"}
    };
    String[] respuestasIdioma = {"b", "a", "b"};

    System.out.println("Preguntas sobre el idioma de Mongolia:");
    for (int i = 0; i < preguntasIdioma.length; i++) {
        System.out.println((i + 1) + ". " + preguntasIdioma[i]);
        for (String opcionIdioma : opcionesIdioma[i]) {
            System.out.println("   " + opcionIdioma);
        }
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase(respuestasIdioma[i])) {
            System.out.println("¡Correcto!");
            puntuacion2 += 1;
        } else if (respuesta.equalsIgnoreCase("0")) {
            // Salir de las preguntas
            break;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuestasIdioma[i] + ".");
        }
    }

    // Mostrar la puntuación final
    System.out.println("Tu puntuación final es: " + puntuacion2 + "/3");
    break;
                            /**
                             * 
                             * Método que implementa el juego de preguntas sobre la comida de Mongolia.
                             * 
                             * El usuario debe responder 3 preguntas y se le otorga una puntuación final de
                             * acuerdo a sus respuestas.
                             * 
                             * Las preguntas tienen opciones de respuesta múltiple y se deben introducir las
                             * letras correspondientes a cada opción.
                             * 
                             * Si el usuario introduce "0" en cualquier momento, se sale del juego.
                             * 
                             */
                            case "3":
    // Preguntas sobre la comida de Mongolia
    int puntuacion3 = 0;
    String[] preguntasComida = {
        "¿Cuál es el plato nacional de Mongolia?",
        "¿Qué bebida tradicional se consume en Mongolia?",
        "¿Qué es el aaruul?"
    };
    String[][] opcionesComida = {
        {"a) Khuushuur", "b) Buuz", "c) Khorkhog"},
        {"a) Cerveza", "b) Vino", "c) Airag"},
        {"a) Un guiso de carne", "b) Un postre", "c) Un tipo de queso"}
    };
    String[] respuestasComida = {"b", "c", "c"};

    System.out.println("Preguntas sobre la comida de Mongolia:");
    for (int i = 0; i < preguntasComida.length; i++) {
        System.out.println((i + 1) + ". " + preguntasComida[i]);
        for (String opcionComida : opcionesComida[i]) {
            System.out.println("   " + opcionComida);
        }
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase(respuestasComida[i])) {
            System.out.println("¡Correcto!");
            puntuacion3 += 1;
        } else if (respuesta.equalsIgnoreCase("0")) {
            // Salir de las preguntas
            break;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuestasComida[i] + ".");
        }
    }

    // Mostrar la puntuación final
    System.out.println("Tu puntuación final es: " + puntuacion3 + "/3");
    break;
                            /**
                             * Método que implementa el juego de preguntas sobre la geografía de Mongolia.
                             *
                             * El usuario debe responder 3 preguntas y se le otorga una puntuación final de
                             * acuerdo a sus respuestas.
                             *
                             * Las preguntas tienen opciones de respuesta múltiple y se deben introducir las
                             * letras correspondientes a cada opción.
                             *
                             * Si el usuario introduce "0" en cualquier momento, se sale del juego.
                             */
                            case "4":
    // Preguntas sobre la geografía de Mongolia
    int puntuacion4 = 0;
    String[] preguntasGeografia = {
        "¿Cuál es el punto más alto de Mongolia?",
        "¿Qué río fluye a través de Mongolia?",
        "¿Cuál es el desierto más grande de Mongolia?"
    };
    String[][] opcionesGeografia = {
        {"a) Khüiten Peak", "b) Monte Everest", "c) Montaña Kilimanjaro"},
        {"a) Río Amarillo", "b) Río Amazonas", "c) Río Selenga"},
        {"a) Gobi", "b) Kalahari", "c) Sahara"}
    };
    String[] respuestasGeografia = {"a", "c", "a"};

    System.out.println("Preguntas sobre la geografía de Mongolia:");
    for (int i = 0; i < preguntasGeografia.length; i++) {
        System.out.println((i + 1) + ". " + preguntasGeografia[i]);
        for (String opcionGeografia : opcionesGeografia[i]) {
            System.out.println("   " + opcionGeografia);
        }
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase(respuestasGeografia[i])) {
            System.out.println("¡Correcto!");
            puntuacion4 += 1;
        } else if (respuesta.equalsIgnoreCase("0")) {
            // Salir de las preguntas
            break;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuestasGeografia[i] + ".");
        }
    }

    // Mostrar la puntuación final
    System.out.println("Tu puntuación final es: " + puntuacion4 + "/3");
    break;
                            /**
                             * Preguntas sobre la cultura de Mongolia.
                             * El usuario debe responder 3 preguntas y se le otorga una puntuación final de
                             * acuerdo a sus respuestas.
                             * Las preguntas tienen opciones de respuesta múltiple y se deben introducir las
                             * letras correspondientes a cada opción.
                             * Si el usuario introduce "0" en cualquier momento, se sale del juego.
                             *
                             */
                            case "5":
    // Preguntas sobre la cultura de Mongolia
    int puntuacion5 = 0;
    String[] preguntasCultura = {
        "¿Qué es un ger?",
        "¿Qué deporte es popular en Mongolia?",
        "¿Cuál es la bebida nacional de Mongolia?"
    };
    String[][] opcionesCultura = {
        {"a) Un tipo de árbol", "b) Un tipo de ropa", "c) Una tienda de campaña tradicional"},
        {"a) Fútbol", "b) Vóley", "c) Lucha mongol"},
        {"a) Coca Cola", "b) Vino", "c) Airag"}
    };
    String[] respuestasCultura = {"c", "c", "c"};

    System.out.println("Preguntas sobre la cultura de Mongolia:");
    for (int i = 0; i < preguntasCultura.length; i++) {
        System.out.println((i + 1) + ". " + preguntasCultura[i]);
        for (String opcionCultura : opcionesCultura[i]) {
            System.out.println("   " + opcionCultura);
        }
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase(respuestasCultura[i])) {
            System.out.println("¡Correcto!");
            puntuacion5 += 1;
        } else if (respuesta.equalsIgnoreCase("0")) {
            // Salir de las preguntas
            break;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuestasCultura[i] + ".");
        }
    }

    // Mostrar la puntuación final
    System.out.println("Tu puntuación final es: " + puntuacion5 + "/3");
    break;
                            /**
                             * 
                             * Este case realiza un cuestionario sobre preguntas generales de Mongolia.
                             * Incluye tres preguntas con opciones múltiples, donde el usuario debe elegir
                             * la opción correcta.
                             * Cada respuesta correcta suma un punto a la puntuación final.
                             * Al final del cuestionario, se muestra la puntuación obtenida.
                             */
                            case "6":
    // Preguntas generales sobre Mongolia
    int puntuacion6 = 0;
    String[] preguntasGenerales = {
        "¿En qué continente se encuentra Mongolia?",
        "¿Cuál es la capital de Mongolia?",
        "¿Qué religión es predominante en Mongolia?"
    };
    String[][] opcionesGenerales = {
        {"a) Europa", "b) Asia", "c) Africa"},
        {"a) Ulan Bator", "b) Pekín", "c) Moscú"},
        {"a) Budismo", "b) Cristianismo", "c) Islam"}
    };
    String[] respuestasGenerales = {"b", "a", "a"};

    System.out.println("Preguntas generales sobre Mongolia:");
    for (int i = 0; i < preguntasGenerales.length; i++) {
        System.out.println((i + 1) + ". " + preguntasGenerales[i]);
        for (String opcionGeneral : opcionesGenerales[i]) {
            System.out.println("   " + opcionGeneral);
        }
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase(respuestasGenerales[i])) {
            System.out.println("¡Correcto!");
            puntuacion6 += 1;
        } else if (respuesta.equalsIgnoreCase("0")) {
            // Salir de las preguntas
            break;
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + respuestasGenerales[i] + ".");
        }
    }

    // Mostrar la puntuación final
    System.out.println("Tu puntuación final es: " + puntuacion6 + "/3");
    break;

                            case "0":
                                salir = true;
                                break;

                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    }
            }
            System.out.println("¡Hasta luego!");

        }
    }
}
