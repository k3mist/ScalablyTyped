package typings
package d3DashColorLib.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSLColor
  extends Color
     with ColorSpaceObject {
  /**
    * Hue channel value.
    */
  var h: scala.Double = js.native
  /**
    * Lightness channel value.
    */
  var l: scala.Double = js.native
  /**
    * Opacity value.
    */
  var opacity: scala.Double = js.native
  /**
    * Saturation channel value.
    */
  var s: scala.Double = js.native
  /**
    * Returns a brighter copy of this color. If k is specified, it controls how much brighter the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much brighter the returned color should be.
    */
  def brighter(): this.type = js.native
  def brighter(k: scala.Double): this.type = js.native
  /**
    * Returns a darker copy of this color. If k is specified, it controls how much darker the returned color should be.
    * If k is not specified, it defaults to 1.
    *
    * @param k A color space dependent number to determine, how much darker the returned color should be.
    */
  def darker(): this.type = js.native
  def darker(k: scala.Double): this.type = js.native
  /**
    * Returns the RGB color equivalent of this color.
    */
  def rgb(): RGBColor = js.native
}

