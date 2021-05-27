/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

/**
 *
 * @author pc
 */
 class commercial_client extends client{
     private double commericalID;
     //constructor
     /**
      * 
      * @param n
      * @param a
      * @param id00000000000000
      * @param ph
      * @param ac
      * @param commID
      */
    public commercial_client(String n, String a, double id00000000000000, int ph, account ac,double commID){
        super(n, a, 00000000000000, ph, ac);
        this.commericalID=commID;
    }
    //setters and getters
    /**
     * 
     * @param commID
     */
    public void setcommercialID(double commID){
        this.commericalID=commID;
    }
    /**
     * 
     * @return
     */
    public double getcommericalID(){
        return commericalID;
    }
     @Override
       public String toString(){
        return String.format("client name is"+getname()+"\n"+"address="+getaddress()+"\n"+"commerical ID="+getcommericalID()+"\n"+"phone="+getphone()+"\n"+"account ="+getacc());     
   
    
    
}
 }