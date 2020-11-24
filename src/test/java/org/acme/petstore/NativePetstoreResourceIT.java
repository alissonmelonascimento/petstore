package org.acme.petstore;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativePetstoreResourceIT extends PetstoreResourceTest {

    // Execute the same tests but in native mode.
}