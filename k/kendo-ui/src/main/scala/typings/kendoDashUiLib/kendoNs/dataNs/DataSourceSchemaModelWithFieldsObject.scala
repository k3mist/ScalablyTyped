package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaModelWithFieldsObject extends DataSourceSchemaModel {
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsObject: js.UndefOr[DataSourceSchemaModelFields] = js.undefined
}

object DataSourceSchemaModelWithFieldsObject {
  @scala.inline
  def apply(fields: DataSourceSchemaModelFields = null, id: java.lang.String = null): DataSourceSchemaModelWithFieldsObject = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsObject]
  }
}

