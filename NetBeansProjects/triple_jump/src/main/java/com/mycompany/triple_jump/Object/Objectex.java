/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triple_jump.Object;

import java.awt.Graphics;

/**
 *
 * @author artem
 */
public class Objectex implements Locationable {
    private Integer x;
    private Integer y;
    private Integer wid;
    private Integer hei;
    public Objectex(int x,int y, int w, int h) {
        this.hei=h;
        this.wid=w;
        this.x=x;
        this.y=y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getHei() {
        return hei;
    }

    public void setHei(Integer hei) {
        this.hei = hei;
    }
    public void paint(Graphics g) {
        g.drawRect(x, y, wid, hei);
    }
}
