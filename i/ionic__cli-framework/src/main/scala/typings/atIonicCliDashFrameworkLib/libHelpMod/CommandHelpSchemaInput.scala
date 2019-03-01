package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandHelpSchemaInput extends js.Object {
  val name: java.lang.String
  val required: scala.Boolean
  val summary: java.lang.String
}

object CommandHelpSchemaInput {
  @scala.inline
  def apply(name: java.lang.String, required: scala.Boolean, summary: java.lang.String): CommandHelpSchemaInput = {
    val __obj = js.Dynamic.literal(name = name, required = required, summary = summary)
  
    __obj.asInstanceOf[CommandHelpSchemaInput]
  }
}

