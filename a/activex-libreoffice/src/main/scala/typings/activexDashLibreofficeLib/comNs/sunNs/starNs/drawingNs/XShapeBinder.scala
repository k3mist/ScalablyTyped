package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** connects or breaks the lines of {@link Shapes} */
trait XShapeBinder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * binds {@link Shapes} together.
    * @param xShapes a container with {@link Shapes} that will be bind together. All {@link Shapes} will be converted to a {@link PolyPolygonBezierShape} and
    * @returns a newly created {@link PolyPolygonBezierShape} which contains all line segment from the supplied {@link Shapes} . It is also added to the {@link
    */
  def bind(xShapes: XShapes): XShape
  /**
    * breaks a {@link Shape} into its line segments
    * @param xShape the given {@link Shape} will be converted to a {@link PolyPolygonBezierShape} and the line segments of this {@link Shape} will be used to
    */
  def unbind(xShape: XShape): scala.Unit
}

object XShapeBinder {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    bind: js.Function1[XShapes, XShape],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    unbind: js.Function1[XShape, scala.Unit]
  ): XShapeBinder = {
    val __obj = js.Dynamic.literal(acquire = acquire, bind = bind, queryInterface = queryInterface, release = release, unbind = unbind)
  
    __obj.asInstanceOf[XShapeBinder]
  }
}

