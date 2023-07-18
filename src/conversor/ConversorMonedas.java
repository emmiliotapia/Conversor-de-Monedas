package conversor;

import javax.swing.*;

public class ConversorMonedas {
    public void realizarConversion() {
        String[] opciones = {
            "MXN a USD (Dólar estadounidense)",
            "USD a MXN (Peso mexicano)",
            "MXN a EUR (Euro)",
            "EUR a MXN (Peso mexicano)",
            "MXN a GBP (Libra esterlina)",
            "GBP a MXN (Peso mexicano)"
        };

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona una opción:",
                "Conversor de Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (opcionSeleccionada != null) {
            String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero:");

            double cantidad = 0.0;
            try {
                cantidad = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa una cantidad numérica válida.");
                return;
            }

            double resultado = 0.0;
            String monedaOrigen = "";
            String monedaDestino = "";

            switch (opcionSeleccionada) {
                case "MXN a USD (Dólar estadounidense)":
                    resultado = mxnAUsd(cantidad);
                    monedaOrigen = "MXN";
                    monedaDestino = "USD";
                    break;
                case "USD a MXN (Peso mexicano)":
                    resultado = usdAMxn(cantidad);
                    monedaOrigen = "USD";
                    monedaDestino = "MXN";
                    break;
                case "MXN a EUR (Euro)":
                    resultado = mxnAEur(cantidad);
                    monedaOrigen = "MXN";
                    monedaDestino = "EUR";
                    break;
                case "EUR a MXN (Peso mexicano)":
                    resultado = eurAMxn(cantidad);
                    monedaOrigen = "EUR";
                    monedaDestino = "MXN";
                    break;
                case "MXN a GBP (Libra esterlina)":
                    resultado = mxnAGbp(cantidad);
                    monedaOrigen = "MXN";
                    monedaDestino = "GBP";
                    break;
                case "GBP a MXN (Peso mexicano)":
                    resultado = gbpAMxn(cantidad);
                    monedaOrigen = "GBP";
                    monedaDestino = "MXN";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    return;
            }

            String mensaje = String.format("%.2f %s equivale a %.2f %s.", cantidad, monedaOrigen, resultado, monedaDestino);
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    // Métodos de conversión privados

    private double mxnAUsd(double mxn) {
        // Supongamos que el tipo de cambio es 0.050
        return mxn * 0.050;
    }

    private double usdAMxn(double usd) {
        // Supongamos que el tipo de cambio es 20.0
        return usd * 20.0;
    }

    private double mxnAEur(double mxn) {
        // Supongamos que el tipo de cambio es 0.045
        return mxn * 0.045;
    }

    private double eurAMxn(double eur) {
        // Supongamos que el tipo de cambio es 22.0
        return eur * 22.0;
    }

    private double mxnAGbp(double mxn) {
        // Supongamos que el tipo de cambio es 0.040
        return mxn * 0.040;
    }

    private double gbpAMxn(double gbp) {
        // Supongamos que el tipo de cambio es 25.0
        return gbp * 25.0;
    }
}