public class Camioneta extends Carro {

    private int peso;
    private int descuento_fabricante;

    public Camioneta(int realPrecio_Regular, String color, String marca, int modelo, int caballosFuerza, int peso,
            int descuento_fabricante) {
        super(realPrecio_Regular, color, marca, modelo, caballosFuerza);
        this.peso = peso;
        this.descuento_fabricante = descuento_fabricante;
    }

    public void realCalcular_Precio() {
        int calcularPorcentaje = (realPrecio_Regular * descuento_fabricante) / 100;

        int precioFinal = realPrecio_Regular - calcularPorcentaje;

        System.out.println("el precio final de la camioneta con el descuento de fabricante es: " + precioFinal);
    }

    public void imprimir() {
        System.out.println("Precio real de la camioneta: " + realPrecio_Regular);
        System.out.println("Colorde la Camioneta: " + color);
        System.out.println("Marca  de la Camioneta: " + marca);
        System.out.println("Modelo de la Camioneta: " + modelo);
        System.out.println("caballos de Fuerza de la Camioneta: " + caballosFuerza);
        System.out.println("descuento de fabricante de la camioneta: " + descuento_fabricante);
        System.out.println("pesode la Camioneta: " + peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDescuentoFabricante() {
        return descuento_fabricante;
    }

    public void setDescuentoFabricante(int descuento_fabricante) {
        this.descuento_fabricante = descuento_fabricante;
    }

}
