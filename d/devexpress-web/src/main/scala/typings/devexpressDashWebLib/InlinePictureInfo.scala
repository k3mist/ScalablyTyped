package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains in-line picture settings.
  */
trait InlinePictureInfo extends js.Object {
  /**
    * Gets the actual image height.
    * Value: An integer value specifying the image height.
    */
  var actualHeight: scala.Double
  /**
    * Gets the actual image width.
    * Value: An integer value specifying the image width.
    */
  var actualWidth: scala.Double
  /**
    * Gets the image identifier.
    * Value: An integer value specifying the image identifier.
    */
  var id: scala.Double
  /**
    * Gets the initial image height.
    * Value: An integer value specifying the image height.
    */
  var initialHeight: scala.Double
  /**
    * Gets the initial image width.
    * Value: An integer value specifying the image width.
    */
  var initialWidth: scala.Double
  /**
    * Gets the image position.
    * Value: An integer value specifying the image position.
    */
  var position: scala.Double
  /**
    * Gets the X-scaling factor of the inline image.
    * Value: An integer value specifying the scaling factor for the X-axis.
    */
  var scaleX: scala.Double
  /**
    * Gets the Y-scaling factor of the inline image.
    * Value: An integer value specifying the scaling factor for the Y-axis.
    */
  var scaleY: scala.Double
}

object InlinePictureInfo {
  @scala.inline
  def apply(
    actualHeight: scala.Double,
    actualWidth: scala.Double,
    id: scala.Double,
    initialHeight: scala.Double,
    initialWidth: scala.Double,
    position: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double
  ): InlinePictureInfo = {
    val __obj = js.Dynamic.literal(actualHeight = actualHeight, actualWidth = actualWidth, id = id, initialHeight = initialHeight, initialWidth = initialWidth, position = position, scaleX = scaleX, scaleY = scaleY)
  
    __obj.asInstanceOf[InlinePictureInfo]
  }
}

