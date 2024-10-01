package com.inventario.gui;

import javax.swing.*;
import java.awt.*;
import com.inventario.model.*;

public class ProductRegistrationFrame extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField quantityField;
    private JTable productTable;
    private ProductTableModel tableModel;

    public ProductRegistrationFrame() {
        setTitle("Registro de Productos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        // Implementa la inicialización de componentes
    }

    private void saveProduct() {
        // Implementa la lógica de guardado
    }
}
