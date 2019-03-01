package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one creative field value by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Inserts a new creative field value. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFieldsIds): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValuesListResponse]
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
  /** Updates an existing creative field value. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields): gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
    ],
    insert: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFieldsIds, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValuesListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldId, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltCreativeFieldIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[CreativeFieldValue]
    ]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
}

