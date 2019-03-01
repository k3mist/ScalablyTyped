package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyNameNonKeyAttributes extends js.Object {
  var hashKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var nonKeyAttributes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var projectionType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var rangeKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var readCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var writeCapacity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_HashKeyNameNonKeyAttributes {
  @scala.inline
  def apply(
    hashKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    projectionType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    nonKeyAttributes: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    rangeKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    readCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    writeCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_HashKeyNameNonKeyAttributes = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes.asInstanceOf[js.Any])
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey.asInstanceOf[js.Any])
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyNameNonKeyAttributes]
  }
}

