package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXOpeningElement
  extends Immutable
     with BaseNode
     with JSX {
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute]
  var name: JSXIdentifier | JSXMemberExpression
  var selfClosing: scala.Boolean
  var typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_JSXOpeningElement: atBabelTypesLib.atBabelTypesLibStrings.JSXOpeningElement
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression,
    selfClosing: scala.Boolean,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.JSXOpeningElement,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation = null
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, name = name.asInstanceOf[js.Any], selfClosing = selfClosing, `type` = `type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningElement]
  }
}

