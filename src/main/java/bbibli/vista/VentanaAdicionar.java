package bbibli.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 26/08/13
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class VentanaAdicionar extends JFrame implements ActionListener {

    private JLabel autor,isbn,fPublicacion,titulo,NEjemplares;
    private JTextField autor1,isbn1,fPublicacion1,titulo1,NEjemplares1;

    public VentanaAdicionar()
    {
        setLayout(null);

        autor = new JLabel("Autor");
        autor.setBounds(20,30,70,100);
        add(autor);
        autor.setVisible(true);

        isbn = new JLabel("Isbn");
        isbn.setBounds(20,90,90,100);
        add(isbn);
        isbn.setVisible(true);

        fPublicacion = new JLabel("Fecha de publicacion");
        fPublicacion.setBounds(20,150,150,100);
        add(fPublicacion);
        fPublicacion.setVisible(true);

        titulo = new JLabel("titulo del libro");
        titulo.setBounds(20,220,100,100);
        add(titulo);
        titulo.setVisible(true);

        NEjemplares = new JLabel("Numero de ejemplares");
        NEjemplares.setBounds(20,280,150,100);
        add(NEjemplares);
        NEjemplares.setVisible(true);

        autor1 = new JTextField("") ;
        autor1.setBounds(60,70,100,40);
        add(autor1);
        autor1.setVisible(true);

        isbn1 = new JTextField("");
        isbn1.setBounds(50,120,90,40);
        add(isbn1);
        isbn1.setVisible(true);

        fPublicacion1 = new JTextField("");
        fPublicacion1.setBounds(160,180,120,40);
        add(fPublicacion1);
        fPublicacion1.setVisible(true);

        NEjemplares1 = new JTextField("") ;
        NEjemplares1.setBounds(160,250,120,40);
        add(NEjemplares1);
        NEjemplares1.setVisible(true);












    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}





