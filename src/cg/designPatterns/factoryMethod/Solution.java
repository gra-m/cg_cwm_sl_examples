package cg.designPatterns.factoryMethod;

//region
/*
Factory method pattern

1. Take a careful look at the classes you have.
2. In separate files in the common package, create JpgReader, PngReader, and BmpReader classes that implement the ImageReader interface.
3. In a separate file in the main package, create the ImageReaderFactory class with one method.
3.1. Think about what it should be called.
3.2. Think about which modifiers this method should have.
4. This method should:
4.1. For each value in ImageTypes, return the appropriate Reader. For example, for
ImageTypes.JPG, return a JpgReader;
4.2. If an invalid argument is passed, then throw an exception:
IllegalArgumentException("Unknown image type").


Requirements:
1. Create a JpgReader class in the common package. It must implement the ImageReader interface.
2. Create a PngReader class in the common package. It must implement the ImageReader interface.
3. Create a BmpReader class in the common package. It must implement the ImageReader interface.
4. Create a public class named ImageReaderFactory.
5. Add a public static method getImageReader with an ImageTypes parameter to the ImageReaderFactory class.
6. The getImageReader method must create and return a suitable Reader.
7. The getImageReader method must throw an IllegalArgumentException if an invalid argument is passed.

/////////////////////////////
import com.codegym.task.task16.task1631.common.ImageReader;
import com.codegym.task.task16.task1631.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
/////In 'common package'////////////
package com.codegym.task.task16.task1631.common;

public interface ImageReader {
}

/////////////

package com.codegym.task.task16.task1631.common;

public enum ImageTypes {
    BMP,
    JPG,
    PNG
}
 */
//endregion

import cg.designPatterns.factoryMethod.common.ImageReader;
import cg.designPatterns.factoryMethod.common.ImageTypes;

public class Solution {

    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);

    }
}
