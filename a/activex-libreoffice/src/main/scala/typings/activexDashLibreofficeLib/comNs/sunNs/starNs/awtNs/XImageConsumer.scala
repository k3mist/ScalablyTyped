package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a data sink for an image.
  *
  * An image consumer is a component which wants to display or just receive an image from an image producer.
  * @see XImageProducer
  */
trait XImageConsumer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * is called for the notification of the degree to which the image is delivered.
    *
    * The complete method is called when the image producer has finished delivering all of the pixels that the source image contains, or when a single frame
    * of a multi-frame animation has been completed, or when an error in loading or producing the image has occurred. The image consumer should remove
    * itself from the list of consumers registered with the image producer at this time, unless it is interested in successive frames.
    */
  def complete(Status: scala.Double, xProducer: XImageProducer): scala.Unit
  /** initializes the consumer with image dimensions. */
  def init(Width: scala.Double, Height: scala.Double): scala.Unit
  /** changes color model for next pixels typically called once after initialization. */
  def setColorModel(
    BitCount: scala.Double,
    RGBAPal: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    RedMask: scala.Double,
    GreenMask: scala.Double,
    BlueMask: scala.Double,
    AlphaMask: scala.Double
  ): scala.Unit
  /**
    * delivers a chunk of pixels as `long` values.
    *
    * The pixels of the image are delivered using one or more calls to this method. Each call specifies the location and size of the rectangle of source
    * pixels that are contained in the array of pixels. The specified color model object should be used to convert the pixels into their corresponding color
    * and alpha components. Pixel (m,n) is stored in the pixels array at index (n * **nScanSize**m + nOffset).
    */
  def setPixelsByBytes(
    nX: scala.Double,
    nY: scala.Double,
    nWidth: scala.Double,
    nHeight: scala.Double,
    aProducerData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    nOffset: scala.Double,
    nScanSize: scala.Double
  ): scala.Unit
  /**
    * delivers a chunk of pixels as `byte` values.
    *
    * The pixels of the image are delivered using one or more calls to this method. Each call specifies the location and size of the rectangle of source
    * pixels that are contained in the array of pixels. The specified color model object should be used to convert the pixels into their corresponding color
    * and alpha components. Pixel (m,n) is stored in the pixels array at index (n * **nScanSize**m + nOffset).
    */
  def setPixelsByLongs(
    nX: scala.Double,
    nY: scala.Double,
    nWidth: scala.Double,
    nHeight: scala.Double,
    aProducerData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    nOffset: scala.Double,
    nScanSize: scala.Double
  ): scala.Unit
}

object XImageConsumer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    complete: (scala.Double, XImageProducer) => scala.Unit,
    init: (scala.Double, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setColorModel: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setPixelsByBytes: (scala.Double, scala.Double, scala.Double, scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double, scala.Double) => scala.Unit,
    setPixelsByLongs: (scala.Double, scala.Double, scala.Double, scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double, scala.Double) => scala.Unit
  ): XImageConsumer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), complete = js.Any.fromFunction2(complete), init = js.Any.fromFunction2(init), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColorModel = js.Any.fromFunction6(setColorModel), setPixelsByBytes = js.Any.fromFunction7(setPixelsByBytes), setPixelsByLongs = js.Any.fromFunction7(setPixelsByLongs))
  
    __obj.asInstanceOf[XImageConsumer]
  }
}

