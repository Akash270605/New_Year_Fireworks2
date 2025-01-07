/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_year_fireworks2;

import java.awt.*;

class Message
{

 Message(String s, Font font1)
 {
     font = font1;
     mes = s;
     FontMetrics fontmetrics = Toolkit.getDefaultToolkit().getFontMetrics(font1);
     width = fontmetrics.stringWidth(s);
     ascent = fontmetrics.getAscent();
     descent = fontmetrics.getDescent();
     height = fontmetrics.getHeight();
 }

 void drawString(Graphics g, int i, int j)
 {
     g.setFont(font);
     g.drawString(mes, i, j + ascent);
 }

 Dimension getSize()
 {
     return new Dimension(width, height);
 }

 String mes;
 Font font;
 int ascent;
 int descent;
 int width;
 int height;
}