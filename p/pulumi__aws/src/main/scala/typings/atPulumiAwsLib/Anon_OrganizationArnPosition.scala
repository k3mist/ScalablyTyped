package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OrganizationArnPosition extends js.Object {
  var organizationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var position: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var topicArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_OrganizationArnPosition {
  @scala.inline
  def apply(
    organizationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    position: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    topicArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_OrganizationArnPosition = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OrganizationArnPosition]
  }
}

