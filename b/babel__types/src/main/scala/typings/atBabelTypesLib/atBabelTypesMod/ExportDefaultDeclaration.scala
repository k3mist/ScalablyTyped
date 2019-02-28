package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ExportDefaultDeclaration
  extends Declaration
     with BaseNode
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: FunctionDeclaration | TSDeclareFunction | ClassDeclaration | Expression
  @JSName("type")
  var type_ExportDefaultDeclaration: atBabelTypesLib.atBabelTypesLibStrings.ExportDefaultDeclaration
}

