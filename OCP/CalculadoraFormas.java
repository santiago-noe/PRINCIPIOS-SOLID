import java.util.List;
import java.util.ArrayList;

public class CalculadoraFormas {
    public double calcularTotalArea(List<Forma> formas) {
        if (formas == null) {
            throw new IllegalArgumentException("La lista de formas no puede ser nula");
        }
        
        double totalArea = 0;
        for (Forma forma : formas) {
            totalArea += forma.calcularArea();
        }
        return totalArea;
    }
    
    public static void main(String[] args) {
        CalculadoraFormas calculadora = new CalculadoraFormas();
        
        // Crear lista de formas
        List<Forma> formas = new ArrayList<>();
        formas.add(new Rectangulo(5, 10));
        formas.add(new Circulo(3));
        formas.add(new Triangulo(4, 6));
        
        // Calcular área total
        double areaTotal = calculadora.calcularTotalArea(formas);
        System.out.println("Área total de todas las formas: " + areaTotal);
        
        // Mostrar áreas individuales
        System.out.println("\nÁreas individuales:");
        for (int i = 0; i < formas.size(); i++) {
            Forma forma = formas.get(i);
            String tipoForma = forma.getClass().getSimpleName();
            System.out.printf("%s: %.2f%n", tipoForma, forma.calcularArea());
        }
        
        // Prueba de validación de dimensiones
        try {
            new Rectangulo(-5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("\nValidación funcionando: " + e.getMessage());
        }
    }
}