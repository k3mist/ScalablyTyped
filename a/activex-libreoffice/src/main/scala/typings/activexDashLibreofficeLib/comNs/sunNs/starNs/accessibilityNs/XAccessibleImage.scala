package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to represent images and icons.
  *
  * This interface is used for a representation of images like icons of buttons. The corresponding interface of the Java Accessibility API is
  * AccessibleIcon. This interface lets you retrieve an image's size and description.
  * @since OOo 1.1.2
  */
trait XAccessibleImage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  val AccessibleImageDescription: java.lang.String
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  val AccessibleImageHeight: scala.Double
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  val AccessibleImageWidth: scala.Double
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  def getAccessibleImageDescription(): java.lang.String
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  def getAccessibleImageHeight(): scala.Double
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  def getAccessibleImageWidth(): scala.Double
}

object XAccessibleImage {
  @scala.inline
  def apply(
    AccessibleImageDescription: java.lang.String,
    AccessibleImageHeight: scala.Double,
    AccessibleImageWidth: scala.Double,
    acquire: () => scala.Unit,
    getAccessibleImageDescription: () => java.lang.String,
    getAccessibleImageHeight: () => scala.Double,
    getAccessibleImageWidth: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAccessibleImage = {
    val __obj = js.Dynamic.literal(AccessibleImageDescription = AccessibleImageDescription, AccessibleImageHeight = AccessibleImageHeight, AccessibleImageWidth = AccessibleImageWidth, acquire = js.Any.fromFunction0(acquire), getAccessibleImageDescription = js.Any.fromFunction0(getAccessibleImageDescription), getAccessibleImageHeight = js.Any.fromFunction0(getAccessibleImageHeight), getAccessibleImageWidth = js.Any.fromFunction0(getAccessibleImageWidth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleImage]
  }
}

