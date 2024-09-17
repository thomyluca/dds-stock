package ar.edu.utn.frba.dds.ejercicio_03;

import ar.edu.utn.frba.dds.Repositorio;

public class AMainEjercicio3 {
  // corre el metodo main para persistir y ver como queda en tu DB!

  public static void main(String[] args) {

    //* -------------- Marcas --------------
    Marca lays = new Marca();
    lays.setNombre("Lays");

    Marca cocaCola = new Marca();
    cocaCola.setNombre("Coca Cola");

    Marca paty = new Marca();
    paty.setNombre("Paty");

    Marca marcaNachos = new Marca();
    marcaNachos.setNombre("Combo Nachos!");

    Repositorio repo = new Repositorio();

    repo.guardar(lays);
    repo.guardar(cocaCola);
    repo.guardar(paty);
    repo.guardar(marcaNachos);

    //* -------------- Producto Simple --------------
    ProductoSimple papas = new ProductoSimple();
    papas.setNombre("Papas");
    papas.setMarca(lays);
    papas.setPrecio(100.0);
    papas.setStock(10);

    repo.guardar(papas);


    ProductoSimple coca = new ProductoSimple();
    coca.setNombre("Coca");
    coca.setMarca(cocaCola);
    coca.setStock(20);
    coca.setPrecio(150.0);

    repo.guardar(coca);


    ProductoSimple hamburguesa = new ProductoSimple();
    hamburguesa.setNombre("Hamburguesa");
    hamburguesa.setMarca(paty);
    hamburguesa.setStock(30);
    hamburguesa.setPrecio(200.0);

    repo.guardar(hamburguesa);

    Combo ComboHamburguesaConPapasYBebida = new Combo();
    ComboHamburguesaConPapasYBebida.setNombre("Combo Hamburguesa con Papas y Bebida");
    ComboHamburguesaConPapasYBebida.setMarca(marcaNachos);
    ComboHamburguesaConPapasYBebida.agregarProducto(hamburguesa);
    ComboHamburguesaConPapasYBebida.agregarProducto(papas);
    ComboHamburguesaConPapasYBebida.agregarProducto(coca);

    repo.guardar(ComboHamburguesaConPapasYBebida);

    DescuentoFijo descuentoFijo = new DescuentoFijo();
    descuentoFijo.setNombre("DescuentoFijo");
    descuentoFijo.setValor(100.0);

    repo.guardar(descuentoFijo);


    Packaging packagingDeHamburguesa = new Packaging();

    packagingDeHamburguesa.setPrecio(50.0);
    packagingDeHamburguesa.setProducto(hamburguesa);

    repo.guardar(packagingDeHamburguesa);
  }
}
