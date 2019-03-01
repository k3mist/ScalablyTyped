package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteSourceFromS3MaxAgeInDays extends js.Object {
  var deleteSourceFromS3: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var maxAgeInDays: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var maxCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var serviceRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DeleteSourceFromS3MaxAgeInDays {
  @scala.inline
  def apply(
    serviceRole: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    deleteSourceFromS3: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    maxAgeInDays: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    maxCount: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_DeleteSourceFromS3MaxAgeInDays = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    if (deleteSourceFromS3 != null) __obj.updateDynamic("deleteSourceFromS3")(deleteSourceFromS3.asInstanceOf[js.Any])
    if (maxAgeInDays != null) __obj.updateDynamic("maxAgeInDays")(maxAgeInDays.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteSourceFromS3MaxAgeInDays]
  }
}

