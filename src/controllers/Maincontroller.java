package controllers;

import models.Filehandler;
import views.Mainconsole;

public class Maincontroller {
    public Maincontroller(){
        new Filehandler().readFile();
    }
}
