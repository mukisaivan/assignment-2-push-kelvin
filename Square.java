import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Square extends Shape{

    int side;
    int centreX;
    int centreY;

    // Square(int side,int centreX, int centreY) {
    //     this.side = side;
    //     this.centreX = centreX;
    //     this.centreY = centreY;
    // }

    public void perimeter() {
        this.side = Integer.parseInt(JOptionPane.showInputDialog("Enter side: "));
        double result = 4 * this.side;
        JOptionPane.showMessageDialog(null, "The area of the square is " + result + " SQUARE UNITS");
        System.out.println("Perimeter: " + result + "\n");

    }

    public void area() {
        this.side = Integer.parseInt(JOptionPane.showInputDialog("Enter side: "));
        double result = this.side * this.side;
        JOptionPane.showMessageDialog(null, "The area of the sqaure is " + result + " SQUARE UNITS");
        System.out.println("Area: " + result + "\n");
    }
    
    public void drawShape() {

        this.side = Integer.parseInt(JOptionPane.showInputDialog("Enter side: "));
        this.centreX = Integer.parseInt(JOptionPane.showInputDialog("Enter centre X cordinate: "));
        this.centreY = Integer.parseInt(JOptionPane.showInputDialog("Enter centre Y cordinate: "));

        JPanel panel = new JPanel();
        panel.setBounds(this.centreX, this.centreY, this.side, this.side);
        panel.setBackground(Color.GREEN);

        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.add(panel);

    }
}
