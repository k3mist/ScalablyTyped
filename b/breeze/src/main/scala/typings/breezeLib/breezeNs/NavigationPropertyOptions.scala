package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPropertyOptions extends js.Object {
  var associationName: js.UndefOr[java.lang.String] = js.undefined
  var entityTypeName: java.lang.String
  var foreignKeyNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var foreignKeyNamesOnServer: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isScalar: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nameOnServer: js.UndefOr[java.lang.String] = js.undefined
  var validators: js.UndefOr[js.Array[Validator]] = js.undefined
}

object NavigationPropertyOptions {
  @scala.inline
  def apply(
    entityTypeName: java.lang.String,
    associationName: java.lang.String = null,
    foreignKeyNames: js.Array[java.lang.String] = null,
    foreignKeyNamesOnServer: js.Array[java.lang.String] = null,
    isScalar: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    nameOnServer: java.lang.String = null,
    validators: js.Array[Validator] = null
  ): NavigationPropertyOptions = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName)
    if (associationName != null) __obj.updateDynamic("associationName")(associationName)
    if (foreignKeyNames != null) __obj.updateDynamic("foreignKeyNames")(foreignKeyNames)
    if (foreignKeyNamesOnServer != null) __obj.updateDynamic("foreignKeyNamesOnServer")(foreignKeyNamesOnServer)
    if (!js.isUndefined(isScalar)) __obj.updateDynamic("isScalar")(isScalar)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameOnServer != null) __obj.updateDynamic("nameOnServer")(nameOnServer)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[NavigationPropertyOptions]
  }
}

