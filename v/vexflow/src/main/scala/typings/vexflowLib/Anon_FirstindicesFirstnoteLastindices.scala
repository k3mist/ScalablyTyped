package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstindicesFirstnoteLastindices extends js.Object {
  var first_indices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var first_note: js.UndefOr[vexflowLib.VexNs.FlowNs.Note] = js.undefined
  var last_indices: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var last_note: js.UndefOr[vexflowLib.VexNs.FlowNs.Note] = js.undefined
}

object Anon_FirstindicesFirstnoteLastindices {
  @scala.inline
  def apply(
    first_indices: js.Array[scala.Double] = null,
    first_note: vexflowLib.VexNs.FlowNs.Note = null,
    last_indices: js.Array[scala.Double] = null,
    last_note: vexflowLib.VexNs.FlowNs.Note = null
  ): Anon_FirstindicesFirstnoteLastindices = {
    val __obj = js.Dynamic.literal()
    if (first_indices != null) __obj.updateDynamic("first_indices")(first_indices)
    if (first_note != null) __obj.updateDynamic("first_note")(first_note)
    if (last_indices != null) __obj.updateDynamic("last_indices")(last_indices)
    if (last_note != null) __obj.updateDynamic("last_note")(last_note)
    __obj.asInstanceOf[Anon_FirstindicesFirstnoteLastindices]
  }
}

