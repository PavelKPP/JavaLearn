package Task3;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    void editDocument(){
        System.out.println("Document is edited well");
    }

    @Override
    void saveDocument(){
        System.out.println("Document is saved in the old format, saving in different format's is available only in Expert version");
    }


}
