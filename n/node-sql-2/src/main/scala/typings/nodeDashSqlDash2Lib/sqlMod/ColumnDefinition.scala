package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition[Name /* <: java.lang.String */, Type] extends Named[Name] {
  var dataType: java.lang.String
  var defaultValue: js.UndefOr[Type] = js.undefined
  var jsType: js.UndefOr[Type] = js.undefined
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
  var primaryKey: js.UndefOr[scala.Boolean] = js.undefined
  var references: js.UndefOr[nodeDashSqlDash2Lib.Anon_Cascade] = js.undefined
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply[Name /* <: java.lang.String */, Type](
    dataType: java.lang.String,
    defaultValue: Type = null,
    jsType: Type = null,
    name: Name = null,
    notNull: js.UndefOr[scala.Boolean] = js.undefined,
    primaryKey: js.UndefOr[scala.Boolean] = js.undefined,
    references: nodeDashSqlDash2Lib.Anon_Cascade = null,
    unique: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnDefinition[Name, Type] = {
    val __obj = js.Dynamic.literal(dataType = dataType)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (jsType != null) __obj.updateDynamic("jsType")(jsType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey)
    if (references != null) __obj.updateDynamic("references")(references)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[ColumnDefinition[Name, Type]]
  }
}

