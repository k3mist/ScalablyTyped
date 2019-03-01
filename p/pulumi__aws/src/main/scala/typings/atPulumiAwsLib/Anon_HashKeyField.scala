package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyField extends js.Object {
  var hashKeyField: java.lang.String
  var hashKeyType: js.UndefOr[java.lang.String] = js.undefined
  var hashKeyValue: java.lang.String
  var payloadField: js.UndefOr[java.lang.String] = js.undefined
  var rangeKeyField: java.lang.String
  var rangeKeyType: js.UndefOr[java.lang.String] = js.undefined
  var rangeKeyValue: java.lang.String
  var roleArn: java.lang.String
  var tableName: java.lang.String
}

object Anon_HashKeyField {
  @scala.inline
  def apply(
    hashKeyField: java.lang.String,
    hashKeyValue: java.lang.String,
    rangeKeyField: java.lang.String,
    rangeKeyValue: java.lang.String,
    roleArn: java.lang.String,
    tableName: java.lang.String,
    hashKeyType: java.lang.String = null,
    payloadField: java.lang.String = null,
    rangeKeyType: java.lang.String = null
  ): Anon_HashKeyField = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField, hashKeyValue = hashKeyValue, rangeKeyField = rangeKeyField, rangeKeyValue = rangeKeyValue, roleArn = roleArn, tableName = tableName)
    if (hashKeyType != null) __obj.updateDynamic("hashKeyType")(hashKeyType)
    if (payloadField != null) __obj.updateDynamic("payloadField")(payloadField)
    if (rangeKeyType != null) __obj.updateDynamic("rangeKeyType")(rangeKeyType)
    __obj.asInstanceOf[Anon_HashKeyField]
  }
}

