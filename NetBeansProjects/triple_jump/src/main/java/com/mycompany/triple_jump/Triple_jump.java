/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triple_jump;

import com.mycompany.triple_jump.Object.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artem
 */
public class Triple_jump extends Frame {
    public Triple_jump() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        for (Objectex obj : Player.textures) {
            g.drawRect(obj.getX(), obj.getY(), obj.getWid(), obj.getHei());
        }
    }

    public static void main(String[] args) {
        Player MyPlayer = new Player(75,130,20,20);
        Objectex wall = new Objectex(50, 150, 100, 350);
        Objectex anotherwall = new Objectex(150,350,150,200);
        Player.textures.add(wall);
        Player.textures.add(anotherwall);
        Player.textures.add(MyPlayer);
        Player.textures.add(new Objectex(350,350,350,200));
        Player.textures.add(new Objectex(500, 250, 25, 100));
        Player.textures.add(new Objectex(0,0,50,500));
        Triple_jump appwin = new Triple_jump();
        appwin.setSize(new Dimension(1000,500));
        appwin.setVisible(true);
        appwin.setTitle("xdd");
        //for(int i =0;i < 30; i++) {
           // MyPlayer.moveRight();
            //MyPlayer.grav();
        //}
//        while(true) {
//            appwin.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//            }
//            )
        for (int i = 0; i < 70; i++) {
            MyPlayer.moveRight();
            MyPlayer.grav();
        }
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Triple_jump.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < 70; i++) {
            MyPlayer.moveRight();
            MyPlayer.grav();
        }        
        
        appwin.repaint();
        //appwin.repaint();
//        MyPlayer.jump();
//        for (int i = 0; i < 12;i++) {
//            MyPlayer.moveRight();
//            MyPlayer.grav();
//            System.out.println(MyPlayer.getY().toString()+MyPlayer.getX().toString());
//        }
//        System.out.println("nalevo");
//        for (int i = 0; i < 20;i++) {
//            MyPlayer.moveLeft();
//            MyPlayer.grav();
//            System.out.println(MyPlayer.getY().toString()+MyPlayer.getX().toString());
//        }
//        MyPlayer.jump();
//        for (int i = 0; i < 7;i++) {
//            MyPlayer.moveLeft();
//            MyPlayer.grav();
//            System.out.println(MyPlayer.getY().toString()+MyPlayer.getX().toString());
//        }
//        MyPlayer.jump();
//        System.out.println("second jump");
//        for (int i = 0; i < 10; i++) {
//            MyPlayer.moveLeft();
//            MyPlayer.grav();
//            System.out.println(MyPlayer.getY().toString()+MyPlayer.getX().toString());
//        }
    }
}
