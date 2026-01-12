package snakegame;
import javax.swing.*;
public class snake extends JFrame {
    snake(){
        super("snake_game");
        add( new board());
        pack();

        setLocation(600,200);
        //setSize(400,400);
        setResizable(false);




    }
    public static void main(String[] args) {
        new snake().setVisible(true);

    }
}
