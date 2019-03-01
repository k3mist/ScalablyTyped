package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- estreeLib.estreeMod._Node because Already inherited */ trait AssignmentProperty extends Property {
  @JSName("kind")
  var kind_AssignmentProperty: estreeLib.estreeLibStrings.init
  @JSName("value")
  var value_AssignmentProperty: Pattern
}

object AssignmentProperty {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: estreeLib.Expression,
    kind: estreeLib.estreeLibStrings.init,
    method: scala.Boolean,
    shorthand: scala.Boolean,
    `type`: estreeLib.estreeLibStrings.Property,
    value: Pattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, kind = kind, method = method, shorthand = shorthand, `type` = `type`, value = value)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentProperty]
  }
}

