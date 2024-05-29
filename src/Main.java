
public class Main {
    public static void main(String[] args) {
        Juegos Juego1 =new Juegos("CoD","Accion",9," Es un juego de guerra multijugador");
        Videojuegos Videojuegos1 = new Videojuegos("RE3","Terror",8,"Un juego basado en sustos","CAPCOM","Multiplataforma",30.00);
        juegosAccion APEX_LEGENDS = new juegosAccion("Apex Legends","shooter",9,"exelente juego multijugador","Respawn Entertaiment","Multiplataforma",0.0,20,500,"Facil");


        Juego1.Informacionjuego();
        Juego1.Opinionjuego();
        Videojuegos1.Informacionjuego();
        Videojuegos1.Datosadicionales();
        Videojuegos1.DescuentoMayorista();
        Videojuegos1.Opinionjuego();
        APEX_LEGENDS.Informacionjuego();
        APEX_LEGENDS.Opinionjuego();
        APEX_LEGENDS.MostrarDatosinternosdeljuego();
        APEX_LEGENDS.Datosadicionales();
        APEX_LEGENDS.DescuentoMayorista();





    }
}