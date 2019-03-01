package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait GenericTypeAnnotation
  extends Flow
     with BaseNode
     with FlowType {
  var id: Identifier | QualifiedTypeIdentifier
  var typeParameters: TypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_GenericTypeAnnotation: atBabelTypesLib.atBabelTypesLibStrings.GenericTypeAnnotation
}

object GenericTypeAnnotation {
  @scala.inline
  def apply(
    id: Identifier | QualifiedTypeIdentifier,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.GenericTypeAnnotation,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation = null
  ): GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], `type` = `type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[GenericTypeAnnotation]
  }
}

