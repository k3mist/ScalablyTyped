package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seq
  extends Node
     with ContentNode {
  var items: js.Array[Comment | SeqItem]
  @JSName("type")
  var type_Seq: yamlLib.yamlLibStrings.SEQ
}

