package UI;

import javax.swing.*;
public class Box extends JPanel{

    private int color;

    public int getColor() {
        return color;
    }

    public Box(int x, int y){
        color = 0;
        setBounds(x *Cunfig.SIZE, y *Cunfig.SIZE,  Cunfig.SIZE,  Cunfig.SIZE);
        setBackground(Cunfig.COLORS[0]);
    }

public void setColor(int color) {
        this.color= color;
        if (color>=0 && color<Cunfig.COLORS.length)
            setBackground(Cunfig.COLORS[color]);


}
}
