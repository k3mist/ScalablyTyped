package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait Program
  extends Block
     with BaseNode
     with BlockParent
     with Scopable {
  var body: js.Array[Statement]
  var directives: js.Array[Directive]
  var interpreter: InterpreterDirective | scala.Null
  var sourceFile: java.lang.String | scala.Null
  var sourceType: atBabelTypesLib.atBabelTypesLibStrings.script | atBabelTypesLib.atBabelTypesLibStrings.module
  @JSName("type")
  var type_Program: atBabelTypesLib.atBabelTypesLibStrings.Program
}

