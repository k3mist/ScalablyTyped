package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldDefinition extends Node {
  var arguments: js.Array[InputValueDefinition]
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var `type`: Type
}

object FieldDefinition {
  @scala.inline
  def apply(
    arguments: js.Array[InputValueDefinition],
    kind: java.lang.String,
    name: Name,
    `type`: Type,
    loc: Location = null
  ): FieldDefinition = {
    val __obj = js.Dynamic.literal(arguments = arguments, kind = kind, name = name, `type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[FieldDefinition]
  }
}

