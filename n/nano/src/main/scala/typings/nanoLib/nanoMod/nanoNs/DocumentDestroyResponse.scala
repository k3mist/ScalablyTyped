package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/document/common.html#delete--db-docid
trait DocumentDestroyResponse extends js.Object {
  // Document ID
  var id: java.lang.String
  // Operation status
  var ok: scala.Boolean
  // Revision MVCC token
  var rev: java.lang.String
}

object DocumentDestroyResponse {
  @scala.inline
  def apply(id: java.lang.String, ok: scala.Boolean, rev: java.lang.String): DocumentDestroyResponse = {
    val __obj = js.Dynamic.literal(id = id, ok = ok, rev = rev)
  
    __obj.asInstanceOf[DocumentDestroyResponse]
  }
}

