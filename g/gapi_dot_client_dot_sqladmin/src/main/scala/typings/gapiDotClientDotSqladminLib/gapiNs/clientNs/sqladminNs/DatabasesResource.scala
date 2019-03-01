package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: gapiDotClientDotSqladminLib.Anon_AltDatabase): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: gapiDotClientDotSqladminLib.Anon_AltDatabase): gapiDotClientLib.gapiNs.clientNs.Request[Database]
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: gapiDotClientDotSqladminLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DatabasesListResponse]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: gapiDotClientDotSqladminLib.Anon_AltDatabase): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: gapiDotClientDotSqladminLib.Anon_AltDatabase): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltDatabase, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltDatabase, 
      gapiDotClientLib.gapiNs.clientNs.Request[Database]
    ],
    insert: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DatabasesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltDatabase, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    update: js.Function1[
      gapiDotClientDotSqladminLib.Anon_AltDatabase, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[DatabasesResource]
  }
}

