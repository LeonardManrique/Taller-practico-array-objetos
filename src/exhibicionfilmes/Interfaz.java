package exhibicionfilmes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
/**
 *
 * @author Leonard Manrique
 */
public class Interfaz extends JFrame implements ActionListener{
    Pelicula pel1 = new Pelicula("Avengers: Endgame", "Joe Russo, Anthony Russo", 2019, "Los Vengadores restantes deben encontrar una manera de recuperar a sus aliados\npara un enfrentamiento épico con Thanos, el malvado que diezmó el planeta y el universo.");
    Pelicula pel2 = new Pelicula("Spiderman: Far From Home", "Jon Watts", 2019, "Peter Parker decide pasar unas merecidas vacaciones en Europa junto a MJ, Ned y el resto de sus amigos.\nSin embargo, Peter debe volver a ponerse el traje de Spider-Man cuando Nick Fury le encomienda una nueva misión:\nfrenar el ataque de unas criaturas que están causando el caos en el continente.");
    Pelicula pel3 = new Pelicula("Fast & Furious Presents: Hobbs & Shaw", "David Leitch", 2019, "Spin-off de la franquicia cinematográfica \"Fast & Furious\", que sigue al policían\nestadounidense Hobbs y al mercenario británico Shaw. En el pasado, Hobbs encarceló a Shaw después de que este intentara matarlo.\nAhora deben aliarse para combatir al terrorista Brixton, que tiene una fuerza sobrenatural.");
    Pelicula pel4 = new Pelicula("The Do Over", "Steven Brill", 2016, "La vida de un gerente de banco da un vuelco cuando un amigo del pasado lo manipula para que\nfinja su propia muerte y viva una aventura completamente nueva.");
    Pelicula pel5 = new Pelicula("John Wick: Chapter 2", "Chad Stahelski", 2017, "El legendario sicario John Wick abandona su retiro cuando, debido a un pacto de sangre que le vincula a un colega,\nse ve obligado a viajar a Roma para enfrentarse a los asesinos más peligrosos del mundo y aniquilar a una organización secreta.");
    Pelicula pel6 = new Pelicula("6 Underground", "Michael Bay", 2019, "Seis de diferentes partes del mundo. Cada una de las cuales es la mejor en lo que hacen y han sido\nelegidas no solo por su habilidad, sino por su deseo único de dejar atrás su pasado para cambiar el futuro.");
    Pelicula pel7 = new Pelicula("Sand Castle", "Fernando Coimbra", 2017, "Tras la invasión de Irak en 2003, un pelotón trata de\nreparar el sistema de abastecimiento de agua en una zona hostil.");
    Pelicula pel8 = new Pelicula("Atomic Blonde", "David Leitch", 2017, "Sensual y salvaje, la espía inglesa Lorraine Broughton viaja a Berlín\npoco antes de que caiga el Muro para recuperar un documento extremadamente valioso y\nacabar con una red de espías que ha asesinado a un agente encubierto. Lorraine no se detendrá ante nada ni nadie\npor cumplir su misión, aunque a veces resulte difícil discernir quién está de su parte y quién no.");
    Pelicula pel9 = new Pelicula("Bright", "David Ayer", 2017, "Dos policías deben dejar de lado sus diferencias para proteger a\nuna joven elfa hembra y a una reliquia del pensamiento.");
    Pelicula pel10 = new Pelicula("Central Intelligence", "Rawson Marshall Thurber", 2016, "Un agente de la CIA que solía sufrir acoso escolar se reencuentra\ncon sus compañeros en una reunión de antiguos alumnos, aunque ahora él es musculoso y fuerte.\nAllí recluta al que era el chico más popular de la escuela, quien ahora tiene una vida monótona y predecible,\npara que le ayude en una peligrosa misión en la que ambos tendrán que arriesgarlo todo.");
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    public Interfaz(){
                ArrayList lista = new ArrayList();
        lista.add(pel1);
        lista.add(pel2);
        lista.add(pel3);
        lista.add(pel4);
        lista.add(pel5);
        lista.add(pel6);
        lista.add(pel7);
        lista.add(pel8);
        lista.add(pel9);
        lista.add(pel10);
        setBounds(100, 250, 1200, 300);
        setLayout(new GridLayout(3, 1));
        JLabel L1;
        L1 = new JLabel("Seleccione una película: ");
        add(L1);
        b1 = new JButton(pel1.getNombre());
        b1.setActionCommand("1");
        b1.addActionListener(this);
        b2 = new JButton(pel2.getNombre());
        b2.setActionCommand("2");
        b2.addActionListener(this);
        b3 = new JButton(pel3.getNombre());
        b3.setActionCommand("3");
        b3.addActionListener(this);
        b4 = new JButton(pel4.getNombre());
        b4.setActionCommand("4");
        b4.addActionListener(this);
        b5 = new JButton(pel5.getNombre());
        b5.setActionCommand("5");
        b5.addActionListener(this);
        b6 = new JButton(pel6.getNombre());
        b6.setActionCommand("6");
        b6.addActionListener(this);
        b7 = new JButton(pel7.getNombre());
        b7.setActionCommand("7");
        b7.addActionListener(this);
        b8 = new JButton(pel8.getNombre());
        b8.setActionCommand("8");
        b8.addActionListener(this);
        b9 = new JButton(pel9.getNombre());
        b9.setActionCommand("9");
        b9.addActionListener(this);
        b10 = new JButton(pel10.getNombre());
        b10.setActionCommand("10");
        b10.addActionListener(this);
        b11 = new JButton("Salir");
        b11.setActionCommand("Salir");
        b11.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("1")){
            JOptionPane.showMessageDialog(null, pel1.getNombre()+"\n"+pel1.getDirector()+"\n"+pel1.getAño()+"\n"+pel1.getReseña());
        }
        else{
            if(e.getActionCommand().equals("2")){
                JOptionPane.showMessageDialog(null, pel2.getNombre()+"\n"+pel2.getDirector()+"\n"+pel2.getAño()+"\n"+pel2.getReseña());
            }
            else{
                if(e.getActionCommand().equals("3")){
                    JOptionPane.showMessageDialog(null, pel3.getNombre()+"\n"+pel3.getDirector()+"\n"+pel3.getAño()+"\n"+pel3.getReseña());
                }
                else{
                    if(e.getActionCommand().equals("4")){
                        JOptionPane.showMessageDialog(null, pel4.getNombre()+"\n"+pel4.getDirector()+"\n"+pel4.getAño()+"\n"+pel4.getReseña());
                    }
                    else{
                        if(e.getActionCommand().equals("5")){
                            JOptionPane.showMessageDialog(null, pel5.getNombre()+"\n"+pel5.getDirector()+"\n"+pel5.getAño()+"\n"+pel5.getReseña());
                        }
                        else{
                            if(e.getActionCommand().equals("6")){
                                JOptionPane.showMessageDialog(null, pel6.getNombre()+"\n"+pel6.getDirector()+"\n"+pel6.getAño()+"\n"+pel6.getReseña());
                            }
                            else{
                                if(e.getActionCommand().equals("7")){
                                    JOptionPane.showMessageDialog(null, pel7.getNombre()+"\n"+pel7.getDirector()+"\n"+pel7.getAño()+"\n"+pel7.getReseña());
                                }
                                else{
                                    if(e.getActionCommand().equals("8")){
                                        JOptionPane.showMessageDialog(null, pel8.getNombre()+"\n"+pel8.getDirector()+"\n"+pel8.getAño()+"\n"+pel8.getReseña());
                                    }
                                    else{
                                        if(e.getActionCommand().equals("9")){
                                            JOptionPane.showMessageDialog(null, pel9.getNombre()+"\n"+pel9.getDirector()+"\n"+pel9.getAño()+"\n"+pel9.getReseña());
                                        }
                                        else{
                                            if(e.getActionCommand().equals("10")){
                                                JOptionPane.showMessageDialog(null, pel10.getNombre()+"\n"+pel10.getDirector()+"\n"+pel10.getAño()+"\n"+pel10.getReseña());
                                            }
                                            else{
                                                if(e.getActionCommand().equals("Salir")){
                                                    JOptionPane.showMessageDialog(null, "Saliendo");
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Error.");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
