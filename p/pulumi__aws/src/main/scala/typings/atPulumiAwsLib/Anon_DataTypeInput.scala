package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypeInput extends js.Object {
  var data: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DataTypeInput {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    data: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DataTypeInput = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataTypeInput]
  }
}

