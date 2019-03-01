package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link FilePicker} that support the preview of various file formats should implement this interface. */
trait XFilePreview
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  val AvailableHeight: scala.Double
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  val AvailableWidth: scala.Double
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  var ShowState: scala.Boolean
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  val SupportedImageFormats: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  val TargetColorDepth: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * The method returns the available height of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The height of the preview window in pixel.
    */
  def getAvailableHeight(): scala.Double
  /**
    * The method returns the available width of the preview window even if the window is invisible or could not be created. If a service implementation
    * doesn't support a file preview 0 will be returned.
    * @returns The width of the preview window in pixel.
    */
  def getAvailableWidth(): scala.Double
  /**
    * Returns the current show state of the preview.
    * @returns A value of `TRUE` if the preview window is visible. A value of `FALSE` if the preview window is invisible.
    */
  def getShowState(): scala.Boolean
  /**
    * The method returns all image formats that the preview supports.
    * @returns A sequence of all supported preview formats
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    */
  def getSupportedImageFormats(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * The method returns the supported color depth of the target device.
    * @returns The color depth in bit, e.g. 8 bit, 16 bit, 32 bit.
    */
  def getTargetColorDepth(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Sets a new image. If the preview is currently hidden the image will be ignored. An empty any will clear the preview window.
    * @param aImageFormat Specifies the format of the data that will be delivered
    * @param aImage The image data, the image format defines how the image data have to be delivered
    * @see com.sun.star.ui.dialogs.FilePreviewImageFormats
    * @throws com::sun::star::lang::IllegalArgumentException If the specified image format is invalid or not supported by the preview implementation
    */
  def setImage(aImageFormat: scala.Double, aImage: js.Any): scala.Unit
  /**
    * Optionally sets the current show state of the preview. It is possible that the preview implementation doesn't support hiding the preview.
    * @param bShowState A value of `TRUE` shows the preview window. A value of `FALSE` hides the preview window.
    * @returns A value of `TRUE` on success. A value of `FALSE` if the operation fails for any reason or the preview implementation doesn't support hiding the p
    */
  def setShowState(bShowState: scala.Boolean): scala.Boolean
}

object XFilePreview {
  @scala.inline
  def apply(
    AvailableHeight: scala.Double,
    AvailableWidth: scala.Double,
    ShowState: scala.Boolean,
    SupportedImageFormats: activexDashInteropLib.SafeArray[scala.Double],
    TargetColorDepth: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    acquire: js.Function0[scala.Unit],
    getAvailableHeight: js.Function0[scala.Double],
    getAvailableWidth: js.Function0[scala.Double],
    getShowState: js.Function0[scala.Boolean],
    getSupportedImageFormats: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getTargetColorDepth: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setImage: js.Function2[scala.Double, js.Any, scala.Unit],
    setShowState: js.Function1[scala.Boolean, scala.Boolean]
  ): XFilePreview = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight, AvailableWidth = AvailableWidth, ShowState = ShowState, SupportedImageFormats = SupportedImageFormats, TargetColorDepth = TargetColorDepth, acquire = acquire, getAvailableHeight = getAvailableHeight, getAvailableWidth = getAvailableWidth, getShowState = getShowState, getSupportedImageFormats = getSupportedImageFormats, getTargetColorDepth = getTargetColorDepth, queryInterface = queryInterface, release = release, setImage = setImage, setShowState = setShowState)
  
    __obj.asInstanceOf[XFilePreview]
  }
}

