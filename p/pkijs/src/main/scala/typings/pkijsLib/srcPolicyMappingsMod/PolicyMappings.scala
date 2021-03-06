package typings
package pkijsLib.srcPolicyMappingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyMappings extends js.Object {
  var mappings: js.Array[pkijsLib.srcPolicyMappingMod.default]
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PolicyMappings {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    mappings: js.Array[pkijsLib.srcPolicyMappingMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyMappings = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mappings = mappings, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[PolicyMappings]
  }
}

