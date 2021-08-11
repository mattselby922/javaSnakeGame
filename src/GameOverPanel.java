import java.awt.*;
import javax.swing.*;


public class GameOverPanel extends JPanel{

     // Defining Screen Dimensions & Game Units

     static final int SCREEN_WIDTH = 300;
     static final int SCREEN_HEIGHT = 300;
     
     GamePanel gPanel = new GamePanel();
 
 
     // GamePanel Constructor
     GameOverPanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.setLayout(null);

        // Restart Button
        JButton restartButton = new JButton();
        this.add(restartButton, BorderLayout.CENTER);
        
        // setBounds(INT X, INT Y, WIDTH, HEIGHT)
        restartButton.setBounds(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2, 100, 50);
        
        restartButton.setText("Restart");
        restartButton.setVisible(true);
        //restartButton.addActionListener(new myAction());            
     }

     public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    public void draw(Graphics g){
     

        // Game Over Text
        g.setColor(Color.magenta);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        
        // Draws "Game Over" in the CENTER of the screen
        g.drawString("Game Over", (SCREEN_WIDTH - metrics.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 2);

        //g.setColor(Color.red);
        //g.setFont(new Font("Ink Free", Font.BOLD, 75));
       
        // FontMetrics metrics2 = getFontMetrics(g.getFont());
        
        // Draws "Score: [applesEaten]"
        //g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics2.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
    }

     public void restart(){
       
        gPanel.startGame();
    }
    
}
