package practice4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MadridMilan extends JFrame {
    private JButton MilanButton = new JButton("AC Milan");
    private JButton RealMadridButton = new JButton("Real Madrid");
    private JPanel panel = new JPanel();
    private JLabel result = new JLabel();
    private JLabel lastScored = new JLabel();
    private Label winner = new Label();
    private int milan = 0;
    private int real = 0;

    public MadridMilan(){
        setContentPane(panel);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(MilanButton);
        add(RealMadridButton);
        add(result);
        add(winner);
        add(lastScored);
        setVisible(true);
        MilanButton.addActionListener(e-> {
            milan++;
            lastScored.setText("Last Scorer: AC Milan");
            result.setText("Result: " + milan + " X " + real);
            String win = "DRAW";
            if(milan > real)
                win = "AC Milan";
            else if (milan < real)
                win = "Real Madrid";
            winner.setText("Winner: " + win);
        });
        RealMadridButton.addActionListener(e-> {
            real++;
            lastScored.setText("Last Scorer: Real Madrid");
            result.setText("Result: " + milan + " X " + real);
            String win = "DRAW";
            if(milan > real)
                win = "AC Milan";
            else if (milan < real)
                win = "Real Madrid";
            winner.setText("Winner: " + win);
        });
    }

    public static void main(String[] args) {
        MadridMilan m = new MadridMilan();
    }
}
