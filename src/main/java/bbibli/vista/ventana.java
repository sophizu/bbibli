package bbibli.vista;

import bbibli.control.Nodo;
import bbibli.modelo.Listas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 20/08/13
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class ventana extends JFrame implements ActionListener {

    // componentes para la creacion de la ventana


        public Listas milisti = new Listas();
        public Nodo nuevo2 = new Nodo("VAMPYR");
        public Nodo nuevo3 = new Nodo("BRIDA");
        public  String dato = "";
        private JLabel texto0, texto1, texto2, texto3, texto4, texto5, texto6;
        private JTextField campo1, campo2, campo3, campo4, campo5;
        private JButton boton1, boton2, boton3,boton4, boton5,salir,adicionar;






    public  ventana(){

            setTitle("UNIVERSIDAD DE MANIZALES");
            setResizable(true);
            setSize(3000,2000);
            setLayout(null);


            setLayout(null);
            boton1 = new JButton("INGRESAR AL SISTEMA");
            boton1.setBounds(250,20,200,50);
            add(boton1);
            boton1.addActionListener(this);

            texto0 = new JLabel ("--");
            texto0.setBounds(320,70,200,100);
            add(texto0);
            texto0.setVisible(true);
            texto0.setBackground(Color.GREEN);
            texto0.setForeground(Color.BLUE);



            texto1 = new JLabel ("INGRESE UN LIBRO ANTES  ");
            texto1.setBounds(20,150,200,100);
            add(texto1);
            texto1.setVisible(true);

            campo1 = new JTextField();
            campo1.setBounds(230,180,90,30);
            add(campo1);
            campo1.setVisible(true);

            boton2 = new JButton("CONTINUE");
            boton2.setBounds(380,180,100,30);
            add(boton2);
            boton2.addActionListener(this);
            boton2.setVisible(true);

            texto2 = new JLabel ("INGRESE LIBRO DESPUES");
            texto2.setBounds(20,230,200,100);
            add(texto2);
            texto2.setVisible(true);

            campo2 = new JTextField();
            campo2.setBounds(230,260,90,30);
            add(campo2);
            campo2.setVisible(true);

            boton3 = new JButton("CONTINUE");
            boton3.setBounds(380,260,100,30);
            add(boton3);
            boton3.addActionListener(this);
            boton3.setVisible(true);

            texto3 = new JLabel ("TOME UN LIBRO DE REFERENCIA PARA INSERTAR");
            texto3.setBounds(20,310,200,100);
            add(texto3);
            texto3.setVisible(true);

            campo3 = new JTextField();
            campo3.setBounds(230,340,90,30);
            add(campo3);
            campo3.setVisible(true);

            boton4 = new JButton("CONTINUE");
            boton4.setBounds(380,340,100,30);
            add(boton4);
            boton4.addActionListener(this);
            boton4.setVisible(true);

            texto4 = new JLabel ("¿QUE LIBRO DESEA ELIMINAR");
            texto4.setBounds(20,390,200,100);
            add(texto4);
            texto4.setVisible(true);

            campo4 = new JTextField();
            campo4.setBounds(230,420,90,30);
            add(campo4);
            campo4.setVisible(true);

            boton5 = new JButton("CONTINUE");
            boton5.setBounds(380,420,100,30);
            add(boton5);
            boton5.addActionListener(this);
            boton5.setVisible(true);

            salir = new JButton("SALIR");
            salir.setBounds(100,500,100,30);
            add(salir);
            salir.setVisible(true);
            salir.addActionListener(this);


            adicionar = new JButton("Adicionar Libro");
            adicionar.setBounds(300, 500, 150, 30);
            add(adicionar);
            adicionar.setVisible(true);
            adicionar.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e){


        if(e.getSource() == adicionar)
        {
            VentanaAdicionar ven2 = new VentanaAdicionar();
            ven2.setBounds(10,20,800,600);
            ven2.show();
        }


        if (e.getSource()==salir){
            System.exit(0);
        }

        if(e.getSource() == boton1){

            milisti.cab.sig = nuevo2;
            milisti.cab.sig.sig = nuevo3;
            dato = milisti.recorrido(milisti.cab);
            texto0.setText(dato);
            texto0.setVisible(true);
            texto1.setVisible(true);
            campo1.setVisible(true);
            boton2.setVisible(true);
        }
        if(e.getSource() == boton2){
            if((campo1.getText().compareTo("DON QUIJOTE") == 0) ||(campo1.getText().compareTo("VAMPYR") == 0 || (campo1.getText().compareTo("BRIDA") == 0)))
                if (campo1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "ES NECESARIO INGRESAR UN LIBRO");
                }
                else
                {
                    texto2.setVisible(true);
                    campo2.setVisible(true);
                    boton3.setVisible(true);
                    campo1.setEnabled(false);
                }
            }
            else{
                //JOptionPane.showMessageDialog(null, "No hay ningun libro existente");
                return;
            }


        if(e.getSource() == boton3){
            if (campo1.getText().compareTo("DON QUIJOTE")==0)
            {
                milisti.AdicionarNodoDespues(milisti.cab, campo2.getText());
            }
            else if ((campo1.getText().compareTo("VAMPYR"))==0)
            {
                milisti.AdicionarNodoDespues(nuevo2, campo2.getText());
            }
            else if ((campo1.getText().compareTo("BRIDA"))==0)
            {
                milisti.AdicionarNodoDespues(nuevo3, campo2.getText());
            }
            dato = milisti.recorrido(milisti.cab);
            texto0.setText(dato);

            texto3.setVisible(true);
            campo3.setVisible(true);
            boton4.setVisible(true);

        }


        if(e.getSource() == boton4)
        {
            if (campo1.getText().compareTo("")==0)
            {
                milisti.AdicionarNodoAntes(milisti.cab, campo3.getText());
            }

            else if (campo1.getText().compareTo("")==0)
            {
                milisti.AdicionarNodoAntes(nuevo2, campo3.getText());
            }
            else if (campo1.getText().compareTo("")==0)
            {
                milisti.AdicionarNodoAntes(nuevo3, campo3.getText());
            }
            dato = milisti.recorrido(milisti.cab);
            texto0.setText(dato);

            texto4.setVisible(true);
            campo4.setVisible(true);
            boton5.setVisible(true);

        }
        if(e.getSource() == boton5)
        {
            String dato_mod = "";
            dato_mod = dato.replace(campo4.getText(), "");
            texto0.setText(dato_mod);




        if (e.getSource()==salir){
            System.exit(0);


        }

        }
    }



    public static void main(String[] args) {

        ventana ventanita = new ventana();         // medidas de la ventana principal
        ventanita.setBounds(30, 30, 700, 700);
        ventanita.setVisible(true);
        ventanita.setResizable(false);
    }




}



