/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_estructuraa;

import java.awt.Label;
import javax.swing.JFrame;

/**
 *
 * @author bryan
 */
public class Loggin extends javax.swing.JFrame {

    /**
     * Creates new form Loggin
     */
    public Loggin() {
        initComponents();
        this.setResizable(false);
        this.setSize(1153,680);
        this.setLocationRelativeTo(null);
        Fondo2.setVisible(false); 
        Fondo4.setVisible(false);
        Fondo5.setVisible(false);
        Menu.setVisible(false);
        panel_ingreso.setVisible(false);
        cambio_ecena_login cm = new cambio_ecena_login(Fondo2,Fondo3 ,panel_ingreso);
        cm.start();
        
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        Panel_Informes = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        Panel_Tienda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        Panel_Productos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Panel_Vendedores = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Panel_Factura = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Panel_menu_abajo = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        Panel_Menu_Izquierda = new javax.swing.JPanel();
        Tienda_Icono = new javax.swing.JLabel();
        Icono_Producto = new javax.swing.JLabel();
        Icono_Vendedor = new javax.swing.JLabel();
        Icono_Factura = new javax.swing.JLabel();
        Icono_Cliente = new javax.swing.JLabel();
        Panel_Cliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        Fondo5 = new javax.swing.JLabel();
        panel_ingreso = new javax.swing.JPanel();
        Usuario = new javax.swing.JTextField();
        Contra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        Fondo4 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Menu.setLayout(null);

        Panel_Informes.setBackground(new java.awt.Color(255, 255, 255,150));
        Panel_Informes.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel30.setText("Informes");
        Panel_Informes.add(jLabel30);
        jLabel30.setBounds(470, 0, 170, 60);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Informes.add(jComboBox3);
        jComboBox3.setBounds(460, 60, 170, 40);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        Panel_Informes.add(jScrollPane6);
        jScrollPane6.setBounds(30, 110, 960, 430);

        Menu.add(Panel_Informes);
        Panel_Informes.setBounds(1220, 0, 1060, 580);

        Panel_Tienda.setBackground(new java.awt.Color(255, 255, 255,150));
        Panel_Tienda.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Tienda.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Tienda");
        Panel_Tienda.add(jLabel1);
        jLabel1.setBounds(450, 10, 240, 64);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Horario");
        Panel_Tienda.add(jLabel26);
        jLabel26.setBounds(40, 200, 100, 30);

        jTextField14.setText("jTextField14");
        Panel_Tienda.add(jTextField14);
        jTextField14.setBounds(40, 70, 200, 30);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("ID");
        Panel_Tienda.add(jLabel27);
        jLabel27.setBounds(40, 40, 100, 30);

        jTextField15.setText("jTextField15");
        Panel_Tienda.add(jTextField15);
        jTextField15.setBounds(40, 150, 200, 30);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Nombre");
        Panel_Tienda.add(jLabel28);
        jLabel28.setBounds(40, 120, 100, 30);

        jTextField16.setText("jTextField16");
        Panel_Tienda.add(jTextField16);
        jTextField16.setBounds(40, 230, 200, 30);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        Panel_Tienda.add(jScrollPane5);
        jScrollPane5.setBounds(300, 100, 700, 440);

        jToggleButton1.setText("Modificar");
        Panel_Tienda.add(jToggleButton1);
        jToggleButton1.setBounds(60, 370, 150, 40);

        jToggleButton2.setText("Eliminar");
        Panel_Tienda.add(jToggleButton2);
        jToggleButton2.setBounds(60, 450, 150, 40);

        jToggleButton3.setText("Añadir");
        Panel_Tienda.add(jToggleButton3);
        jToggleButton3.setBounds(60, 300, 150, 40);

        Menu.add(Panel_Tienda);
        Panel_Tienda.setBounds(1230, 0, 1060, 580);

        Panel_Productos.setBackground(new java.awt.Color(255, 255, 255,150));
        Panel_Productos.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Productos.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setText("Productos");
        Panel_Productos.add(jLabel6);
        jLabel6.setBounds(500, 10, 270, 70);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("UPC");
        Panel_Productos.add(jLabel9);
        jLabel9.setBounds(70, 40, 37, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nombre");
        Panel_Productos.add(jLabel10);
        jLabel10.setBounds(70, 110, 80, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tamaño");
        Panel_Productos.add(jLabel11);
        jLabel11.setBounds(70, 180, 80, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Embalaje");
        Panel_Productos.add(jLabel12);
        jLabel12.setBounds(70, 320, 80, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Marca");
        Panel_Productos.add(jLabel13);
        jLabel13.setBounds(70, 250, 80, 20);
        Panel_Productos.add(jTextField1);
        jTextField1.setBounds(70, 270, 220, 30);
        Panel_Productos.add(jTextField2);
        jTextField2.setBounds(70, 60, 220, 30);
        Panel_Productos.add(jTextField3);
        jTextField3.setBounds(70, 130, 220, 30);
        Panel_Productos.add(jTextField4);
        jTextField4.setBounds(70, 200, 220, 30);

        jButton2.setText("Eliminar");
        Panel_Productos.add(jButton2);
        jButton2.setBounds(110, 510, 170, 40);

        jCheckBox1.setText("Si");
        Panel_Productos.add(jCheckBox1);
        jCheckBox1.setBounds(140, 320, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Panel_Productos.add(jScrollPane1);
        jScrollPane1.setBounds(350, 100, 670, 450);

        jButton3.setText("Agregar");
        Panel_Productos.add(jButton3);
        jButton3.setBounds(110, 390, 170, 40);

        jButton4.setText("Editar");
        Panel_Productos.add(jButton4);
        jButton4.setBounds(110, 450, 170, 40);

        Menu.add(Panel_Productos);
        Panel_Productos.setBounds(1230, 0, 1060, 580);

        Panel_Vendedores.setBackground(new java.awt.Color(255, 255, 255,150));
        Panel_Vendedores.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Vendedores.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setText("Vendedores");
        Panel_Vendedores.add(jLabel5);
        jLabel5.setBounds(400, 0, 270, 70);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("ID");
        Panel_Vendedores.add(jLabel15);
        jLabel15.setBounds(40, 120, 130, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Nombre");
        Panel_Vendedores.add(jLabel16);
        jLabel16.setBounds(40, 200, 130, 25);

        jTextField5.setText("jTextField5");
        Panel_Vendedores.add(jTextField5);
        jTextField5.setBounds(40, 230, 260, 30);

        jTextField6.setText("jTextField5");
        Panel_Vendedores.add(jTextField6);
        jTextField6.setBounds(40, 150, 260, 30);

        jButton5.setText("Modificar");
        Panel_Vendedores.add(jButton5);
        jButton5.setBounds(110, 380, 120, 40);

        jButton6.setText("Eliminar");
        Panel_Vendedores.add(jButton6);
        jButton6.setBounds(110, 450, 120, 40);

        jButton7.setText("Añadir");
        Panel_Vendedores.add(jButton7);
        jButton7.setBounds(110, 310, 120, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Panel_Vendedores.add(jScrollPane2);
        jScrollPane2.setBounds(340, 100, 680, 440);

        Menu.add(Panel_Vendedores);
        Panel_Vendedores.setBounds(1230, 0, 1060, 580);

        Panel_Factura.setBackground(new java.awt.Color(255, 255, 255,150));
        Panel_Factura.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Factura.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("Facturas");
        Panel_Factura.add(jLabel4);
        jLabel4.setBounds(470, 0, 270, 70);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Fecha");
        Panel_Factura.add(jLabel14);
        jLabel14.setBounds(30, 90, 100, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("ID Tienda");
        Panel_Factura.add(jLabel17);
        jLabel17.setBounds(30, 440, 100, 30);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Subtotal");
        Panel_Factura.add(jLabel18);
        jLabel18.setBounds(30, 230, 100, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Total");
        Panel_Factura.add(jLabel19);
        jLabel19.setBounds(30, 300, 100, 30);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("ISV");
        Panel_Factura.add(jLabel20);
        jLabel20.setBounds(30, 160, 100, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("ID Cliente");
        Panel_Factura.add(jLabel21);
        jLabel21.setBounds(30, 370, 100, 30);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Numero");
        Panel_Factura.add(jLabel22);
        jLabel22.setBounds(30, 20, 100, 30);

        jTextField7.setText("jTextField7");
        Panel_Factura.add(jTextField7);
        jTextField7.setBounds(30, 50, 190, 30);

        jFormattedTextField1.setText("jFormattedTextField1");
        Panel_Factura.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(30, 120, 190, 30);

        jTextField8.setText("jTextField8");
        Panel_Factura.add(jTextField8);
        jTextField8.setBounds(30, 190, 190, 30);

        jTextField9.setText("jTextField9");
        Panel_Factura.add(jTextField9);
        jTextField9.setBounds(30, 260, 190, 30);

        jTextField10.setText("jTextField10");
        Panel_Factura.add(jTextField10);
        jTextField10.setBounds(30, 330, 190, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Factura.add(jComboBox1);
        jComboBox1.setBounds(30, 400, 190, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel_Factura.add(jComboBox2);
        jComboBox2.setBounds(30, 470, 190, 30);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        Panel_Factura.add(jScrollPane3);
        jScrollPane3.setBounds(280, 90, 710, 460);

        Menu.add(Panel_Factura);
        Panel_Factura.setBounds(1230, 0, 1060, 580);

        Panel_menu_abajo.setBackground(new java.awt.Color(102, 102, 102,150));
        Panel_menu_abajo.setLayout(null);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Informe.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        Panel_menu_abajo.add(jLabel29);
        jLabel29.setBounds(30, 0, 50, 60);

        Menu.add(Panel_menu_abajo);
        Panel_menu_abajo.setBounds(90, 580, 1060, 70);

        Panel_Menu_Izquierda.setBackground(new java.awt.Color(102, 102, 102,150));
        Panel_Menu_Izquierda.setLayout(null);

        Tienda_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Tienda.png"))); // NOI18N
        Tienda_Icono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tienda_IconoMouseClicked(evt);
            }
        });
        Panel_Menu_Izquierda.add(Tienda_Icono);
        Tienda_Icono.setBounds(10, 20, 60, 60);

        Icono_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Producto.png"))); // NOI18N
        Icono_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icono_ProductoMouseClicked(evt);
            }
        });
        Panel_Menu_Izquierda.add(Icono_Producto);
        Icono_Producto.setBounds(10, 130, 70, 70);

        Icono_Vendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Vendedor.png"))); // NOI18N
        Icono_Vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icono_VendedorMouseClicked(evt);
            }
        });
        Panel_Menu_Izquierda.add(Icono_Vendedor);
        Icono_Vendedor.setBounds(10, 250, 60, 60);

        Icono_Factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Factura.png"))); // NOI18N
        Icono_Factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icono_FacturaMouseClicked(evt);
            }
        });
        Panel_Menu_Izquierda.add(Icono_Factura);
        Icono_Factura.setBounds(10, 360, 60, 70);

        Icono_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Cliente.png"))); // NOI18N
        Icono_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icono_ClienteMouseClicked(evt);
            }
        });
        Panel_Menu_Izquierda.add(Icono_Cliente);
        Icono_Cliente.setBounds(10, 470, 60, 70);

        Menu.add(Panel_Menu_Izquierda);
        Panel_Menu_Izquierda.setBounds(0, 0, 90, 650);

        Panel_Cliente.setBackground(new java.awt.Color(255, 255, 255,150));
        Panel_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Cliente.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Clientes");
        Panel_Cliente.add(jLabel3);
        jLabel3.setBounds(420, 10, 270, 70);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Nombre");
        Panel_Cliente.add(jLabel23);
        jLabel23.setBounds(50, 130, 110, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("Correo");
        Panel_Cliente.add(jLabel24);
        jLabel24.setBounds(50, 210, 60, 30);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("ID");
        Panel_Cliente.add(jLabel25);
        jLabel25.setBounds(50, 50, 60, 30);

        jTextField11.setText("jTextField11");
        Panel_Cliente.add(jTextField11);
        jTextField11.setBounds(50, 80, 210, 30);

        jTextField12.setText("jTextField12");
        Panel_Cliente.add(jTextField12);
        jTextField12.setBounds(50, 160, 210, 30);

        jTextField13.setText("jTextField13");
        Panel_Cliente.add(jTextField13);
        jTextField13.setBounds(50, 240, 210, 30);

        jButton8.setText("Eliminar");
        Panel_Cliente.add(jButton8);
        jButton8.setBounds(60, 450, 160, 40);

        jButton9.setText("Añadir");
        Panel_Cliente.add(jButton9);
        jButton9.setBounds(60, 310, 160, 40);

        jButton10.setText("Modificar");
        Panel_Cliente.add(jButton10);
        jButton10.setBounds(60, 380, 160, 40);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        Panel_Cliente.add(jScrollPane4);
        jScrollPane4.setBounds(330, 90, 670, 450);

        Menu.add(Panel_Cliente);
        Panel_Cliente.setBounds(1230, 0, 1060, 580);

        Fondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/frame menu.png"))); // NOI18N
        Menu.add(Fondo5);
        Fondo5.setBounds(0, 0, 1160, 650);

        getContentPane().add(Menu);
        Menu.setBounds(0, 0, 2300, 650);

        panel_ingreso.setBackground(new java.awt.Color(255, 255, 255));
        panel_ingreso.setLayout(null);
        panel_ingreso.add(Usuario);
        Usuario.setBounds(60, 350, 320, 40);
        panel_ingreso.add(Contra);
        Contra.setBounds(60, 440, 320, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/undraw_welcoming_re_x0qo 1persona.png"))); // NOI18N
        panel_ingreso.add(jLabel2);
        jLabel2.setBounds(70, 10, 250, 310);

        jButton1.setText("Ingresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        panel_ingreso.add(jButton1);
        jButton1.setBounds(150, 500, 120, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Usuario");
        panel_ingreso.add(jLabel7);
        jLabel7.setBounds(60, 320, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Contraseña");
        panel_ingreso.add(jLabel8);
        jLabel8.setBounds(60, 410, 100, 25);

        getContentPane().add(panel_ingreso);
        panel_ingreso.setBounds(380, 30, 420, 580);

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/fondo estatico.png"))); // NOI18N
        getContentPane().add(Fondo2);
        Fondo2.setBounds(0, 0, 1160, 648);

        Fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/continuacion-animacion_1.gif"))); // NOI18N
        getContentPane().add(Fondo4);
        Fondo4.setBounds(-3, -4, 1160, 650);

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/fondo_animado_login.gif"))); // NOI18N
        getContentPane().add(Fondo3);
        Fondo3.setBounds(0, -10, 1170, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Fondo2.setVisible(false);
        Fondo4.setVisible(true);
        panel_ingreso.setVisible(false);
        Cambio_Ecena_Menu cmm = new Cambio_Ecena_Menu(Fondo4,Fondo5 ,Menu);
        cmm.start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void Tienda_IconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tienda_IconoMouseClicked

        Cambio_Menu CM= new Cambio_Menu(Panel_Tienda,Panel_Productos,Panel_Vendedores,Panel_Factura,Panel_Cliente,Panel_Informes);
        CM.start();
    }//GEN-LAST:event_Tienda_IconoMouseClicked

    private void Icono_ProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_ProductoMouseClicked
        Cambio_Menu CM= new Cambio_Menu(Panel_Productos,Panel_Tienda,Panel_Vendedores,Panel_Factura,Panel_Cliente,Panel_Informes);
        CM.start();
    }//GEN-LAST:event_Icono_ProductoMouseClicked

    private void Icono_VendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_VendedorMouseClicked
        Cambio_Menu CM= new Cambio_Menu(Panel_Vendedores,Panel_Tienda,Panel_Productos,Panel_Factura,Panel_Cliente,Panel_Informes);
        CM.start();
    }//GEN-LAST:event_Icono_VendedorMouseClicked

    private void Icono_FacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_FacturaMouseClicked
        Cambio_Menu CM= new Cambio_Menu(Panel_Factura,Panel_Cliente,Panel_Tienda,Panel_Productos,Panel_Vendedores,Panel_Informes);
        CM.start();
    }//GEN-LAST:event_Icono_FacturaMouseClicked

    private void Icono_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_ClienteMouseClicked
        Cambio_Menu CM= new Cambio_Menu(Panel_Cliente,Panel_Tienda,Panel_Productos,Panel_Vendedores,Panel_Factura,Panel_Informes);
        CM.start();
    }//GEN-LAST:event_Icono_ClienteMouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        Cambio_Menu CM= new Cambio_Menu(Panel_Informes,Panel_Cliente,Panel_Tienda,Panel_Productos,Panel_Vendedores,Panel_Factura);
        CM.start();
    }//GEN-LAST:event_jLabel29MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contra;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel Fondo4;
    private javax.swing.JLabel Fondo5;
    private javax.swing.JLabel Icono_Cliente;
    private javax.swing.JLabel Icono_Factura;
    private javax.swing.JLabel Icono_Producto;
    private javax.swing.JLabel Icono_Vendedor;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Panel_Cliente;
    private javax.swing.JPanel Panel_Factura;
    private javax.swing.JPanel Panel_Informes;
    private javax.swing.JPanel Panel_Menu_Izquierda;
    private javax.swing.JPanel Panel_Productos;
    private javax.swing.JPanel Panel_Tienda;
    private javax.swing.JPanel Panel_Vendedores;
    private javax.swing.JPanel Panel_menu_abajo;
    private javax.swing.JLabel Tienda_Icono;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JPanel panel_ingreso;
    // End of variables declaration//GEN-END:variables
}