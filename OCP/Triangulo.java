class Triangulo extends Forma {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        validarDimension(base, "base");
        validarDimension(altura, "altura");
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}