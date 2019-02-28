package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSemanticError
  extends stdLib.Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSemanticError: yamlLib.yamlLibStrings.YAMLSemanticError
  var source: yamlLib.yamlMod.cstNs.Node
}

