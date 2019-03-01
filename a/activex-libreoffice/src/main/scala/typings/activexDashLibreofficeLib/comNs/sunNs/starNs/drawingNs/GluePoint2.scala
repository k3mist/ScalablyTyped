package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct defines the attributes of a glue point.
  *
  * A glue point is a position inside a drawing shape where an edge of a connector shape can be connected.
  */
trait GluePoint2 extends js.Object {
  /** this member specifies the escape direction for a glue point. The escape direction is the direction the connecting line escapes the shape. */
  var Escape: EscapeDirection
  /** if this flag is set to true, the position of this glue point is given in 1/100% values instead of 1/100cm. */
  var IsRelative: scala.Boolean
  /**
    * if this flag is set to false, this is a default glue point. Some shapes may have default glue points attached to them which cannot be altered or
    * removed.
    */
  var IsUserDefined: scala.Boolean
  /** This is the position of this glue point. Depending on the flag `IsRelative` , this is either in 1/100cm or in 1/100%. */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * if this glue points position is not relative, this enum specifies the vertical and horizontal alignment of this point. The alignment specifies how the
    * glue point is moved if the shape is resized.
    */
  var PositionAlignment: Alignment
}

object GluePoint2 {
  @scala.inline
  def apply(
    Escape: EscapeDirection,
    IsRelative: scala.Boolean,
    IsUserDefined: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionAlignment: Alignment
  ): GluePoint2 = {
    val __obj = js.Dynamic.literal(Escape = Escape, IsRelative = IsRelative, IsUserDefined = IsUserDefined, Position = Position, PositionAlignment = PositionAlignment)
  
    __obj.asInstanceOf[GluePoint2]
  }
}

