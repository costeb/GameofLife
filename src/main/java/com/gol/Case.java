package com.gol;

public class Case {
    private boolean active;
    

    public Case(boolean active) {
        this.active = active;
    }


    public Case() {
        this.active = false;
    }


    public boolean isActive() {
        return this.active;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void print(){
        if(this.isActive())
            System.out.print("□");
        else
            System.out.print("■");
    }

}
