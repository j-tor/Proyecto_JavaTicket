/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

/**
 *
 * @author aleja
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Login2 extends JFrame {
    private JTextField UserName;
    private JPasswordField UserPassword;
    private JButton Singin;

    private UserManager userManager;

    public Login2(UserManager userManager) {
        this.userManager = userManager;

        // Configure the frame
        setTitle("Login");
        setSize(605, 605); // Cambiar el tamaño a 605x605
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout()); // Usar GridBagLayout para centrar los componentes
        getContentPane().setBackground(new Color(0, 102, 153)); // Establecer el fondo a color (0, 102, 153)

        // Inicializar componentes
//        JLabel label = new JLabel("Login");
//        label.setBounds(200, 20, 200, 50);
//        label.setFont(new Font("arial", 0, 30));
//        add(label);
        UserName = new JTextField(15); // Ajustar el tamaño del JTextField
        UserName.setBackground(Color.WHITE); // Establecer el fondo blanco
        UserName.setForeground(new Color(0, 102, 153)); // Establecer el color del texto
        UserPassword = new JPasswordField(15); // Ajustar el tamaño del JPasswordField
        UserPassword.setBackground(Color.WHITE); // Establecer el fondo blanco
        UserPassword.setForeground(new Color(0, 102, 153)); // Establecer el color del texto
        Singin = new JButton("Sign In");
        Singin.setBackground(new Color(0, 102, 153)); // Establecer el fondo del botón
        Singin.setForeground(Color.WHITE); // Establecer el color del texto del botón

        // Configurar restricciones para centrar los componentes
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        // Agregar componentes al frame con restricciones para centrarlos
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(new JLabel("Username:"), constraints);
        constraints.gridx = 1;
        add(UserName, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(new JLabel("Password:"), constraints);
        constraints.gridx = 1;
        add(UserPassword, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        add(Singin, constraints);
        setLocationRelativeTo(null);
        
        

        // Agregar ActionListener al botón Sign In
        Singin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signInButtonActionPerformed(e);
            }
        });
    }

    private void signInButtonActionPerformed(ActionEvent e) {
        String username = UserName.getText();
        String password = new String(UserPassword.getPassword());

        // Comprobar si las credenciales proporcionadas son válidas
        UserData currentUser = userManager.isValidLogin(username, password);

        if (currentUser != null) {
            // Inicio de sesión exitoso
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            System.out.println("Inicio de sesión: usuario " + username + " con contraseña " + password);
            userManager.setCurrentUser(currentUser);

            // Cerrar la ventana de inicio de sesión
            this.dispose();

            // Abrir el menú principal u otra pantalla
            Menu menu = new Menu(userManager, currentUser);
            menu.setVisible(true);
        } else {
            // Credenciales no válidas
            JOptionPane.showMessageDialog(this, "Usuario o contraseña no válidos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserManager userManager = new UserManager();
                Login2 loginFrame = new Login2(userManager);
                loginFrame.setVisible(true);
            }
        });
    }
}
