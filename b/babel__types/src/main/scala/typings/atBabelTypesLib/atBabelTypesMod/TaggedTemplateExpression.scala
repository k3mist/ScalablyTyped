package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TaggedTemplateExpression
  extends Expression
     with BaseNode {
  var quasi: TemplateLiteral
  var tag: Expression
  var typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_TaggedTemplateExpression: atBabelTypesLib.atBabelTypesLibStrings.TaggedTemplateExpression
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    quasi: TemplateLiteral,
    tag: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TaggedTemplateExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation = null
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi, tag = tag, `type` = `type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
}

