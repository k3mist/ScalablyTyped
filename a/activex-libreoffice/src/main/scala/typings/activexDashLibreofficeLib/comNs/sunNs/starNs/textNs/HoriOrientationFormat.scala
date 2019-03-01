package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the horizontal orientation of an object.
  *
  * If `HorizontalOrientation == HORI_NONE` , then the value "XPos" describes the distance from the left border of the context. Otherwise "XPos" is
  * ignored.
  *
  * The following flags are used to adapt the position of the object to odd and even pages. If "PositionToggle" is set, then the horizontal position is
  * mirrored.
  */
trait HoriOrientationFormat extends js.Object {
  /** determines the horizontal alignment of an object. The values refer to com::sun::star::HoriOrientation. */
  var HorizontalOrientation: scala.Double
  /**
    * determines the reference position of the horizontal alignment.
    * @see com.sun.star.text.RelOrientation
    */
  var HorizontalRelation: scala.Double
  /** determines if the orientation toggles between left and right pages. */
  var PositionToggle: scala.Boolean
  /** contains the distance from the left border. Only valid if the property HorizontalOrientation contains the value HORI_NONE. */
  var XPos: scala.Double
}

object HoriOrientationFormat {
  @scala.inline
  def apply(
    HorizontalOrientation: scala.Double,
    HorizontalRelation: scala.Double,
    PositionToggle: scala.Boolean,
    XPos: scala.Double
  ): HoriOrientationFormat = {
    val __obj = js.Dynamic.literal(HorizontalOrientation = HorizontalOrientation, HorizontalRelation = HorizontalRelation, PositionToggle = PositionToggle, XPos = XPos)
  
    __obj.asInstanceOf[HoriOrientationFormat]
  }
}

