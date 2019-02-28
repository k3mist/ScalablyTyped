package typings
package atPulumiAwsLib.opsworksUserProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfileArgs extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page
    */
  val allowSelfManagement: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The users public key
    */
  val sshPublicKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ssh username, with witch this user wants to log in
    */
  val sshUsername: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The user's IAM ARN
    */
  val userArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

