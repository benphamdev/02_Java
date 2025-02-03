package structural.facade.some_complex_media_library;

public class OggCompressionCodec implements Codec {
    private final String type = "ogg";

    public OggCompressionCodec() {
        System.out.println("OggCompressionCodec: Instantiating...");
    }
}
