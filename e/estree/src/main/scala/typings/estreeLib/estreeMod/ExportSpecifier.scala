package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  var exported: Identifier
  @JSName("type")
  var type_ExportSpecifier: estreeLib.estreeLibStrings.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(
    exported: Identifier,
    local: Identifier,
    `type`: estreeLib.estreeLibStrings.ExportSpecifier,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported, local = local, `type` = `type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportSpecifier]
  }
}

