package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateComputeType extends js.Object {
  var certificate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var computeType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var environmentVariables: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameTypeValue]]]
  ] = js.undefined
  var image: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var privilegedMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_CertificateComputeType {
  @scala.inline
  def apply(
    computeType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    image: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    certificate: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    environmentVariables: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameTypeValue]]] = null,
    privilegedMode: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_CertificateComputeType = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (privilegedMode != null) __obj.updateDynamic("privilegedMode")(privilegedMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateComputeType]
  }
}

