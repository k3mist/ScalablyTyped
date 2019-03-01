package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows administrating a set of images, to be displayed as animated seres.
  *
  * Components implementing this interface maintain a variable number of image sets. Components displaying those images will choose the best-fitting image
  * set depending on the available space, and possibly other restrictions.
  * @since OOo 3.4
  */
trait XAnimatedImages
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer {
  /**
    * specifies whether the animation should start over with the first image of the image series when the last image has been played.
    *
    * The default value for this attribute is `TRUE` .
    */
  var AutoRepeat: scala.Boolean
  /** returns the number of images sets maintained by the component. */
  val ImageSetCount: scala.Double
  /**
    * controls the way the images are scaled up or down, when the available space is larger or smaller than what is needed for them.
    *
    * Allowed values are those from the {@link ImageScaleMode} constants group.
    */
  var ScaleMode: scala.Double
  /**
    * specifies the time in milliseconds between two animation steps.
    *
    * This is the minimum time, the actual value might be longer due to system load. The default value will be 100 ms.
    */
  var StepTime: scala.Double
  /**
    * returns the URLs of the image set with the given index
    * @param iIndex the index of the set those image URLs are to be retrieved. Must be greater than or equal to `0` , and smaller than the value returned by {
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def getImageSet(iIndex: scala.Double): activexDashInteropLib.SafeArray[java.lang.String]
  /** returns the number of images sets maintained by the component. */
  def getImageSetCount(): scala.Double
  /**
    * sets the URLs of the image set with the given index
    * @param iIndex the index at which a new image set should be inserted. Must be greater than or equal to `0` , and smaller than or equal to the value retur
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def insertImageSet(
    iIndex: scala.Double,
    iImageURLs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): scala.Unit
  /**
    * removes the image set with the given index
    * @param iIndex the index of the set to remove. Must be greater than or equal to `0` , and smaller than the value returned by {@link getImageSetCount()} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def removeImageSet(iIndex: scala.Double): scala.Unit
  /**
    * replaces the image set given by index with a new one
    * @param iIndex the index of the set those image URLs are to be replaced. Must be greater than or equal to `0` , and smaller than the value returned by {@
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def replaceImageSet(
    iIndex: scala.Double,
    iImageURLs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): scala.Unit
}

object XAnimatedImages {
  @scala.inline
  def apply(
    AutoRepeat: scala.Boolean,
    ImageSetCount: scala.Double,
    ScaleMode: scala.Double,
    StepTime: scala.Double,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    getImageSet: js.Function1[scala.Double, activexDashInteropLib.SafeArray[java.lang.String]],
    getImageSetCount: js.Function0[scala.Double],
    insertImageSet: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeImageSet: js.Function1[scala.Double, scala.Unit],
    replaceImageSet: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      scala.Unit
    ]
  ): XAnimatedImages = {
    val __obj = js.Dynamic.literal(AutoRepeat = AutoRepeat, ImageSetCount = ImageSetCount, ScaleMode = ScaleMode, StepTime = StepTime, acquire = acquire, addContainerListener = addContainerListener, getImageSet = getImageSet, getImageSetCount = getImageSetCount, insertImageSet = insertImageSet, queryInterface = queryInterface, release = release, removeContainerListener = removeContainerListener, removeImageSet = removeImageSet, replaceImageSet = replaceImageSet)
  
    __obj.asInstanceOf[XAnimatedImages]
  }
}

