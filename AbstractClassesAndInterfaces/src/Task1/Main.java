package Task1;

import Task1.DOCHandler;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

      XMLHandler xmlHandler = new XMLHandler();
      TXTHandler txtHandler = new TXTHandler();
      DOCHandler docHandler = new DOCHandler();


      Scanner sc = new Scanner(System.in);

      System.out.println("Put the format of your file: ");

      String firstInput;
      firstInput = sc.nextLine();

      System.out.println("Choose your option: Open, Create, Change, Save");

      String secondInput;
      secondInput = sc.nextLine();


      switch (firstInput){
          case "XML":
              switch (secondInput){
                  case "Open":
                      xmlHandler.open();
                      break;
                  case "Create":
                      xmlHandler.create();
                      break;
                  case  "Change":
                      xmlHandler.change();
                      break;
                  case "Save":
                      xmlHandler.save();
                      break;
              }
              break;
          case "TXT":
              switch (secondInput){
                  case "Open":
                      txtHandler.open();
                      break;
                  case "Create":
                      txtHandler.create();
                      break;
                  case  "Change":
                      txtHandler.change();
                      break;
                  case "Save":
                      txtHandler.save();
                      break;
              }
              break;
          case "DOC":
              switch (secondInput){
                  case "Open":
                      docHandler.open();
                      break;
                  case "Create":
                      docHandler.create();
                      break;
                  case  "Change":
                      docHandler.change();
                      break;
                  case "Save":
                      docHandler.save();
                      break;
              }
           break;
      }


    }
}