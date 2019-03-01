package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XConnectorShape extends XShape {
  /** connects the end of this instance. */
  def connectEnd(xShape: XConnectableShape, nPos: ConnectionType): scala.Unit
  /** connects the start of this instance */
  def connectStart(xShape: XConnectableShape, nPos: ConnectionType): scala.Unit
  /** disconnects the given {@link Shape} from the start of this instance. */
  def disconnectBegin(xShape: XConnectableShape): scala.Unit
  /** disconnects the given {@link Shape} from the end of this instance. */
  def disconnectEnd(xShape: XConnectableShape): scala.Unit
}

object XConnectorShape {
  @scala.inline
  def apply(
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: js.Function0[scala.Unit],
    connectEnd: js.Function2[XConnectableShape, ConnectionType, scala.Unit],
    connectStart: js.Function2[XConnectableShape, ConnectionType, scala.Unit],
    disconnectBegin: js.Function1[XConnectableShape, scala.Unit],
    disconnectEnd: js.Function1[XConnectableShape, scala.Unit],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XConnectorShape = {
    val __obj = js.Dynamic.literal(Position = Position, ShapeType = ShapeType, Size = Size, acquire = acquire, connectEnd = connectEnd, connectStart = connectStart, disconnectBegin = disconnectBegin, disconnectEnd = disconnectEnd, getPosition = getPosition, getShapeType = getShapeType, getSize = getSize, queryInterface = queryInterface, release = release, setPosition = setPosition, setSize = setSize)
  
    __obj.asInstanceOf[XConnectorShape]
  }
}

