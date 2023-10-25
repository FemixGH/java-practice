package twelve;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.util.Objects;


public class MainFrame extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    public MainFrame(){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource("pictures//0.jpg"))), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(60, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("pictures//" + (++imgNum) + ".jpg"))));
        if(imgNum == 31) imgNum = 0;
    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}