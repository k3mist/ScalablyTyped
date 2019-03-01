package typings
package gapiDotClientDotGroupsmigrationLib.gapiNs.clientNs.groupsmigrationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveResource extends js.Object {
  /** Inserts a new mail into the archive of the Google group. */
  def insert(request: gapiDotClientDotGroupsmigrationLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Groups]
}

object ArchiveResource {
  @scala.inline
  def apply(
    insert: js.Function1[
      gapiDotClientDotGroupsmigrationLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Groups]
    ]
  ): ArchiveResource = {
    val __obj = js.Dynamic.literal(insert = insert)
  
    __obj.asInstanceOf[ArchiveResource]
  }
}

