package typings
package findDashMyDashWayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Ctx[V /* <: findDashMyDashWayLib.findDashMyDashWayMod.RouterNs.HTTPVersion */] extends js.Object {
  def deriveVersion[Context](req: nodeLib.http2Mod.Http2ServerRequest): java.lang.String = js.native
  def deriveVersion[Context](req: nodeLib.http2Mod.Http2ServerRequest, ctx: Context): java.lang.String = js.native
  def deriveVersion[Context](req: nodeLib.httpMod.IncomingMessage): java.lang.String = js.native
  def deriveVersion[Context](req: nodeLib.httpMod.IncomingMessage, ctx: Context): java.lang.String = js.native
  def storage(): Anon_Del[V] = js.native
}

