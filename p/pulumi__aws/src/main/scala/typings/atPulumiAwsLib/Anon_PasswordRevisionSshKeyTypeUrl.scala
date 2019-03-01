package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PasswordRevisionSshKeyTypeUrl extends js.Object {
  var password: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var revision: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var sshKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var url: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var username: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_PasswordRevisionSshKeyTypeUrl {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    url: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    password: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    revision: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sshKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    username: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_PasswordRevisionSshKeyTypeUrl = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (sshKey != null) __obj.updateDynamic("sshKey")(sshKey.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PasswordRevisionSshKeyTypeUrl]
  }
}

