package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSTypeReference
  extends TSType
     with BaseNode {
  var typeName: TSEntityName
  var typeParameters: TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_TSTypeReference: atBabelTypesLib.atBabelTypesLibStrings.TSTypeReference
}

