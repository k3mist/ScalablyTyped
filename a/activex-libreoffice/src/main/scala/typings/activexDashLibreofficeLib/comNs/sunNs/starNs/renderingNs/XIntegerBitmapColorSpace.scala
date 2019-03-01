package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color space for integer bitmap formats
  *
  * This interface encapsulates all information specific to a certain integer bitmap color space, like for example 1555 ARGB. Note that the individual
  * elements of the integer color representation sequence need not correspond to the color space's components - instead, the color components might be
  * packed back-to-back into those bytes, as they appear in the raw bitmap data.
  */
trait XIntegerBitmapColorSpace extends XColorSpace {
  /**
    * Query number of bits used per bitmap pixel.
    *
    * This method yields the total number of bits used for a color value. At the associated {@link XIntegerBitmap} , the {@link XIntegerBitmap.setPixel()}
    * method will expect a sequence of ceil(BitsPerPixel/8) bytes, and the {@link XIntegerReadOnlyBitmap.getPixel()} will return that number of bytes.
    * Similarly, the color conversion expect input data in multiples of ceil(BitsPerPixel/8), and also return converted data in chunks of this.
    */
  val BitsPerPixel: scala.Double
  /**
    * Query the number of bits used for each component.
    *
    * This method returns a sequence of integers, each denoting the number of bits occupied by the respective component. The sum of all component bits must
    * be less or equal than the value returned from {@link getBitsPerPixel()} . If the sum is less, excess bits are always kept in the most significant bits
    * of a pixel. Color components will appear in the byte sequences returned from the {@link XIntegerBitmap} methods in the order defined here, with the
    * first element starting from the least significant bits of the pixel, etc.
    *
    *
    *
    * **Remark**: For the typical 32 bit RGBA color data, the four values would all contain the value eight. For a 16 bit 1555 ARGB format, with mask values
    * 0x8000 for alpha, 0x7C for red, 0x3E for green and 0x1F for blue, the values would be 5, 5, 5, 1, in that order.
    */
  val ComponentBitCounts: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Query whether color data bytes need to be swapped.
    * @returns `TRUE` , This method returns the endianness of the color data. The value is one of the Endianness constants. If color data is represented using m
    */
  val Endianness: scala.Double
  /**
    * Convert integer bitmap color to generic IEEE double device color of another color space.
    *
    * Color values are properly rounded and clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @param targetColorSpace the color space to convert to.
    * @returns the corresponding sequence of device colors in the target color space
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromIntegerColorSpace(
    deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    targetColorSpace: XColorSpace
  ): activexDashInteropLib.SafeArray[ColorComponent]
  /**
    * Convert sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored. Color values are properly rounded and clipped,
    * to be valid in the target color space.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerFromARGB(rgbColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor]): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Convert premultiplied sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored. Color values are properly rounded and clipped,
    * to be valid in the target color space.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerFromPARGB(rgbColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor]): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Convert sRGB color to an integer representation in this color space.
    *
    * If this color space conveys alpha information, it is assumed be fully opaque for the given RGB color value. Color values are properly rounded and
    * clipped, to be valid in the target color space.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerFromRGB(rgbColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[RGBColor]): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Convert color value in this color space to sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed. Color values are properly rounded and
    * clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of sRGB colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerToARGB(deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): activexDashInteropLib.SafeArray[ARGBColor]
  /**
    * Convert color value in this color space to premultiplied sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed. Color values are properly rounded and
    * clipped, to be valid in the target color space. The resulting individual RGB color values are premultiplied by the alpha value (e.g. if alpha is 0.5,
    * each color value has only half of the original intensity).
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of sRGB colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerToPARGB(deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): activexDashInteropLib.SafeArray[ARGBColor]
  /**
    * Convert color value in this color space to sRGB color values.
    *
    * Any information not representable in the {@link RGBColor} struct is discarded during the conversion. This includes alpha information. Color values are
    * properly rounded and clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of sRGB colors.
    * @see XIntegerBitmapColorSpace.convertIntegerToARGB()
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerToRGB(deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): activexDashInteropLib.SafeArray[RGBColor]
  /**
    * Convert integer bitmap color to integer bitmap color of another integer bitmap color space.
    *
    * Color values are properly rounded and clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @param targetColorSpace the color space to convert to.
    * @returns the corresponding sequence of device colors in the target color space
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToIntegerColorSpace(
    deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    targetColorSpace: XIntegerBitmapColorSpace
  ): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Query number of bits used per bitmap pixel.
    *
    * This method yields the total number of bits used for a color value. At the associated {@link XIntegerBitmap} , the {@link XIntegerBitmap.setPixel()}
    * method will expect a sequence of ceil(BitsPerPixel/8) bytes, and the {@link XIntegerReadOnlyBitmap.getPixel()} will return that number of bytes.
    * Similarly, the color conversion expect input data in multiples of ceil(BitsPerPixel/8), and also return converted data in chunks of this.
    */
  def getBitsPerPixel(): scala.Double
  /**
    * Query the number of bits used for each component.
    *
    * This method returns a sequence of integers, each denoting the number of bits occupied by the respective component. The sum of all component bits must
    * be less or equal than the value returned from {@link getBitsPerPixel()} . If the sum is less, excess bits are always kept in the most significant bits
    * of a pixel. Color components will appear in the byte sequences returned from the {@link XIntegerBitmap} methods in the order defined here, with the
    * first element starting from the least significant bits of the pixel, etc.
    *
    *
    *
    * **Remark**: For the typical 32 bit RGBA color data, the four values would all contain the value eight. For a 16 bit 1555 ARGB format, with mask values
    * 0x8000 for alpha, 0x7C for red, 0x3E for green and 0x1F for blue, the values would be 5, 5, 5, 1, in that order.
    */
  def getComponentBitCounts(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Query whether color data bytes need to be swapped.
    * @returns `TRUE` , This method returns the endianness of the color data. The value is one of the Endianness constants. If color data is represented using m
    */
  def getEndianness(): scala.Double
}

object XIntegerBitmapColorSpace {
  @scala.inline
  def apply(
    BitsPerPixel: scala.Double,
    ComponentBitCounts: activexDashInteropLib.SafeArray[scala.Double],
    ComponentTags: activexDashInteropLib.SafeArray[scala.Double],
    Endianness: scala.Double,
    Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    RenderingIntent: scala.Double,
    Type: scala.Double,
    convertColorSpace: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent], 
      XColorSpace, 
      activexDashInteropLib.SafeArray[ColorComponent]
    ],
    convertFromARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor], 
      activexDashInteropLib.SafeArray[ColorComponent]
    ],
    convertFromIntegerColorSpace: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      XColorSpace, 
      activexDashInteropLib.SafeArray[ColorComponent]
    ],
    convertFromPARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor], 
      activexDashInteropLib.SafeArray[ColorComponent]
    ],
    convertFromRGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[RGBColor], 
      activexDashInteropLib.SafeArray[ColorComponent]
    ],
    convertIntegerFromARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor], 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    convertIntegerFromPARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor], 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    convertIntegerFromRGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[RGBColor], 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    convertIntegerToARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashInteropLib.SafeArray[ARGBColor]
    ],
    convertIntegerToPARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashInteropLib.SafeArray[ARGBColor]
    ],
    convertIntegerToRGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashInteropLib.SafeArray[RGBColor]
    ],
    convertToARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent], 
      activexDashInteropLib.SafeArray[ARGBColor]
    ],
    convertToIntegerColorSpace: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      XIntegerBitmapColorSpace, 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    convertToPARGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent], 
      activexDashInteropLib.SafeArray[ARGBColor]
    ],
    convertToRGB: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent], 
      activexDashInteropLib.SafeArray[RGBColor]
    ],
    getBitsPerPixel: js.Function0[scala.Double],
    getComponentBitCounts: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getComponentTags: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getEndianness: js.Function0[scala.Double],
    getProperties: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getRenderingIntent: js.Function0[scala.Double],
    getType: js.Function0[scala.Double]
  ): XIntegerBitmapColorSpace = {
    val __obj = js.Dynamic.literal(BitsPerPixel = BitsPerPixel, ComponentBitCounts = ComponentBitCounts, ComponentTags = ComponentTags, Endianness = Endianness, Properties = Properties, RenderingIntent = RenderingIntent, Type = Type, convertColorSpace = convertColorSpace, convertFromARGB = convertFromARGB, convertFromIntegerColorSpace = convertFromIntegerColorSpace, convertFromPARGB = convertFromPARGB, convertFromRGB = convertFromRGB, convertIntegerFromARGB = convertIntegerFromARGB, convertIntegerFromPARGB = convertIntegerFromPARGB, convertIntegerFromRGB = convertIntegerFromRGB, convertIntegerToARGB = convertIntegerToARGB, convertIntegerToPARGB = convertIntegerToPARGB, convertIntegerToRGB = convertIntegerToRGB, convertToARGB = convertToARGB, convertToIntegerColorSpace = convertToIntegerColorSpace, convertToPARGB = convertToPARGB, convertToRGB = convertToRGB, getBitsPerPixel = getBitsPerPixel, getComponentBitCounts = getComponentBitCounts, getComponentTags = getComponentTags, getEndianness = getEndianness, getProperties = getProperties, getRenderingIntent = getRenderingIntent, getType = getType)
  
    __obj.asInstanceOf[XIntegerBitmapColorSpace]
  }
}

