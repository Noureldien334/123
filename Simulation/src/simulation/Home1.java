/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

/**
 *
 * @author nour eldein
 */
public class Home1 {
    
   

    private int order_quantity;
    private int reorder_point;
    private int Demand;
    private int lead_time;

    public Home1(int order_quantity, int reorder_point, int Demand, int lead_time) {
        this.order_quantity = order_quantity;
        this.reorder_point = reorder_point;
        this.Demand = Demand;
        this.lead_time = lead_time;
    }

    public Home1() {
    }

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public int getReorder_point() {
        return reorder_point;
    }

    public void setReorder_point(int reorder_point) {
        this.reorder_point = reorder_point;
    }

    public int getDemand() {
        return Demand;
    }

    public void setDemand(int Demand) {
        this.Demand = Demand;
    }

    public int getLead_time() {
        return lead_time;
    }

    public void setLead_time(int lead_time) {
        this.lead_time = lead_time;
    }
    
   

   


}
