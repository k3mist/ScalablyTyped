package typings
package atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotListenOptions extends js.Object {
  /**
    * Include a change even if only the metadata of the query or of a document
    * changed. Default is false.
    */
  val includeMetadataChanges: js.UndefOr[scala.Boolean] = js.undefined
}

object SnapshotListenOptions {
  @scala.inline
  def apply(includeMetadataChanges: js.UndefOr[scala.Boolean] = js.undefined): SnapshotListenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeMetadataChanges)) __obj.updateDynamic("includeMetadataChanges")(includeMetadataChanges)
    __obj.asInstanceOf[SnapshotListenOptions]
  }
}

