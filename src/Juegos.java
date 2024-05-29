

public class Juegos {
    public String Nombre;
    public String Tipo;
    public  int Calificacion;
    public  String Opinion;

    public  Juegos(String Nombre, String Tipo, int Calificacion, String Opinion){
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Calificacion = Calificacion;
        this.Opinion = Opinion;

    }


    public void Informacionjuego(){
        System.out.println("------------------------------------------------");
        System.out.println("           Informacion Juego              \n");
        System.out.println("Nombre: "+Nombre+"\n");
        System.out.println("Tipo de Juego: "+Tipo+"\n");
        System.out.println("Calificacion: "+Calificacion+"\n");



    }
    public void Opinionjuego(){

        System.out.println("-------------------------------------------------\n");
        System.out.println("Ingrese una pequeña opinion sobre la pelicula. \n");

        System.out.println(Opinion+"\n");

    }

}

 class Videojuegos extends Juegos {
    public String Desarrollador;
    public String Plataforma;
    public double precio;


    public Videojuegos(String Nombre, String Tipo, int Calificacion, String Opinion ,String Desarrollador, String Plataforma, double precio){
        super(Nombre ,Tipo, Calificacion, Opinion);
        this.Desarrollador = Desarrollador;
        this.Plataforma = Plataforma;
        this.precio = precio;
    }

    public void Datosadicionales(){
        System.out.println("------------------------------------------------");
        System.out.println("           Informacion  Adicional              \n");
            System.out.println("Desarollador: "+Desarrollador+"\n");
        System.out.println("Plataforma: "+Plataforma+"\n");
        System.out.println("Precio: "+precio+"\n");
    }

    public  void  DescuentoMayorista(){
        double descuento;
        System.out.println("------------------------------------------------");
        System.out.println("           Descuento Mayorista              \n");

        System.out.println("Si la compra resulta ser para negocio o al mayorista se ofrece un decuento del 20% del precio original en cada unidad \n");
        System.out.println("Precio sin decuento: "+precio+"\n");
        descuento =precio *0.20;

        System.out.println(" Descuento : "+descuento+"\n");
        System.out.println("Precio con decuento: "+(precio-descuento)+"\n");



    }
}

class juegosAccion extends Videojuegos{
    public int Numerodemisiones;
    public  int nivel;
    public String Dificultad;

    public juegosAccion(String Nombre, String Tipo, int Calificacion, String Opinion ,String Desarrollador, String Plataforma, double precio, int Numerodemisiones,int nivel,String Dificultad){
        super( Nombre,  Tipo, Calificacion,  Opinion , Desarrollador, Plataforma,  precio);
        this.Numerodemisiones = Numerodemisiones;
        this.nivel = nivel;
        this.Dificultad = Dificultad;

    }

    public void MostrarDatosinternosdeljuego(){
        System.out.println("------------------------------------------------");
        System.out.println("       Informacion Interna del Juego           \n");
        System.out.println("Numero de misiones: "+Numerodemisiones+"\n");
        System.out.println("Nivel del jugador: "+nivel+"\n");
        System.out.println("Dificultad: "+Dificultad+"\n");

    }





}
