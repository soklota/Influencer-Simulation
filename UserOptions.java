import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class UserOptions extends JDialog {
    
    private JButton btnCont = new JButton("YES continue");
    private JButton btnQuit = new JButton("NO quit");

    public UserOptions(Frame parent) {
        super(parent,"Influencer Simulation - would you like to continue?", true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.SOUTHEAST;

        //SETTING THE COLOR
        panel.setBorder(new LineBorder(Color.GRAY));

        //button functions
        btnCont.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //continue to the next week
            }
        });

        btnQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //button display
        JPanel bp = new JPanel(new GridLayout(2,0,5,60));
        bp.add(btnCont);
        bp.add(btnQuit);

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.EAST);

        pack();
        setResizable(false);
        setSize(1000,810);
        setLocationRelativeTo(null);





    }

}
