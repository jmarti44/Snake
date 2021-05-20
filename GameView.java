import javax.swing.JFrame;

public class GameView extends JFrame
{
    
    GameView()
    {
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);

    }

}
