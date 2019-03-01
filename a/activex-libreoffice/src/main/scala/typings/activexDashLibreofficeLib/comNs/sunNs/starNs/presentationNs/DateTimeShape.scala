package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the date and time presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
trait DateTimeShape
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextShape
     with Shape

object DateTimeShape {
  @scala.inline
  def apply(
    Shape: Shape = null,
    TextShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextShape = null
  ): DateTimeShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, TextShape)
    __obj.asInstanceOf[DateTimeShape]
  }
}

