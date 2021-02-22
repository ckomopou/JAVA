package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSeriflarge= new Font(" San Serif" , Font.BOLD,18);
        Font sansSerifSmall= new Font(" San Serif" , Font.BOLD,12);
        g.setFont(sansSeriflarge);
        g.drawString(" The complete Java Developer class", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim" , 60 , 100);

    }
}
