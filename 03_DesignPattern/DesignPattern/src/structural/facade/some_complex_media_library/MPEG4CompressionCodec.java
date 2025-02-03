package structural.facade.some_complex_media_library;

public class MPEG4CompressionCodec implements Codec {
    public String type = "mp4";

    public MPEG4CompressionCodec() {
        System.out.println("MPEG4CompressionCodec: Instantiating...");
    }
}
