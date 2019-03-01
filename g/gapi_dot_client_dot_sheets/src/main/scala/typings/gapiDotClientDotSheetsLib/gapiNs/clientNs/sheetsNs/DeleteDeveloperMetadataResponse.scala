package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeveloperMetadataResponse extends js.Object {
  /** The metadata that was deleted. */
  var deletedDeveloperMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
}

object DeleteDeveloperMetadataResponse {
  @scala.inline
  def apply(deletedDeveloperMetadata: js.Array[DeveloperMetadata] = null): DeleteDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (deletedDeveloperMetadata != null) __obj.updateDynamic("deletedDeveloperMetadata")(deletedDeveloperMetadata)
    __obj.asInstanceOf[DeleteDeveloperMetadataResponse]
  }
}

