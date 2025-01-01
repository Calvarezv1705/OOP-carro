public class Carro {

    protected int realPrecio_Regular;
    protected String color;
    protected String marca;
    protected int modelo;
    protected int caballosFuerza;

    public Carro(int realPrecio_Regular, String color, String marca, int modelo, int caballosFuerza) {
        this.realPrecio_Regular = realPrecio_Regular;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.caballosFuerza = caballosFuerza;
    }

    public void realCalcular_Precio() {
        System.out.println("precio real del carro: " + realPrecio_Regular);
    }

    public void imprimir() {
        System.out.println("Precio real del Carro: " + realPrecio_Regular);
        System.out.println("Color del Carro: " + color);
        System.out.println("Marca  del Carro: " + marca);
        System.out.println("Modelo del Carro: " + modelo);
        System.out.println("caballos de Fuerza del Carro: " + caballosFuerza);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

}
