package structural.facade.some_complex_media_library;

public class VideoFile {
    private final String name;
    private final String codeType;

    public VideoFile(String name) {
        this.name = name;
        this.codeType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodeType() {
        return codeType;
    }

    public String getName() {
        return name;
    }
}
