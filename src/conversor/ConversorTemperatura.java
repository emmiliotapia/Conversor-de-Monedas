package conversor;

import javax.swing.*;

public class ConversorTemperatura {
    public void realizarConversion() {
        String[] opciones = {"Celsius a Fahrenheit", 
        		             "Celsius a Kelvin", 
        		             "Fahrenheit a Celsius", 
        		             "Fahrenheit a Kelvin"};

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción:",
                "Conversor de Temperatura",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcionSeleccionada != null) {
            String input = JOptionPane.showInputDialog("Ingresa la temperatura:");

            double temperatura = 0.0;
            try {
                temperatura = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa una temperatura numérica válida.");
                return;
            }

            double resultado = 0.0;

            switch (opcionSeleccionada) {
                case "Celsius a Fahrenheit":
                    resultado = celsiusAFahrenheit(temperatura);
                    break;
                case "Celsius a Kelvin":
                    resultado = celsiusAKelvin(temperatura);
                    break;
                case "Fahrenheit a Celsius":
                    resultado = fahrenheitACelsius(temperatura);
                    break;
                case "Fahrenheit a Kelvin":
                    resultado = fahrenheitAKelvin(temperatura);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    return;
            }

            String mensaje = String.format("%.2f grados equivale a %.2f en la escala seleccionada.", temperatura, resultado);
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    // Métodos de conversión privados

    private double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    private double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private double fahrenheitAKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }
}

