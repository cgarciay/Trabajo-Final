import java.util.Scanner;
public class TF {
    public static void main(String[] args) {
        System.out.println("Ésta es la propuesta del Trabajo Final");
        int cont, aforo_max;
        String tipo_ing, area;
        int ambulatorio =0;
        int emergencia= 0;
        int hospitalario= 0;


        Scanner teclado;
        teclado = new Scanner(System.in);

        cont = 0;
        aforo_max = 10;
        String[] entrada = new String[100];
        String[] salida = new String[100];



        for (int i = 0; i < 200; i++) {
            System.out.println("Va a ingresar (I) o salir (S)?");
            tipo_ing = teclado.nextLine();


            if (tipo_ing.equals("I")) {
                if (cont >= aforo_max) {
                    System.out.println("No ingresar se alcanzo limite de Aforo. Disculpe las molestias.");

                } else {
                    System.out.println("Indicar a que area se dirige Ambulatorio (A) Hospitalario (H) Emergencia (E):");
                    area = teclado.nextLine();
                    entrada[i] = area;
                    System.out.println("Bienvenido, puede ingresar.");
                    cont = cont + 1;

                    if (entrada[i].equals("A")){
                        ambulatorio = ambulatorio + 1;}
                    else if (entrada[i].equals("H")){
                        hospitalario = ambulatorio + 1;}
                    else {
                        emergencia = emergencia + 1;}

                    System.out.println("Los pacientes en ambulatorio son : "+ ambulatorio);
                    System.out.println("Los pacientes en hospitalario son : "+ hospitalario);
                    System.out.println("Los pacientes en emergencia son : "+ emergencia);

                }
            } else {
                System.out.println("Indicar de que especialidad viene Ambulatorio (A) Hospitalario (H) Emergencia (E):");
                area = teclado.nextLine();
                salida[i] = area;
                cont = cont - 1;

                if (salida[i].equals("A")){
                    ambulatorio = ambulatorio - 1;}
                else if (salida[i].equals("H")){
                    hospitalario = hospitalario - 1;}
                else {
                    emergencia = emergencia-1;}

                System.out.println("Los pacientes en ambulatorio son : "+ ambulatorio);
                System.out.println("Los pacientes en hospitalario son : "+ hospitalario);
                System.out.println("Los pacientes en emergencia son : "+ emergencia);

            }
            System.out.println("Muchas gracias por su visita.");

        }
            }
        }



