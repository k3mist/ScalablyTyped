package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#post--db
// http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
trait DocumentInsertResponse extends js.Object {
  // Document ID
  var id: java.lang.String
  // Operation status
  var ok: scala.Boolean
  // Revision MVCC token
  var rev: java.lang.String
}

object DocumentInsertResponse {
  @scala.inline
  def apply(id: java.lang.String, ok: scala.Boolean, rev: java.lang.String): DocumentInsertResponse = {
    val __obj = js.Dynamic.literal(id = id, ok = ok, rev = rev)
  
    __obj.asInstanceOf[DocumentInsertResponse]
  }
}

