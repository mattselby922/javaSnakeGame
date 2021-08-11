import javax.swing.*;

public class GameOverFrame extends JFrame{
    GameOverFrame(){
        this.setTitle("Game Over");
        this.add(new GameOverPanel());
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

