package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationsRestrictionType extends js.Object {
  var locations: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var restrictionType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_LocationsRestrictionType {
  @scala.inline
  def apply(
    restrictionType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    locations: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_LocationsRestrictionType = {
    val __obj = js.Dynamic.literal(restrictionType = restrictionType.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LocationsRestrictionType]
  }
}

