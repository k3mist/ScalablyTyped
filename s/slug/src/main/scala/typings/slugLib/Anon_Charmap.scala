package typings
package slugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Charmap extends js.Object {
  var charmap: slugLib.slugMod.CharMap
  var mode: java.lang.String
  var modes: Anon_Pretty
  var multicharmap: slugLib.slugMod.CharMap
}

object Anon_Charmap {
  @scala.inline
  def apply(
    charmap: slugLib.slugMod.CharMap,
    mode: java.lang.String,
    modes: Anon_Pretty,
    multicharmap: slugLib.slugMod.CharMap
  ): Anon_Charmap = {
    val __obj = js.Dynamic.literal(charmap = charmap, mode = mode, modes = modes, multicharmap = multicharmap)
  
    __obj.asInstanceOf[Anon_Charmap]
  }
}

