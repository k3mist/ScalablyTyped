package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyFieldHashKeyType extends js.Object {
  var hashKeyField: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var hashKeyType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var hashKeyValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var payloadField: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var rangeKeyField: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var rangeKeyType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var rangeKeyValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_HashKeyFieldHashKeyType {
  @scala.inline
  def apply(
    hashKeyField: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    hashKeyValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    rangeKeyField: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    rangeKeyValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    tableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    hashKeyType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    payloadField: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    rangeKeyType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_HashKeyFieldHashKeyType = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], rangeKeyField = rangeKeyField.asInstanceOf[js.Any], rangeKeyValue = rangeKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType.asInstanceOf[js.Any])
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField.asInstanceOf[js.Any])
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyFieldHashKeyType]
  }
}

