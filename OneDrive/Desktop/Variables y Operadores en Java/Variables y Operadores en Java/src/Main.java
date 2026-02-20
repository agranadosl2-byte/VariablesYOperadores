import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectorGlobal = new Scanner(System.in);
        declaracionYUsoDevariables(lectorGlobal);
        operacionesMatematicas(lectorGlobal);
        operacionesLogicas(lectorGlobal);
        clasificacionDeEdad(lectorGlobal);
        diaDelaSemana(lectorGlobal);
        verificcacionDeAcceso(lectorGlobal);

        lectorGlobal.close();
    }
    public static void declaracionYUsoDevariables(Scanner entrada) {
        // Declaracion y Uso de Variables
        int edadUser;
        double precioProducto;
        String nombreCompleto;
        boolean esEstudiante;

        System.out.print("Ingrese su nombre: ");
        nombreCompleto = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edadUser = entrada.nextInt();

        System.out.print("Ingrese el precio de su producto: ");
        precioProducto = entrada.nextDouble();

        System.out.print("¿Eres estudiante? (true/false):");
        esEstudiante = entrada.nextBoolean();

        System.out.println("\n ---- Resumen de datos ingresados ----");
        System.out.println("Nombre:" + nombreCompleto);
        System.out.println("Edad:" + edadUser + "años");
        System.out.println("Precio producto:" + precioProducto);
        System.out.println("¿Es estudiante?:" + (esEstudiante ? "SI" : "NO"));
    }

    public static void operacionesMatematicas(Scanner lector) {
        System.out.println(" Operaciones con tipo int:");
        System.out.print("Ingresa el primer numero entero: ");
        int num1Int = lector.nextInt();
        System.out.print("Ingresa el segundo numero entero: ");
        int num2Int = lector.nextInt();

        System.out.println("Suma (int): " + (num1Int + num2Int));
        System.out.println("Resta (int): " + (num1Int - num2Int));
        System.out.println("Multiplicacion (int): " + (num1Int * num2Int));
        //Analisis de la divsion
        if (num2Int != 0) {
            System.out.println("Division (int): " + (num1Int / num2Int));
        } else {
            System.out.println("Division (int): No se puede dividir entre cero.");
        }
        //repeticion con otros tipos
        //ejemplo con double
        System.out.println("\n>> Operaciones con tipo DOUBLE (decimales):");
        System.out.print("Ingresa el primer numero decimal: ");
        double num1Double = lector.nextDouble();
        System.out.print("Ingresa el segundo numero decimal: ");
        double num2Double = lector.nextDouble();

        System.out.println("Suma (double): " + (num1Double + num2Double));
        System.out.println("Resta (double): " + (num1Double - num2Double));
        System.out.println("Multiplicacion (double): " + (num1Double * num2Double));
        System.out.println("Division (double): " + (num1Double / num2Double));

        //operaciones con float
        System.out.println("\n>> Operaciones con tipo FLOAT:");
        System.out.print("Ingresa el primer numero decimal (float): ");
        float num1Float = lector.nextFloat();
        System.out.print("Ingresa el segundo numero decimal (float): ");
        float num2Float = lector.nextFloat();

        System.out.println("Suma (float): " + (num1Float + num2Float));
        System.out.println("Resta (float): " + (num1Float - num2Float));
        System.out.println("Multiplicacion (float): " + (num1Float * num2Float));
        System.out.println("Division (float): " + (num1Float / num2Float));

        //operaciones con short
        System.out.println("\n>>  Operaciones con tipo SHORT (rango -32,768 a 32,767):");
        System.out.print("Ingresa el primer numero corto (short): ");
        short num1Short = lector.nextShort();
        System.out.print("Ingresa el segundo numero corto (short): ");
        short num2Short = lector.nextShort();

        System.out.println("Suma (short): " + (num1Short + num2Short));
        System.out.println("Resta (short): " + (num1Short - num2Short));
        System.out.println("Multiplicacion (short): " + (num1Short * num2Short));
        if (num2Short != 0) System.out.println("Division (short): " + (num1Short / num2Short));

        //operaciones con tipo byte
        System.out.println("\n>>  Operaciones con tipo BYTE (rango -128 a 127):");
        System.out.print("Ingresa el primer numero corto (byte): ");
        byte num1Byte = lector.nextByte();
        System.out.print("Ingresa el segundo numero corto (byte): ");
        byte num2Byte = lector.nextByte();

        System.out.println("Suma (byte): " + (num1Byte + num2Byte));
        System.out.println("Resta (byte): " + (num1Byte - num2Byte));
        System.out.println("Multiplicacion (byte): " + (num1Byte * num2Byte));
        if (num2Byte != 0) System.out.println("Division (byte): " + (num1Byte / num2Byte));
    }
    //Operaciones logicas
    public static void operacionesLogicas(Scanner lector) {
        System.out.println("\n---  Operaciones Logicas ---");
        System.out.print("Ingresa el primer valor numerico: ");
        double valor1 = lector.nextDouble();
        System.out.print("Ingresa el segundo valor numerico: ");
        double valor2 = lector.nextDouble();

        System.out.println("\n>> Comparaciones Relacionales:");
        System.out.println("¿El primer valor es MAYOR QUE el segundo? (" + valor1 + " > " + valor2 + "): " + (valor1 > valor2));
        System.out.println("¿El primer valor es MENOR QUE el segundo? (" + valor1 + " < " + valor2 + "): " + (valor1 < valor2));
        System.out.println("¿Ambos valores son IGUALES? (" + valor1 + " == " + valor2 + "): " + (valor1 == valor2));

        System.out.println("\n>> Operadores Logicos (AND / OR):");
        // Creamos dos condiciones para poder evaluarlas
        boolean esPositivo1 = valor1 > 0;
        boolean esPositivo2 = valor2 > 0;

        System.out.println("Condicion A: ¿El primer numero es positivo? -> " + esPositivo1);
        System.out.println("Condicion B: ¿El segundo numero es positivo? -> " + esPositivo2);

        boolean resultadoAnd = esPositivo1 && esPositivo2;
        System.out.println("Operador AND (&&): ¿AMBOS numeros son positivos? -> " + resultadoAnd);

        boolean resultadoOr = esPositivo1 || esPositivo2;
        System.out.println("Operador OR (||): ¿AL MENOS UN numero es positivo? -> " + resultadoOr);
    }
    //clasificacion de edad
    public static void clasificacionDeEdad(Scanner lector){
        System.out.println("\n---  Clasificacion de Edad ---");
        System.out.print("Ingresa la edad de la persona: ");
        int edad = lector.nextInt();
        System.out.print("Clasificacion: ");

        //utilizamos el if-else ya que estamos evaluando valores
        if (edad < 0) {
            System.out.println("Edad no valida");
        } else if (edad < 12) {
            System.out.println("Es un niño");
        } else if (edad >=12 && edad<= 17) {
            System.out.println("Es un adolescente");
        } else if (edad >= 18 && edad <=59) {
            System.out.println("Es un adulto");
        }else {
            System.out.println("Es un adulto mayor");
        }
    }
    public static void diaDelaSemana(Scanner lector){
        System.out.println("\n---  Dia de la Semana ---");
        System.out.print("Ingresa un numero del 1 al 7: ");
        int dia = lector.nextInt();

        System.out.print("El dia correspondiente es: ");

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabadp");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero incorrecto...");
                break;
        }
    }
    public static void verificcacionDeAcceso(Scanner lector){
        System.out.println("\n---  Verificacion de Acceso ---");

        lector.nextLine();

        String usuarioRegistrado = "alvaroGranados";
        String passwordRegistrada = "272007";

        System.out.print("Ingrese su usuario: ");
        String usuarioIngresado = lector.nextLine();

        //utilizare if-else y .equals() para comparar textos
        if (usuarioIngresado.equals(usuarioIngresado)){
            System.out.print("Ingrese la contraseña: ");
            String passwordIngresada = lector.nextLine();

            if (passwordRegistrada.equals(passwordRegistrada)){
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Contraseña incorrecta...");
            }
        } else {
            System.out.println("Usuario Incorrecto...");
        }
    }
}
