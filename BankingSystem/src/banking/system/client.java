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
public class client {

    
    private String name,address;
    private double nationalID;
    private int phone;

    /**
     *
     */
    public account acc;
    //constructor
    /**
     * 
     * @param n
     * @param a
     * @param id
     * @param ph
     * @param ac
     */
    client(String n,String a,double id,int ph,account ac){
        this.name=n;
        this.address=a;
        this.acc=ac;
        this.nationalID=id;
        this.phone=ph;
    }
    /**
     *
     * @param n
     */
    //setters and getters
    public void setname(String n){
        this.name=n;   
    }    

    /**
     *
     * @return
     */
    public String getname(){
        return name;
    }

    /**
     *
     * @param a
     */
    public void setaddress(String a){
        this.address=a;
    }

    /**
     *
     * @return
     */
    public String getaddress(){
            return address;
    }

    /**
     *
     * @param ac
     */
    public void setacc(account ac){
        this.acc=ac;
    }

    /**
     *
     * @return
     */
    public account getacc(){
        return acc;
    }

    /**
     *
     * @param id
     */
    public void setnationalID(double id){
        this.nationalID=id;
    }

    /**
     *
     * @return
     */
    public double getnationalID(){
        return nationalID;
    }

    /**
     *
     * @param ph
     */
    public void setphone(int ph){
        this.phone=ph;
    }

    /**
     *
     * @return
     */
    public int getphone(){
        return phone;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return String.format("client name is"+name+"\n"+"address="+address+"\n"+"national ID="+nationalID+"\n"+"phone="+phone+"account ="+acc);
    }
    
    
    
            
            
            
            

    
    
    
    
    
    
    
    
}
