package typings
package nodeDashVaultLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Any
  var request: nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option
  var statusCode: scala.Double
}

object Anon_Body {
  @scala.inline
  def apply(
    body: js.Any,
    request: nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option,
    statusCode: scala.Double
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, request = request, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

