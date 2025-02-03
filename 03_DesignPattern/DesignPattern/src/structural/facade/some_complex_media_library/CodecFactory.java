package structural.facade.some_complex_media_library;

public class CodecFactory {
    public static Codec extract(VideoFile videoFile) {
        String type = videoFile.getCodeType();

        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting MPEG4...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting Ogg...");
            return new OggCompressionCodec();
        }
    }
}
