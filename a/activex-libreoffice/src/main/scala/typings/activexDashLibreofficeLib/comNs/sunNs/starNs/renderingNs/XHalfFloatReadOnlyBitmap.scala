package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specialized interface for bitmaps containing half floats as their color components. Half floats are 16 bit wide, and some high-end GPUs already have
  * them as supported frame buffer format. In contrast to {@link XHalfFloatBitmap} , this interface only permits read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XHalfFloatReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link FloatingPointBitmapLayout}
  * return values. If either of them occurs, the whole bitmap read operation should be repeated.
  */
trait XHalfFloatReadOnlyBitmap extends XBitmap {
  /** Query the memory layout for this bitmap. */
  val MemoryLayout: FloatingPointBitmapLayout
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. When querying subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is requested. Note: as we currently
    * have no 16 bit float UNO data type, the values are transported as 16 bit integers across the API (which requires casting on both sides).
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    */
  def getData(rect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D): stdLib.SafeArray[scala.Double]
  /** Query the memory layout for this bitmap. */
  def getMemoryLayout(): FloatingPointBitmapLayout
  /**
    * Get a single pixel of the bitmap, returning its color value.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    */
  def getPixel(pos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D): stdLib.SafeArray[scala.Double]
}

object XHalfFloatReadOnlyBitmap {
  @scala.inline
  def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: () => scala.Unit,
    getData: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D => stdLib.SafeArray[scala.Double],
    getMemoryLayout: () => FloatingPointBitmapLayout,
    getPixel: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D => stdLib.SafeArray[scala.Double],
    getScaledBitmap: (activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, scala.Boolean) => XBitmap,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    hasAlpha: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XHalfFloatReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout, Size = Size, acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction1(getData), getMemoryLayout = js.Any.fromFunction0(getMemoryLayout), getPixel = js.Any.fromFunction1(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHalfFloatReadOnlyBitmap]
  }
}

