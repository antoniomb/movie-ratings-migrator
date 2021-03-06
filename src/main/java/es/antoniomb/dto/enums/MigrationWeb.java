package es.antoniomb.dto.enums;

/**
 * Created by amiranda on 20/9/16.
 */
public enum MigrationWeb {
    CSV("csv"),
    FILMAFFINITY("filmaffinity"),
    IMDB("imdb"),
    LETSCINE("letscine"),
    ANALYSIS("analysis");
    String webCode;
    MigrationWeb(String webCode) {
        this.webCode = webCode;
    }
    public String getWebCode() {
        return webCode;
    }
    public static MigrationWeb parse(String webCode){
        for (MigrationWeb migrationWebCode : values()) {
            if (migrationWebCode.getWebCode().equals(webCode)) {
                return migrationWebCode;
            }
        }
        return null;
    }
}
