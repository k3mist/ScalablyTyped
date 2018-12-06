package typings
package koaDashBouncerLib.koaDashBouncerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bouncer", JSImport.Namespace)
@js.native
object koaDashBouncerModMembers extends js.Object {
  def isSafeInteger(n: scala.Double): scala.Boolean = js.native
  def middleware(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def middleware(opts: koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs.MiddlewareOption): koaLib.koaMod.ApplicationNs.Middleware = js.native
}
