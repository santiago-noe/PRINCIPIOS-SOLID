abstract class Forma {
    public abstract double calcularArea();
    
    // Método para validar dimensiones (común para todas las formas)
    protected void validarDimension(double valor, String nombreDimension) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                String.format("La dimensión '%s' debe ser mayor a cero. Valor recibido: %.2f", 
                            nombreDimension, valor)
            );
        }
    }
}