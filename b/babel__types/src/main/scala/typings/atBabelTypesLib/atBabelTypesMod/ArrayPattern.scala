package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ArrayPattern
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator] | scala.Null
  var elements: js.Array[PatternLike]
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_ArrayPattern: atBabelTypesLib.atBabelTypesLibStrings.ArrayPattern
}

object ArrayPattern {
  @scala.inline
  def apply(
    elements: js.Array[PatternLike],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ArrayPattern,
    decorators: js.Array[Decorator] = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop = null
  ): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements, `type` = `type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPattern]
  }
}

