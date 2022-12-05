/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triple_jump.Object;

/**
 *
 * @author artem
 */
public class Buff extends Objectex implements Actionable {
    @Override
    public void action(Player player) {
        player.setJumpPower(player.getJumpPower()*2);
        setX(-100);
        setY(-100);
    }
}
