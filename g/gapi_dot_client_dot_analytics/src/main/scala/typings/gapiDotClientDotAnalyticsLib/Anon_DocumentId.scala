package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentId extends js.Object {
  /** Id of the document/file containing the report data. */
  var documentId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DocumentId {
  @scala.inline
  def apply(documentId: java.lang.String = null): Anon_DocumentId = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId)
    __obj.asInstanceOf[Anon_DocumentId]
  }
}

