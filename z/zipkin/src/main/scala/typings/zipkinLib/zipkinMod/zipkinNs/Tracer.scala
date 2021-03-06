package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracer extends js.Object {
  var id: TraceId = js.native
  def createChildId(): TraceId = js.native
  def createRootId(): TraceId = js.native
  def createRootId(isSampled: zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean]): TraceId = js.native
  def createRootId(isSampled: zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean], isDebug: scala.Boolean): TraceId = js.native
  def letId[V](traceId: TraceId, callback: js.Function0[V]): V = js.native
  def local[V](name: java.lang.String, callback: js.Function0[V]): V = js.native
  def recordAnnotation(annotation: IAnnotation): scala.Unit = js.native
  def recordAnnotation(annotation: IAnnotation, timestamp: scala.Double): scala.Unit = js.native
  def recordBinary(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def recordBinary(key: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def recordBinary(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def recordClientAddr(inetAddress: InetAddress): scala.Unit = js.native
  def recordLocalAddr(inetAddress: InetAddress): scala.Unit = js.native
  def recordMessage(message: java.lang.String): scala.Unit = js.native
  def recordRpc(name: java.lang.String): scala.Unit = js.native
  def recordServerAddr(inetAddress: InetAddress): scala.Unit = js.native
  def recordServiceName(serviceName: java.lang.String): scala.Unit = js.native
  def scoped[V](callback: js.Function0[V]): V = js.native
  def setId(traceId: TraceId): scala.Unit = js.native
  def writeIdToConsole(message: js.Any): scala.Unit = js.native
}

