package typings
package markedLib.markedMod.markedNs.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table
  extends markedLib.markedMod.markedNs.Token {
  var align: js.Array[
    markedLib.markedLibStrings.center | markedLib.markedLibStrings.left | markedLib.markedLibStrings.right | scala.Null
  ]
  var cells: js.Array[js.Array[java.lang.String]]
  var header: js.Array[java.lang.String]
  var `type`: markedLib.markedLibStrings.table
}

object Table {
  @scala.inline
  def apply(
    align: js.Array[
      markedLib.markedLibStrings.center | markedLib.markedLibStrings.left | markedLib.markedLibStrings.right | scala.Null
    ],
    cells: js.Array[js.Array[java.lang.String]],
    header: js.Array[java.lang.String],
    `type`: markedLib.markedLibStrings.table
  ): Table = {
    val __obj = js.Dynamic.literal(align = align, cells = cells, header = header, `type` = `type`)
  
    __obj.asInstanceOf[Table]
  }
}

