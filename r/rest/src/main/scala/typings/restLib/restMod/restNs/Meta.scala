package typings
package restLib.restMod.restNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  var arguments: js.Any = js.native
  @JSName("client")
  var client_Original: Client = js.native
  def client(path: java.lang.String): ResponsePromise = js.native
  def client(request: Request): ResponsePromise = js.native
}

