package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaModelField extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  var parse: js.UndefOr[js.Function] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var validation: js.UndefOr[DataSourceSchemaModelFieldValidation] = js.undefined
}

object DataSourceSchemaModelField {
  @scala.inline
  def apply(
    defaultValue: js.Any = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    from: java.lang.String = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    parse: js.Function = null,
    `type`: java.lang.String = null,
    validation: DataSourceSchemaModelFieldValidation = null
  ): DataSourceSchemaModelField = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (field != null) __obj.updateDynamic("field")(field)
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    __obj.asInstanceOf[DataSourceSchemaModelField]
  }
}

