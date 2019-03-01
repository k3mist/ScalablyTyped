package typings
package atPulumiAwsLib.wafregionalWebAclAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclAssociationState extends js.Object {
  /**
    * Application Load Balancer ARN to associate with.
    */
  val resourceArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the WAF Regional WebACL to create an association.
    */
  val webAclId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object WebAclAssociationState {
  @scala.inline
  def apply(
    resourceArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    webAclId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): WebAclAssociationState = {
    val __obj = js.Dynamic.literal()
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (webAclId != null) __obj.updateDynamic("webAclId")(webAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclAssociationState]
  }
}

