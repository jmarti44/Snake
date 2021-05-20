import javax.swing.JFrame;

public class GameView extends JFrame
{
    
    GameView()
    {
        //System.out.println("hello?");
        this.add(new GamePanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);

    }

}
