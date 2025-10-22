class Circulo extends Forma {
    private double radio;
    
    public Circulo(double radio) {
        validarDimension(radio, "radio");
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}