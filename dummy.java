package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame extends Frame implements ActionListener
{
    public MyFrame()
    {
        super ("Compliers");
        Button b = new Button (" Change Colour ");

        this.add( b , BorderLayout.SOUTH );
        b.addActionListener(this);

        this.setSize(500,500);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e )
    {

        Random x = new Random();

        float r = x.nextFloat();
        float g = x.nextFloat();
        float b = x.nextFloat();

        Color c = new Color ( r , g , b );

        this.setBackground(c);
}
}

class Main
{
    public static void main ( String [] args)
    {
        new MyFrame();
    }
}
