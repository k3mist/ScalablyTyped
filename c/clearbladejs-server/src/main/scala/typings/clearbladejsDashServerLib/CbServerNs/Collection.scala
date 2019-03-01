package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def addColumn(options: js.Object, callback: CbCallback): scala.Unit
  def columns(callback: CbCallback): scala.Unit
  def count(query: Query, callback: CbCallback): scala.Unit
  def create(newItem: Item, callback: CbCallback): scala.Unit
  def deleteCollection(callback: CbCallback): scala.Unit
  def dropColumn(name: java.lang.String, callback: CbCallback): scala.Unit
  def fetch(query: Query, callback: CbCallback): scala.Unit
  def remove(query: Query, callback: CbCallback): scala.Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): scala.Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: java.lang.String,
    addColumn: js.Function2[js.Object, CbCallback, scala.Unit],
    columns: js.Function1[CbCallback, scala.Unit],
    count: js.Function2[Query, CbCallback, scala.Unit],
    create: js.Function2[Item, CbCallback, scala.Unit],
    deleteCollection: js.Function1[CbCallback, scala.Unit],
    dropColumn: js.Function2[java.lang.String, CbCallback, scala.Unit],
    fetch: js.Function2[Query, CbCallback, scala.Unit],
    remove: js.Function2[Query, CbCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    update: js.Function3[Query, js.Object, CbCallback, scala.Unit],
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI, addColumn = addColumn, columns = columns, count = count, create = create, deleteCollection = deleteCollection, dropColumn = dropColumn, fetch = fetch, remove = remove, systemKey = systemKey, systemSecret = systemSecret, update = update, user = user)
  
    __obj.asInstanceOf[Collection]
  }
}

