package com.dslplatform.json.generated.types.Image;



import com.dslplatform.json.generated.types.StaticJson;
import com.dslplatform.json.generated.ocd.javaasserts.ImageAsserts;

import java.io.IOException;

public class OneListOfNullableImagesDefaultValueTurtle {
	private static StaticJson.JsonSerialization jsonSerialization;

	@org.junit.BeforeClass
	public static void initializeJsonSerialization() throws IOException {
		jsonSerialization = StaticJson.getSerialization();
	}

	@org.junit.Test
	public void testDefaultValueEquality() throws IOException {
		final java.util.List<java.awt.image.BufferedImage> defaultValue = new java.util.ArrayList<java.awt.image.BufferedImage>(0);
		final StaticJson.Bytes defaultValueJsonSerialized = jsonSerialization.serialize(defaultValue);
		final java.util.List<java.awt.image.BufferedImage> defaultValueJsonDeserialized = jsonSerialization.deserializeList(java.awt.image.BufferedImage.class, defaultValueJsonSerialized.content, defaultValueJsonSerialized.length);
		ImageAsserts.assertOneListOfNullableEquals(defaultValue, defaultValueJsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue1Equality() throws IOException {
		final java.util.List<java.awt.image.BufferedImage> borderValue1 = new java.util.ArrayList<java.awt.image.BufferedImage>(java.util.Arrays.asList((java.awt.image.BufferedImage) null));
		final StaticJson.Bytes borderValue1JsonSerialized = jsonSerialization.serialize(borderValue1);
		final java.util.List<java.awt.image.BufferedImage> borderValue1JsonDeserialized = jsonSerialization.deserializeList(java.awt.image.BufferedImage.class, borderValue1JsonSerialized.content, borderValue1JsonSerialized.length);
		ImageAsserts.assertOneListOfNullableEquals(borderValue1, borderValue1JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue2Equality() throws IOException {
		final java.util.List<java.awt.image.BufferedImage> borderValue2 = new java.util.ArrayList<java.awt.image.BufferedImage>(java.util.Arrays.asList(new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR)));
		final StaticJson.Bytes borderValue2JsonSerialized = jsonSerialization.serialize(borderValue2);
		final java.util.List<java.awt.image.BufferedImage> borderValue2JsonDeserialized = jsonSerialization.deserializeList(java.awt.image.BufferedImage.class, borderValue2JsonSerialized.content, borderValue2JsonSerialized.length);
		ImageAsserts.assertOneListOfNullableEquals(borderValue2, borderValue2JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue3Equality() throws IOException {
		final java.util.List<java.awt.image.BufferedImage> borderValue3 = new java.util.ArrayList<java.awt.image.BufferedImage>(java.util.Arrays.asList(new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)));
		final StaticJson.Bytes borderValue3JsonSerialized = jsonSerialization.serialize(borderValue3);
		final java.util.List<java.awt.image.BufferedImage> borderValue3JsonDeserialized = jsonSerialization.deserializeList(java.awt.image.BufferedImage.class, borderValue3JsonSerialized.content, borderValue3JsonSerialized.length);
		ImageAsserts.assertOneListOfNullableEquals(borderValue3, borderValue3JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue4Equality() throws IOException {
		final java.util.List<java.awt.image.BufferedImage> borderValue4 = new java.util.ArrayList<java.awt.image.BufferedImage>(java.util.Arrays.asList(new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR), new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR), new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY), new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY), new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED), new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)));
		final StaticJson.Bytes borderValue4JsonSerialized = jsonSerialization.serialize(borderValue4);
		final java.util.List<java.awt.image.BufferedImage> borderValue4JsonDeserialized = jsonSerialization.deserializeList(java.awt.image.BufferedImage.class, borderValue4JsonSerialized.content, borderValue4JsonSerialized.length);
		ImageAsserts.assertOneListOfNullableEquals(borderValue4, borderValue4JsonDeserialized);
	}

	@org.junit.Test
	public void testBorderValue5Equality() throws IOException {
		final java.util.List<java.awt.image.BufferedImage> borderValue5 = new java.util.ArrayList<java.awt.image.BufferedImage>(java.util.Arrays.asList((java.awt.image.BufferedImage) null, new java.awt.image.BufferedImage(1, 1, java.awt.image.BufferedImage.TYPE_4BYTE_ABGR), new java.awt.image.BufferedImage(2, 2, java.awt.image.BufferedImage.TYPE_3BYTE_BGR), new java.awt.image.BufferedImage(3, 3, java.awt.image.BufferedImage.TYPE_BYTE_BINARY), new java.awt.image.BufferedImage(4, 4, java.awt.image.BufferedImage.TYPE_BYTE_GRAY), new java.awt.image.BufferedImage(5, 5, java.awt.image.BufferedImage.TYPE_BYTE_INDEXED), new java.awt.image.BufferedImage(6, 6, java.awt.image.BufferedImage.TYPE_INT_RGB)));
		final StaticJson.Bytes borderValue5JsonSerialized = jsonSerialization.serialize(borderValue5);
		final java.util.List<java.awt.image.BufferedImage> borderValue5JsonDeserialized = jsonSerialization.deserializeList(java.awt.image.BufferedImage.class, borderValue5JsonSerialized.content, borderValue5JsonSerialized.length);
		ImageAsserts.assertOneListOfNullableEquals(borderValue5, borderValue5JsonDeserialized);
	}
}
