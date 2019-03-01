package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorListProps extends js.Object {
  var errorSchema: FormValidation
  var errors: js.Array[AjvError]
  var formContext: js.Any
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var uiSchema: UiSchema
}

object ErrorListProps {
  @scala.inline
  def apply(
    errorSchema: FormValidation,
    errors: js.Array[AjvError],
    formContext: js.Any,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    uiSchema: UiSchema
  ): ErrorListProps = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema, errors = errors, formContext = formContext, schema = schema, uiSchema = uiSchema)
  
    __obj.asInstanceOf[ErrorListProps]
  }
}

