public class Camion extends Carro {

    private int capacidad;

    public Camion(int realPrecio_Regular, String color, String marca, int modelo, int caballosFuerza, int capacidad) {
        super(realPrecio_Regular, color, marca, modelo, caballosFuerza);
        this.capacidad = capacidad;
    }

    public void realCalcular_Precio() {
        if (capacidad == 101) {
            int calcularDescuento = (realPrecio_Regular * 5) / 100;
            int precioFinal = realPrecio_Regular - calcularDescuento;
            System.out.println("ya que el peso es igual a 101 el descuento total sera de: " + precioFinal);
        } else if (capacidad < 101 || capacidad > 101) {
            int calcularDescuento = (realPrecio_Regular * 10) / 100;
            int precioFinal = realPrecio_Regular - calcularDescuento;
            System.out.println("ya que el peso es diferente a 101 el descuento total sera de: " + precioFinal);
        }
    }

    public void imprimir() {
        System.out.println("Precio real del Camion: " + realPrecio_Regular);
        System.out.println("Color del Camion: " + color);
        System.out.println("Marca del Camion: " + marca);
        System.out.println("Modelo del Camion: " + modelo);
        System.out.println("caballos de fuerza del Camion: " + caballosFuerza);
        System.out.println("Capacidad del Camion: " + capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballoFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
}
