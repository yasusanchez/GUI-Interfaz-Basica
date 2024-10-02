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
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Nombre:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Precio:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        inputPanel.add(new JLabel("Cantidad:"));
        quantityField = new JTextField();
        inputPanel.add(quantityField);

        JButton saveButton = new JButton("Guardar");
        saveButton.addActionListener(e -> saveProduct());

        add(inputPanel, BorderLayout.NORTH);
        add(saveButton, BorderLayout.SOUTH);

        tableModel = new ProductTableModel();
        productTable = new JTable(tableModel);
        add(new JScrollPane(productTable), BorderLayout.CENTER);
    }

    private void saveProduct() {
        // Implementa la lógica de guardado

        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            int quantity = Integer.parseInt(quantityField.getText());

            Product product = new Product(id, name, price, quantity);
            tableModel.addProduct(product);

            // Limpia los campos
            idField.setText("");
            nameField.setText("");
            priceField.setText("");
            quantityField.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese datos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
