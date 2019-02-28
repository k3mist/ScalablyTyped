package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSPropertySignature
  extends TSTypeElement
     with BaseNode {
  var computed: scala.Boolean | scala.Null
  var initializer: Expression | scala.Null
  var key: Expression
  var optional: scala.Boolean | scala.Null
  var readonly: scala.Boolean | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  @JSName("type")
  var type_TSPropertySignature: atBabelTypesLib.atBabelTypesLibStrings.TSPropertySignature
}

