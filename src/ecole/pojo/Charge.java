package ecole.pojo;

import java.util.*;

public class Charge{

    private int  id_prof;
    private  int  id_cours;


    public Charge() {}
    public Charge(int id_prof ,int  id_cours) 
    {
	this.id_prof = id_prof ;
	this.id_cours = id_cours ;
    }


    public  int  getId_prof() {
        return id_prof;
    }

    private void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }
   //*****************************
 
    public int getId_cours() {
        return id_cours;
    }

    private void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }
 

}

