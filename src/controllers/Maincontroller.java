package controllers;

import models.Filehandler;

public class Maincontroller {
    public Maincontroller(){
        new Filehandler().readFile();
    }
}
