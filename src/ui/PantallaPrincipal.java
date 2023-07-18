package ui;

import javax.swing.*;
import conversor.ConversorMonedas;
import conversor.ConversorTemperatura;

public class PantallaPrincipal {
    public static void main(String[] args) {
        do {
            String[] opciones = {"Conversor de monedas", 
            		             "Conversor de temperatura"};

            String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecciona una opción:",
                    "Pantalla Principal",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (opcionSeleccionada != null) {
                if (opcionSeleccionada.equals("Conversor de monedas")) {
                    ConversorMonedas conversorMonedas = new ConversorMonedas();
                    conversorMonedas.realizarConversion();
                } else if (opcionSeleccionada.equals("Conversor de temperatura")) {
                    ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
                    conversorTemperatura.realizarConversion();
                }
            } else {
                break;
            }
        } while (continuarConversion());

        JOptionPane.showMessageDialog(null, "Programa terminado.");
    }

    private static boolean continuarConversion() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
        return respuesta == JOptionPane.YES_OPTION;
    }
}
