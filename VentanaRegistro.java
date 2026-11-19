// IMPORTANTE: Este archivo debe llamarse exactamente VentanaRegistro.java

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JFrame {
    
    // Lista para guardar los datos (La memoria del programa)
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    // Componentes de la interfaz visual
    private JTextField txtMatricula, txtNombre, txtApPat, txtApMat;
    private JButton btnRegistrar;
    private DefaultTableModel modeloTabla;
    private JTable tablaEstudiantes;

    public VentanaRegistro() {
        // 1. Configuración básica de la ventana
        setTitle("Registro de Estudiantes");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana
        setLayout(new BorderLayout(10, 10));

        // 2. PANEL SUPERIOR: Formulario de captura
        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        panelFormulario.add(new JLabel("Matrícula:"));
        txtMatricula = new JTextField();
        panelFormulario.add(txtMatricula);

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Apellido Paterno:"));
        txtApPat = new JTextField();
        panelFormulario.add(txtApPat);

        panelFormulario.add(new JLabel("Apellido Materno:"));
        txtApMat = new JTextField();
        panelFormulario.add(txtApMat);

        panelFormulario.add(new JLabel("")); // Espacio vacío para estética
        btnRegistrar = new JButton("Registrar Alumno");
        panelFormulario.add(btnRegistrar);

        add(panelFormulario, BorderLayout.NORTH); 

        // 3. PANEL CENTRAL: Tabla de datos
        String[] columnas = {"Matrícula", "Nombre", "Ap. Paterno", "Ap. Materno"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaEstudiantes = new JTable(modeloTabla);
        
        JScrollPane scrollTabla = new JScrollPane(tablaEstudiantes);
        add(scrollTabla, BorderLayout.CENTER); 

        // 4. EVENTO DEL BOTÓN: ¿Qué pasa al hacer clic?
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarEstudiante();
            }
        });
    }

    // Método (función) que procesa el registro
    private void registrarEstudiante() {
        // Leer cajas de texto
        String mat = txtMatricula.getText();
        String nom = txtNombre.getText();
        String apPat = txtApPat.getText();
        String apMat = txtApMat.getText();

        // Validar que no envíen datos vacíos
        if (mat.isEmpty() || nom.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La matrícula y el nombre son obligatorios.", "Faltan datos", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        // Crear el objeto usando nuestra clase del otro archivo
        Estudiante nuevoAlumno = new Estudiante(mat, nom, apPat, apMat);
        
        // Guardarlo en el ArrayList
        listaEstudiantes.add(nuevoAlumno);

        // Agregarlo a la tabla visual
        Object[] filaVisual = {nuevoAlumno.matricula, nuevoAlumno.nombre, nuevoAlumno.apellidoPaterno, nuevoAlumno.apellidoMaterno};
        modeloTabla.addRow(filaVisual);

        // Limpiar formulario
        txtMatricula.setText("");
        txtNombre.setText("");
        txtApPat.setText("");
        txtApMat.setText("");
        
        txtMatricula.requestFocus(); // Regresar el cursor arriba
    }

    // MAIN: El motor de arranque
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
            }
        });
    }
}