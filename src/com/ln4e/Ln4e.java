package com.ln4e;

public class Ln4e {
    private int doors;//samo tozi klas accesva tezi promenlivi
    private int wheels;
    private String model;
    private String colour;

public void setModel(String model){
    String validModel=model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("commodore")) {
            this.model = model;
        }else {
            this.model="Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
