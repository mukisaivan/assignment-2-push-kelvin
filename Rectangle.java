import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Rectangle extends Shape{
    
    int length;
    int width;
    int centreX;
    int centreY;


    // Rectangle(int length, int width, int centreX, int centreY) {
    //     this.length = null;
    //     this.width;
    //     this.centreX;
    //     this.centreY
        
    // }
    


    public void perimeter() {
        this.length = Integer.parseInt(JOptionPane.showInputDialog("Enter your length: "));
        this.width = Integer.parseInt(JOptionPane.showInputDialog("Enter your width: "));
        
        double result = 2 * this.length + 2 * this.width;
        JOptionPane.showMessageDialog(null, "The perimeter of the rectangle is " + result + " UNITS");
        System.out.println("Area: " + result + "\n");
        
    }

    public void area() {
        this.length = Integer.parseInt(JOptionPane.showInputDialog("Enter your length: "));
        this.width = Integer.parseInt(JOptionPane.showInputDialog("Enter your width: "));

        double result = this.length * this.width;
        JOptionPane.showMessageDialog(null, "The area of the rectangle is " + result + " SQUARE UNITS");
        System.out.println("Area: " + result + "\n");
    }

    // public void position() {

    //     this.centreX = Integer.parseInt(JOptionPane.showInputDialog("Enter centre X cordinate: "));
    //     this.centreY = Integer.parseInt(JOptionPane.showInputDialog("Enter centre Y cordinate: "));

    //     JOptionPane.showMessageDialog(null, "The position of the square is " + "(" + centreX + "," + centreY + ")");
    //     System.out.println("Position (" + centreX + "," + centreY + ")");
    // }


    public void drawShape() {

        this.length = Integer.parseInt(JOptionPane.showInputDialog("Enter your length: "));
        this.width = Integer.parseInt(JOptionPane.showInputDialog("Enter your width: "));
        this.centreX = Integer.parseInt(JOptionPane.showInputDialog("Enter centre X cordinate: "));
        this.centreY = Integer.parseInt(JOptionPane.showInputDialog("Enter centre Y cordinate: "));

        JPanel panel = new JPanel();
        panel.setBounds(this.centreX, this.centreY, this.width, this.length);
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
