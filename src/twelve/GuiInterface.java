package twelve;

import fifth_task.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiInterface extends JFrame implements ActionListener {
    private int ArgentinaScore = 0;
    private int JamaicaScore = 0;

    private JLabel scoreLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public GuiInterface() {
        setTitle("Match Results");
        setLayout(new FlowLayout());

        JButton Argentina = new JButton("Аргентина");
        JButton Jamaica = new JButton("Ямайка");

        Argentina.addActionListener(this);
        Jamaica.addActionListener(this);

        scoreLabel = new JLabel("Result: " + ArgentinaScore + " X " + JamaicaScore);
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        add(Argentina);
        add(Jamaica);
        add(scoreLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Аргентина")) {
            ArgentinaScore++;
            lastScorerLabel.setText("Last Scorer: Аргентина");
        } else if (command.equals("Ямайка")) {
            JamaicaScore++;
            lastScorerLabel.setText("Last Scorer: Ямайка");
        }

        scoreLabel.setText("Result: " + ArgentinaScore + " X " + JamaicaScore);
        if ((ArgentinaScore == 5)&&(JamaicaScore == 0)){
            //todo вставить анимацию
            fifth_task.MainFrame mf = new MainFrame();
            mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mf.setVisible(true);
        }
        else if (ArgentinaScore > JamaicaScore) {
            winnerLabel.setText("Winner: Аргентина");
        } else if (ArgentinaScore < JamaicaScore) {
            winnerLabel.setText("Winner: Ямайка");
        }

        else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new GuiInterface();
    }
}
