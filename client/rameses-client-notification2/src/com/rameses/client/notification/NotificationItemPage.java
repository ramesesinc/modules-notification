/*
 * NotificationItemPage.java
 *
 * Created on February 7, 2014, 5:47 PM
 */

package com.rameses.client.notification;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 *
 * @author  wflores
 */
@Template(FormPage.class)
public class NotificationItemPage extends javax.swing.JPanel 
{
    
    public NotificationItemPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xScrollPane1 = new com.rameses.rcp.control.XScrollPane();
        xLabel1 = new com.rameses.rcp.control.XLabel();

        xLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel1.setBackground(new java.awt.Color(255, 255, 255));
        xLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 0));
        xLabel1.setExpression("#{htmlview}");
        xLabel1.setOpaque(true);
        xLabel1.setUseHtml(true);
        xScrollPane1.setViewportView(xLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XScrollPane xScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
