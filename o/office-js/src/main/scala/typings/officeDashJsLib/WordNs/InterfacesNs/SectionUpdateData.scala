package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Section object, for use in "section.set({ ... })". */
trait SectionUpdateData extends js.Object {
  /**
    *
    * Gets the body object of the section. This does not include the header/footer and other section metadata.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyUpdateData] = js.undefined
}

object SectionUpdateData {
  @scala.inline
  def apply(body: BodyUpdateData = null): SectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[SectionUpdateData]
  }
}

