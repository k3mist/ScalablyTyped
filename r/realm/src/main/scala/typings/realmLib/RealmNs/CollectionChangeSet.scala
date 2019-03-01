package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChangeSet extends js.Object {
  var deletions: js.Array[scala.Double]
  var insertions: js.Array[scala.Double]
  var modifications: js.Array[scala.Double]
  var newModifications: js.Array[scala.Double]
  var oldModifications: js.Array[scala.Double]
}

object CollectionChangeSet {
  @scala.inline
  def apply(
    deletions: js.Array[scala.Double],
    insertions: js.Array[scala.Double],
    modifications: js.Array[scala.Double],
    newModifications: js.Array[scala.Double],
    oldModifications: js.Array[scala.Double]
  ): CollectionChangeSet = {
    val __obj = js.Dynamic.literal(deletions = deletions, insertions = insertions, modifications = modifications, newModifications = newModifications, oldModifications = oldModifications)
  
    __obj.asInstanceOf[CollectionChangeSet]
  }
}

