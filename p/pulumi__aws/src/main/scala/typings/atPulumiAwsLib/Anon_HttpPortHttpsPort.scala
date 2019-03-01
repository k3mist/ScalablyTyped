package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpPortHttpsPort extends js.Object {
  var httpPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var httpsPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var originKeepaliveTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var originProtocolPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var originReadTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var originSslProtocols: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
}

object Anon_HttpPortHttpsPort {
  @scala.inline
  def apply(
    httpPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    httpsPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    originProtocolPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    originSslProtocols: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    originKeepaliveTimeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    originReadTimeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_HttpPortHttpsPort = {
    val __obj = js.Dynamic.literal(httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], originProtocolPolicy = originProtocolPolicy.asInstanceOf[js.Any], originSslProtocols = originSslProtocols.asInstanceOf[js.Any])
    if (originKeepaliveTimeout != null) __obj.updateDynamic("originKeepaliveTimeout")(originKeepaliveTimeout.asInstanceOf[js.Any])
    if (originReadTimeout != null) __obj.updateDynamic("originReadTimeout")(originReadTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpPortHttpsPort]
  }
}

