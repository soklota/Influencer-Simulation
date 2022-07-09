/**Author: Sydney Oklota
 * Copyright Sydney Oklota <2022>
 * This class is responsible for the starting window of the simulation.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainUI {

    public static void main(String[] args) {

        //Sets variables to texts
        final JFrame frame = new JFrame("Influencer Simulation");
        final JButton btnStart = new JButton("Click here to begin");
        final JButton btnQuit = new JButton("Quit");
        final JLabel title = new JLabel("Welcome to an Influencer Simulation!");
        final JLabel description1 = new JLabel("In this simulation, you'll witness the the inevitible downfall of an influencer.");
        final JLabel description2 = new JLabel("It's only a matter of weeks before they get canceled!");
        
        //listens for button action
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserOptions userOP = new UserOptions(frame);
                userOP.setVisible(true);
            }
        });

        btnQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Creates panel bp
        JPanel bp = new JPanel();
        frame.getContentPane();

        //Creates and adds title to panel bp
        title.setBounds(10, 50, 1000, 100);
        title.setFont(new Font("Ink Free",Font.BOLD,40));
        bp.setLayout(null);
        bp.add(title);

        //Creates and adds two description lines to panel bp
        description1.setBounds(200, 100, 1000, 100);
        description1.setFont(new Font("Segoe UI Variable Text Light",Font.PLAIN,20));
        description2.setBounds(280, 120, 1000, 100);
        description2.setFont(new Font("Segoe UI Variable Text Light",Font.PLAIN,20));
        bp.add(description1);
        bp.add(description2);

        //Creates and adds JLabel of an icon to panel bp
        JLabel people = new JLabel();
        people.setIcon(new ImageIcon("people.png"));
        Dimension peopleSize = people.getPreferredSize();
        people.setBounds(0, 160, peopleSize.width, peopleSize.height);
        bp.add(people);

        //Creates and adds JLabel of an icon to panel bp
        JLabel icons = new JLabel();
        icons.setIcon(new ImageIcon("icons.png"));
        Dimension iconsSize = icons.getPreferredSize();
        icons.setBounds(365,300,iconsSize.width,iconsSize.height);
        bp.add(icons);

        //Creates and adds Start button to panel bp
        btnStart.setBounds(525,600, 300,50);
        btnStart.setFont(new Font("Ink Free",Font.BOLD,20));
        bp.add(btnStart);
       
        //Creates and adds Quit button to panel bp
        btnQuit.setBounds(900,10, 80,30);
        btnQuit.setFont(new Font("Ink Free",Font.BOLD,15));
        bp.add(btnQuit);

        //adds panel to frame + frame attributes
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(1000,810);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(bp);
        frame.setVisible(true);
    }
}