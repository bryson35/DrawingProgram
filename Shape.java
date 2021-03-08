/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;

/**
 *
 * @author brysonwhite
 */
public abstract class Shape {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Color lineColor;

    /**
     *
     * @return
     */
    public int getStartX() {
        return startX;
    }

    /**
     *
     * @return
     */
    public int getStartY() {
        return startY;
    }

    /**
     *
     * @return
     */
    public int getEndX() {
        return endX;
    }

    /**
     *
     * @return
     */
    public int getEndY() {
        return endY;
    }

    /**
     *
     * @return
     */
    public Color getLineColor() {
        return lineColor;
    }

    /**
     *
     * @param startX
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     *
     * @param startY
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     *
     * @param endX
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     *
     * @param endY
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     *
     * @param lineColor
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    
   
}
