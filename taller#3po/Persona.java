 public class Persona {
        private String nombre;
        private String cedula;
        private String fechaNacimiento;
        private String correo;
        private String ciudadResidencia;
        private String ciudadOrigen;
        private cancion[] cancionesFavoritas;
        public Persona() {
            cancionesFavoritas = new cancion[3];
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }
    
        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
    
        public void setCorreo(String correo) {
            this.correo = correo;
        }
    
        public void setCiudadResidencia(String ciudadResidencia) {
            this.ciudadResidencia = ciudadResidencia;
        }
    
        public void setCiudadOrigen(String ciudadOrigen) {
            this.ciudadOrigen = ciudadOrigen;
        }
        public void agregarCancion(int indice, cancion cancion) {
            if (indice >= 0 && indice < 3) {
                cancionesFavoritas[indice] = cancion;
            }
        }
    public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cédula: " + cedula);
            System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
            System.out.println("Correo: " + correo);
            System.out.println("Ciudad de Residencia: " + ciudadResidencia);
            System.out.println("Ciudad de Origen: " + ciudadOrigen);
            
            System.out.println("Canciones Favoritas:");
            for (cancion cancion : cancionesFavoritas) {
                if (cancion != null) {
                    cancion.mostrarCancion();
                }
            }
        }
    }
    

        
    
    
    
