package cg.designPatterns.factoryMethod;

import cg.designPatterns.factoryMethod.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageType) {

        if (imageType != null) {
            switch (imageType.name()) {
                case "BMP":
                    return new BmpReader();
                case "JPG":
                    return new JpgReader();
                case "PNG":
                    return new PngReader();
                default:
                    throw new IllegalArgumentException("Unknown image type");
            }
        } else
            throw new IllegalArgumentException("Null passed as imageType getImageReader argument");
    }

    // passing code returned image reader if null passed.
}
