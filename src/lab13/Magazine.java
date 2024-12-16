package lab13;

public class Magazine {
     private String version;
     private String title;
     Magazine(String version, String title){
         this.version=version;
         this.title=title;
     }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

}
