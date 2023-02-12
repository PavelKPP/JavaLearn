package Task3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DocumentWorker documentWorker = new DocumentWorker();
        ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
        ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();


        System.out.println("Please, Put your key here:");

        String inputKey;
        inputKey = sc.nextLine();

        switch (inputKey){
            case "qwerty":
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
                break;
            case "qwerty1":
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();
                break;
            default:
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
        }


    }
}
