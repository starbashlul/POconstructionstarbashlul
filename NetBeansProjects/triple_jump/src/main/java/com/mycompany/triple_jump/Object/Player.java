package com.mycompany.triple_jump.Object;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artem
 */
public class Player extends Objectex {
    private Integer speed;
    private Integer vertSpeed;
    private Integer jumpCount;
    public static List<Objectex> textures = new ArrayList<>();
    public static List<Actionable> actionables = new ArrayList<>();
    private Boolean falling;
    private Boolean notMoveableRight;
    private Boolean notMoveableLeft;
    private Integer jumpTimer;
    private Integer jumpPower;
    public static Graphics g;
    
    public Player(int x, int y, int w, int h) {
        super(x, y, w, h);
        falling = false;
        speed = 1;
        vertSpeed=0;
        jumpCount=0;
        jumpTimer=0;
        jumpPower=6;
    }
    public void moveLeft() {
        notMoveableLeft=false;
        for(Objectex obj : textures)
            if(vertContactLeft((Locationable) obj))
                notMoveableLeft=true;
        for(Actionable obj : actionables)
            if(vertContactLeft((Locationable) obj))
                obj.action(this);
        if(!notMoveableLeft)
            setX(getX()-speed);
    }
    
    public void moveRight() {
        notMoveableRight=false;
        for(Objectex obj : textures)
            if(vertContactRight((Locationable) obj)) {
                notMoveableRight=true;
            }
        if(!notMoveableRight)
            setX(getX()+speed);
    }
    
    public void jump() {
        if(jumpCount<4) {
            System.out.println("com.mycompany.triple_jump.Object.Player.jump()");
            jumpCount++;
            jumpTimer=jumpPower;
        }
        
    }
    
    public void fly() {
        for(Objectex obj : textures)
            if(horizontalContactUp((Locationable) obj))
                jumpTimer=0;
        if(jumpTimer<=0) {
            vertSpeed=2;
        }
        else {
            vertSpeed=-5;
            jumpTimer--;
        }
        setY(getY()+vertSpeed);
    }
    
    public boolean horizontalContactDown(Locationable obj) {
        if((getX()+getWid()>=obj.getX()+1)  &&  (getX()<=obj.getX()+obj.getWid()-1)  &&  (getY()+getHei()==obj.getY())) {
            jumpCount=0;
            return true;
        }
        return false;
    }
    
    public boolean horizontalContactUp(Locationable obj) {
        if((getX()+getWid()>=obj.getX()+1)  &&  (getX()<=obj.getX()+obj.getWid()-1)  &&  (getY()==obj.getY()+obj.getHei()))
            return true;
        return false;
    }
    
    public boolean vertContactRight(Locationable obj)  {
        if((getX()+getWid()==obj.getX())  &&  (getY()<obj.getY()+obj.getHei())   &&  (getY()+getHei()>obj.getY()))
            return true;
        return false;
    }
    
    public boolean vertContactLeft(Locationable obj) {
        if((getX()==obj.getX()+obj.getWid())  &&  (getY()<obj.getY()+obj.getHei())  &&  (getY()+getHei()>obj.getY()))
            return true;
        return false;
    }
       
    public void grav() {
        falling = true;
        for(Objectex obj : textures)  {
            if(horizontalContactDown(obj)&&jumpTimer<=0) {
                falling = false;
            }
        }
        if(falling==true) {
            fly();
        }
        
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getJumpPower() {
        return jumpPower;
    }

    public void setJumpPower(Integer jumpPower) {
        this.jumpPower = jumpPower;
    }
    
}
