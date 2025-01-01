public class Automovil extends Carro {
    private int numero_puestos;

    public Automovil(int realPrecio_Regular, String color, String marca, int modelo, int caballosFuerza,
            int numero_puestos) {
        super(realPrecio_Regular, color, marca, modelo, caballosFuerza);
        this.numero_puestos = numero_puestos;
    }

    public void realCalcular_Precio() {
        int descuento = 1 + numero_puestos;

        int calcularDescuento = (descuento * realPrecio_Regular) / 100;

        int precioFinal = realPrecio_Regular - calcularDescuento;

        System.out.println("el descuento de el automovil es de: " + precioFinal);

    }

    public void imprimir() {
        System.out.println("Precio real del  Automovil: " + realPrecio_Regular);
        System.out.println("Color del Automovil: " + color);
        System.out.println("Marca del Automovil: " + marca);
        System.out.println("Modelo del Automovil: " + modelo);
        System.out.println("caballos de Fuerza del Automovil: " + caballosFuerza);
        System.out.println("Numero Puestos del Automovil: " + numero_puestos);

    }

    public int getNumero_puestos() {
        return numero_puestos;
    }

    public void setNumero_puestos(int numero_puestos) {
        this.numero_puestos = numero_puestos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
