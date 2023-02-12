package Task1;

import Task1.AbstractHandler;

public class DOCHandler extends AbstractHandler {

    @Override
        void open(){
        System.out.println("Opening DOC file...");
    }

    @Override
        void create(){
        System.out.println("Creating TXT file...");
    }

    @Override
        void change(){
        System.out.println("Changing TXT file...");
    }

    @Override
        void save(){
        System.out.println("Saving TXT file...");
    }
}
