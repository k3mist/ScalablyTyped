package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ClassProperty
  extends Property
     with BaseNode {
  var `abstract`: scala.Boolean | scala.Null
  var accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var definite: scala.Boolean | scala.Null
  var key: Identifier | StringLiteral | NumericLiteral | Expression
  var optional: scala.Boolean | scala.Null
  var readonly: scala.Boolean | scala.Null
  var static: scala.Boolean | scala.Null
  var typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  @JSName("type")
  var type_ClassProperty: atBabelTypesLib.atBabelTypesLibStrings.ClassProperty
  var value: Expression | scala.Null
}

