package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HiveJsonSerDeOpenXJsonSerDe extends js.Object {
  var hiveJsonSerDe: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_TimestampFormatsArray]] = js.undefined
  var openXJsonSerDe: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_CaseInsensitiveColumnToJsonKeyMappings]] = js.undefined
}

object Anon_HiveJsonSerDeOpenXJsonSerDe {
  @scala.inline
  def apply(
    hiveJsonSerDe: atPulumiPulumiLib.resourceMod.Input[Anon_TimestampFormatsArray] = null,
    openXJsonSerDe: atPulumiPulumiLib.resourceMod.Input[Anon_CaseInsensitiveColumnToJsonKeyMappings] = null
  ): Anon_HiveJsonSerDeOpenXJsonSerDe = {
    val __obj = js.Dynamic.literal()
    if (hiveJsonSerDe != null) __obj.updateDynamic("hiveJsonSerDe")(hiveJsonSerDe.asInstanceOf[js.Any])
    if (openXJsonSerDe != null) __obj.updateDynamic("openXJsonSerDe")(openXJsonSerDe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HiveJsonSerDeOpenXJsonSerDe]
  }
}

