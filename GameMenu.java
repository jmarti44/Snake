import javax.swing.JPanel;
import java.awt.event.*;

import javax.swing.*;
import java.util.Random;
import java.awt.*;

public class GameMenu extends JPanel implements ActionListener
{

    static final int screenWidth = 600;
    static final int screenHeight = 600;


    public Rectangle playButton = new Rectangle (GamePanel.screenWidth/4 + 110, 150,100,50);
    public Rectangle settingButton = new Rectangle (GamePanel.screenWidth/4 + 110, 250,100,50);
    public Rectangle quitButton = new Rectangle (GamePanel.screenWidth/4 + 110, 350,100,50);

    GameMenu()
    {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setFocusable(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g)
    {
        //Menu heading

    
        Graphics2D g2 = (Graphics2D)g;


        Font title = new Font("arial",Font.BOLD,50);
        g.setFont(title);
        g.setColor(Color.green);
        g.drawString("Snake Game", GamePanel.screenWidth/4,100);


        
        Font button = new Font("arial",Font.BOLD,15);
        g.setFont(button);
        g.setColor(Color.white);
        g.drawString("Play", playButton.x +30,playButton.y +30);
        g.drawString("Settings", settingButton.x +20,settingButton.y +30);
        g.drawString("Quit", quitButton.x +30,quitButton.y +30);
        


        g2.draw(playButton);
        g2.draw(settingButton);
        g2.draw(quitButton);





        //Setting heading
       
        

        //Border selection 
        /**
        ButtonGroup borderGroup = new ButtonGroup();

        borderGroup.add(gameOver);
        borderGroup.add(bounce);
        borderGroup.add(opposite);
        
        this.add(gameOver);
        this.add(bounce);
        this.add(opposite);
        */
    }

    public void actionPerformed(ActionEvent e)
    {
        //System.out.println("am i being called");
       
    }
}
