package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppIdClientRegexAwsRegion extends js.Object {
  var appIdClientRegex: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var awsRegion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var defaultAction: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var userPoolId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_AppIdClientRegexAwsRegion {
  @scala.inline
  def apply(
    defaultAction: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    userPoolId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    appIdClientRegex: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    awsRegion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_AppIdClientRegexAwsRegion = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex.asInstanceOf[js.Any])
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AppIdClientRegexAwsRegion]
  }
}

