package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsListResponse extends js.Object {
  /** The list of attachments. */
  var items: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** The type of resource. This is always mirror#attachmentsList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AttachmentsListResponse {
  @scala.inline
  def apply(items: js.Array[Attachment] = null, kind: java.lang.String = null): AttachmentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AttachmentsListResponse]
  }
}

