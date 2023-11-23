/*
* File: Controller.java
* Author: Székely Balázs Csaba
* Copyright: 2023, Székely Balázs Csaba
* Group: SZOFT II/1/E
* Date: 2023-11-23
* Github: https://github.com/BlaiseD91
* Licenc: GNU GPL
*/

public class Controller implements Controllable {

    @Override
    public void restart() {
        System.out.println("A RESTART funkció elindult!");
        
    }

    @Override
    public void start() {
        System.out.println("A START funkció elindult!");
        
    }

    @Override
    public void stop() {
        System.out.println("A STOP funció elindult!");
        
    }
    
    
}
