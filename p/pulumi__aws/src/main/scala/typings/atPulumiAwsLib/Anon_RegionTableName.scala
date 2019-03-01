package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RegionTableName extends js.Object {
  var region: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var useCallerCredentials: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object Anon_RegionTableName {
  @scala.inline
  def apply(
    tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    region: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    useCallerCredentials: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_RegionTableName = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (useCallerCredentials != null) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RegionTableName]
  }
}

