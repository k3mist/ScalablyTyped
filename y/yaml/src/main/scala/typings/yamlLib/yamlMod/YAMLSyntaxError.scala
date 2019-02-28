package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAMLSyntaxError
  extends stdLib.Error
     with YAMLError {
  @JSName("name")
  var name_YAMLSyntaxError: yamlLib.yamlLibStrings.YAMLSyntaxError
  var source: yamlLib.yamlMod.cstNs.Node
}

