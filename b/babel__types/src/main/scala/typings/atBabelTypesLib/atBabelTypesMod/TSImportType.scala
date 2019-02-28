package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSImportType
  extends TSType
     with BaseNode {
  var argument: StringLiteral
  var qualifier: TSEntityName | scala.Null
  var typeParameters: TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_TSImportType: atBabelTypesLib.atBabelTypesLibStrings.TSImportType
}

