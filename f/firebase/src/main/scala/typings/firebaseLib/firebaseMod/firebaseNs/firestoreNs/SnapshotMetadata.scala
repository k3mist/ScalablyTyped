package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMetadata extends js.Object {
  /**
    * True if the snapshot was created from cached data rather than
    * guaranteed up-to-date server data. If your listener has opted into
    * metadata updates (via `DocumentListenOptions` or `QueryListenOptions`)
    * you will receive another snapshot with `fromCache` equal to false once
    * the client has received up-to-date data from the backend.
    */
  val fromCache: scala.Boolean
  /**
    * True if the snapshot contains the result of local writes (e.g. set() or
    * update() calls) that have not yet been committed to the backend.
    * If your listener has opted into metadata updates (via
    * `DocumentListenOptions` or `QueryListenOptions`) you will receive another
    * snapshot with `hasPendingWrites` equal to false once the writes have been
    * committed to the backend.
    */
  val hasPendingWrites: scala.Boolean
  /**
    * Returns true if this `SnapshotMetadata` is equal to the provided one.
    *
    * @param other The `SnapshotMetadata` to compare against.
    * @return true if this `SnapshotMetadata` is equal to the provided one.
    */
  def isEqual(other: SnapshotMetadata): scala.Boolean
}

object SnapshotMetadata {
  @scala.inline
  def apply(
    fromCache: scala.Boolean,
    hasPendingWrites: scala.Boolean,
    isEqual: js.Function1[SnapshotMetadata, scala.Boolean]
  ): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache, hasPendingWrites = hasPendingWrites, isEqual = isEqual)
  
    __obj.asInstanceOf[SnapshotMetadata]
  }
}

