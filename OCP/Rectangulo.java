class Rectangulo extends Forma {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto) {
        validarDimension(ancho, "ancho");
        validarDimension(alto, "alto");
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double getAncho() {
        return ancho;
    }
    
    public double getAlto() {
        return alto;
    }
    
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}