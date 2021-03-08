/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author brysonwhite
 */
public class Circle extends Shape {
    private Color fillColor;
    private int width;
    private int height;
    private int topLeftX;
    private int topLeftY;
    
    /**
     *
     * @param startX
     * @param startY
     * @param endX
     * @param endY
     * @param color
     * @param fillColor
     */
    public Circle(int startX, int startY, int endX, int endY, Color color, Color fillColor){
        super.setStartX(startX);
        super.setStartY(startY);
        super.setEndX(endX);
        super.setEndY(endY);
        super.setLineColor(color);
        this.fillColor = fillColor;
        
        topLeftX = Math.min(startX, endX);
        topLeftY = Math.min(startY, endY);
        width = Math.abs(startX - endX);
        height = Math.abs(startY - endY);
    }

    /**
     *
     * @return
     */
    public Color getFillColor() {
        return fillColor;  
    }

    /**
     *
     * @param fillColor
     */
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    
    /**
     *
     * @param g2d
     */
    public void draw(Graphics2D g2d){
        // draw solid circle first
        g2d.setColor(fillColor);
        g2d.fillOval(topLeftX, topLeftY, width, height);
        
        g2d.setColor(super.getLineColor());
        g2d.drawOval(topLeftX, topLeftY, width, height);
        
    }
    
    /**
     *
     * @param g2d
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param lc
     * @param fc
     */
    public static void draw(Graphics2D g2d, int x1, int y1, int x2, int y2, Color lc, Color fc) {
        // draw solid rectangle first
        g2d.setColor(fc);
        g2d.fillOval(
                Math.min(x1,x2), 
                Math.min(y1, y2), 
                Math.abs(x1 - x2), 
                Math.abs(y1 - y2));
        // draw outline on top
        g2d.setColor(lc);
        g2d.drawOval(
                Math.min(x1,x2), 
                Math.min(y1, y2), 
                Math.abs(x1 - x2), 
                Math.abs(y1 - y2));
        
    }
    
    
    
    
    
}
