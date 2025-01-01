import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = 1; // ultimo numero de la tarjeta de identidad

        Carro carro = new Carro(150000, "azul", "chevrolet", 2000, 80);

        Camioneta camioneta = new Camioneta(5000, "azul", "volvo", 2020, 320, 2000, 20);

        Automovil automovil = new Automovil(10000, "negro", "ferrari", 2019, 300, 2);

        Camion camion = new Camion(100000, "verde", "mercedes", 2010, 400, 100 + x);

        System.out.println("--------------------------");

        camioneta.imprimir();

        System.out.println("--------------------------");

        camioneta.realCalcular_Precio();

        System.out.println("--------------------------");

        automovil.imprimir();

        System.out.println("--------------------------");

        automovil.realCalcular_Precio();

        System.out.println("--------------------------");

        camion.imprimir();

        System.out.println("--------------------------");

        camion.realCalcular_Precio();

        System.out.println("--------------------------");

        carro.imprimir();

        System.out.println("--------------------------");

        System.out.println("ingrese el nuevo color del carro: ");
        String color = teclado.next();
        carro.setColor(color);

        System.out.println("ingrese el nuevo modelo del Carro: ");
        int modelo = teclado.nextInt();
        carro.setModelo(modelo);

        System.out.println("nuevo color del carro: " + carro.getColor());
        System.out.println("el nuevo modelo del carro: " + carro.getModelo());

        System.out.println("--------------------------");

        System.out.println("ingrese el nuevo peso de la camioneta: ");
        int peso = teclado.nextInt();
        camioneta.setPeso(peso);

        System.out.println("ingrese el nuevo descuento de fabricante: ");
        int descuento_fabricante = teclado.nextInt();
        camioneta.setDescuentoFabricante(descuento_fabricante);

        System.out.println("el nuevo peso de la camioneta es: " + camioneta.getPeso());
        System.out
                .println("el nuevo descuento de fabricante de la camioneta es: " + camioneta.getDescuentoFabricante());

        System.out.println("--------------------------");

        System.out.println("ingrese los nuevos numeros de puestos que va a tener el automovil: ");
        int numero_puestos = teclado.nextInt();
        automovil.setNumero_puestos(numero_puestos);

        System.out.println("ingrese la nueva marca del carro: ");
        String marca = teclado.next();
        automovil.setMarca(marca);

        System.out.println("los nuevos numeros de puestos del automovil son: " + automovil.getNumero_puestos());
        System.out.println("la nueva marca del automovil es: " + automovil.getMarca());

        System.out.println("--------------------------");

        System.out.println("ingrese la nueva capacidad del camion: ");
        int capacidad = teclado.nextInt();
        camion.setCapacidad(capacidad);

        System.out.println("ingrese los nuevos caballos de fuerza del camion: ");
        int caballosFuerza = teclado.nextInt();
        camion.setCaballoFuerza(caballosFuerza);

        System.out.println("la nueva capacidad del camion es: " + camion.getCapacidad());
        System.out.println("los nuevos caballos de fuerza del camion son: " + camion.getCaballosFuerza());

        System.out.println("--------------------------");

        carro.imprimir();

        System.out.println("--------------------------");

        camioneta.imprimir();

        System.out.println("--------------------------");

        automovil.imprimir();

        System.out.println("--------------------------");

        camion.imprimir();

        System.out.println("--------------------------");

    }
}