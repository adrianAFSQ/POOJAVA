public class cancion {
    
        private String titulo;
        private String artista;
    
        public cancion(String titulo, String artista) {
            this.titulo = titulo;
            this.artista = artista;
        }

        public void mostrarCancion() {
            System.out.println("Título: " + titulo + ", Artista: " + artista);
        }
        public String getTitulo() {
            return titulo;
        }
    
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    
        public String getArtista() {
            return artista;
        }
    
        public void setArtista(String artista) {
            this.artista = artista;
        }
    }
    


    