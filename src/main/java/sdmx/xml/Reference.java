package sdmx.xml;

public interface Reference {
    String getPackage();
    String getURNClass();
    
    String getAgencyID();

    String getParentID();

    String getVersion();

    String getID();
}
