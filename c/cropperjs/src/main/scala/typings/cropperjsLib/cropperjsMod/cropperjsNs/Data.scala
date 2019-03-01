package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * the height of the cropped area
    */
  var height: scala.Double
  /**
    * the rotated degrees of the image
    */
  var rotate: scala.Double
  /**
    * the scaling factor to apply on the abscissa of the image
    */
  var scaleX: scala.Double
  /**
    * the scaling factor to apply on the ordinate of the image
    */
  var scaleY: scala.Double
  /**
    * the width of the cropped area
    */
  var width: scala.Double
  /**
    * the offset left of the cropped area
    */
  var x: scala.Double
  /**
    * the offset top of the cropped area
    */
  var y: scala.Double
}

object Data {
  @scala.inline
  def apply(
    height: scala.Double,
    rotate: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): Data = {
    val __obj = js.Dynamic.literal(height = height, rotate = rotate, scaleX = scaleX, scaleY = scaleY, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Data]
  }
}

