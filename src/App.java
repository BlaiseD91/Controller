/*
* File: App.java
* Author: Székely Balázs Csaba
* Copyright: 2023, Székely Balázs Csaba
* Group: SZOFT II/1/E
* Date: 2023-11-23
* Github: https://github.com/BlaiseD91
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Controller controller = new Controller();

        controller.start();
        controller.stop();
        controller.restart();
    }
}
