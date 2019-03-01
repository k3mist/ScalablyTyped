package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNonKeyAttributesProjectionTypeRangeKey extends js.Object {
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var nonKeyAttributes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var projectionType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var rangeKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_NameNonKeyAttributesProjectionTypeRangeKey {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    projectionType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    rangeKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    nonKeyAttributes: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_NameNonKeyAttributesProjectionTypeRangeKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameNonKeyAttributesProjectionTypeRangeKey]
  }
}

