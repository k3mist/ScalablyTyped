package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapeHandle extends js.Object {
  /** Specifies if the x position of the handle is mirrored. */
  var MirroredX: scala.Boolean
  /** Specifies if the y position of the handle is mirrored. */
  var MirroredY: scala.Boolean
  /**
    * If this attribute is set, the handle is a polar handle. The property specifies the center position of the handle. If this attribute is set, the
    * attributes RangeX and RangeY are ignored, instead the attribute RadiusRange is used.
    */
  var Polar: EnhancedCustomShapeParameterPair
  /**
    * If the property Polar is set, then the first value specifies the radius and the second parameter the angle of the handle. Otherwise, if the handle is
    * not polar, the first parameter specifies the horizontal handle position, the vertical handle position is described by the second parameter.
    */
  var Position: EnhancedCustomShapeParameterPair
  /** If this attribute is set, it specifies the maximum radius range that can be used for a polar handle. */
  var RadiusRangeMaximum: EnhancedCustomShapeParameter
  /** If this attribute is set, it specifies the minimum radius range that can be used for a polar handle. */
  var RadiusRangeMinimum: EnhancedCustomShapeParameter
  /** If the attribute RangeXMaximum is set, it specifies the horizontal maximum range of the handle. */
  var RangeXMaximum: EnhancedCustomShapeParameter
  /** If the attribute RangeXMinimum is set, it specifies the horizontal minimum range of the handle. */
  var RangeXMinimum: EnhancedCustomShapeParameter
  /** If the attribute RangeYMaximum is set, it specifies the vertical maximum range of the handle. */
  var RangeYMaximum: EnhancedCustomShapeParameter
  /** If the attribute RangeYMinimum is set, it specifies the vertical minimum range of the handle. */
  var RangeYMinimum: EnhancedCustomShapeParameter
  /** RefAngle, if this attribute is set, it specifies the index of the adjustment value which is connected to the angle of the handle */
  var RefAngle: scala.Double
  /** RefR, if this attribute is set, it specifies the index of the adjustment value which is connected to the radius of the handle */
  var RefR: scala.Double
  /** RefX, if this attribute is set, it specifies the index of the adjustment value which is connected to the horizontal position of the handle */
  var RefX: scala.Double
  /** RefY, if this attribute is set, it specifies the index of the adjustment value which is connected to the vertical position of the handle */
  var RefY: scala.Double
  /** Specifies if the handle directions are swapped if the shape is taller than wide. */
  var Switched: scala.Boolean
}

object EnhancedCustomShapeHandle {
  @scala.inline
  def apply(
    MirroredX: scala.Boolean,
    MirroredY: scala.Boolean,
    Polar: EnhancedCustomShapeParameterPair,
    Position: EnhancedCustomShapeParameterPair,
    RadiusRangeMaximum: EnhancedCustomShapeParameter,
    RadiusRangeMinimum: EnhancedCustomShapeParameter,
    RangeXMaximum: EnhancedCustomShapeParameter,
    RangeXMinimum: EnhancedCustomShapeParameter,
    RangeYMaximum: EnhancedCustomShapeParameter,
    RangeYMinimum: EnhancedCustomShapeParameter,
    RefAngle: scala.Double,
    RefR: scala.Double,
    RefX: scala.Double,
    RefY: scala.Double,
    Switched: scala.Boolean
  ): EnhancedCustomShapeHandle = {
    val __obj = js.Dynamic.literal(MirroredX = MirroredX, MirroredY = MirroredY, Polar = Polar, Position = Position, RadiusRangeMaximum = RadiusRangeMaximum, RadiusRangeMinimum = RadiusRangeMinimum, RangeXMaximum = RangeXMaximum, RangeXMinimum = RangeXMinimum, RangeYMaximum = RangeYMaximum, RangeYMinimum = RangeYMinimum, RefAngle = RefAngle, RefR = RefR, RefX = RefX, RefY = RefY, Switched = Switched)
  
    __obj.asInstanceOf[EnhancedCustomShapeHandle]
  }
}

