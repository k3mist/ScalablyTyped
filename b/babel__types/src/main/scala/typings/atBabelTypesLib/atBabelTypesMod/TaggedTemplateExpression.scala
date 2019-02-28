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

