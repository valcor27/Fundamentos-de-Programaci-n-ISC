import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.GridBagLayout;

public class VentanaSalir {
    public static void main(String[] args) {
        // Iniciar la interfaz gráfica de forma segura
        SwingUtilities.invokeLater(() -> {
            // 1. Configurar la ventana
            JFrame ventana = new JFrame("Mi Ventana");
            ventana.setSize(300, 200);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLocationRelativeTo(null); // Centra la ventana en la pantalla
            ventana.setLayout(new GridBagLayout()); // Centra el botón en medio de la ventana

            // 2. Crear el botón
            JButton botonSalir = new JButton("Salir");

            // 3. Asignar la acción al hacer clic
            botonSalir.addActionListener(e -> {
                ventana.dispose(); // Cierra la ventana
                System.exit(0); // Termina el programa por completo
            });

            // 4. Agregar el botón y mostrar la ventana
            ventana.add(botonSalir);
            ventana.setVisible(true);
        });
    }
}