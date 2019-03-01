package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueId extends js.Object {
  /** The user-defined unique identifier for a document or other DocumentDB object (database, collection, procedure...) */
  var id: java.lang.String
}

object UniqueId {
  @scala.inline
  def apply(id: java.lang.String): UniqueId = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[UniqueId]
  }
}

