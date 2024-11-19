import java.util.Scanner;

public class Encuesta {

        private Persona[] personas;
        private int indicePersona;

        public Encuesta() {
            personas = new Persona[6];
            indicePersona = 0;
        }
        public void agregarPersona(Persona persona) {
            if (indicePersona < personas.length) {
                personas[indicePersona] = persona;
                indicePersona++;
            } else {
                System.out.println("No se pueden agregar más personas.");
            }
        }
        public void mostrarInformacionPersona(int posicion) {
            if (posicion >= 0 && posicion < indicePersona) {
                personas[posicion].mostrarInformacion();
            } else {
                System.out.println("Posición no válida.");
            }
        }
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                Encuesta encuesta = new Encuesta();
                
                while (true) {
                    System.out.println("\n--- Menú ---");
                    System.out.println("1. Agregar persona");
                    System.out.println("2. Ver información de persona");
                    System.out.println("3. Salir");
                    System.out.print("Seleccione una opción: ");
                    
                    int opcion = scanner.nextInt();
                    scanner.nextLine(); 
   
                    if (opcion == 1) {
                        Persona persona = new Persona();
                        
                        System.out.print("Ingrese el nombre: ");
                        persona.setNombre(scanner.nextLine());
   
                        System.out.print("Ingrese la cédula: ");
                        persona.setCedula(scanner.nextLine());
   
                        System.out.print("Ingrese la fecha de nacimiento: ");
                        persona.setFechaNacimiento(scanner.nextLine());
   
                        System.out.print("Ingrese el correo: ");
                        persona.setCorreo(scanner.nextLine());
   
                        System.out.print("Ingrese la ciudad de residencia: ");
                        persona.setCiudadResidencia(scanner.nextLine());
   
                        System.out.print("Ingrese la ciudad de origen: ");
                        persona.setCiudadOrigen(scanner.nextLine());

                        for (int i = 0; i < 3; i++) {
                            System.out.println("Ingrese la canción favorita #" + (i + 1));
                            System.out.print("Título: ");
                            String titulo = scanner.nextLine();
                            System.out.print("Artista: ");
                            String artista = scanner.nextLine();
                            
                            cancion cancion = new cancion(titulo, artista);
                            persona.agregarCancion(i, cancion);
                        }
                        encuesta.agregarPersona(persona);
                    } else if (opcion == 2) {
                        System.out.print("Ingrese la posición de la persona a mostrar (0-5): ");
                        int posicion = scanner.nextInt();
                        scanner.nextLine();
                        encuesta.mostrarInformacionPersona(posicion);
                    } else if (opcion == 3) {
                        System.out.println("¡Hasta luego!");
                        break;
                    } else {
                        System.out.println("Opción no válida.");
                    }
                }
                
                scanner.close();
            }
        }
    }
    
