package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an associative collection, also known as a map or a dictionary. */
trait IMap[K, V]
  extends IIterable[IKeyValuePair[js.Any, js.Any]] {
  /** Gets the number of items in the map. */
  var size: scala.Double
  /** Removes all items from the map. */
  def clear(): scala.Unit
  /**
    * Returns an immutable view of the map.
    * @return The view of the map.
    */
  def getView(): IMapView[K, V]
  /**
    * Determines whether the map contains the specified key.
    * @param key The key associated with the item to locate.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: K): scala.Boolean
  /**
    * Inserts or replaces an item in the map.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return True if an item with the specified key is an existing item that was replaced; otherwise, false.
    */
  def insert(key: K, value: V): scala.Boolean
  /**
    * Returns the item at the specified key in the map.
    * @param key The key associated with the item to locate.
    * @return The item associated with the specified key.
    */
  def lookup(key: K): V
  /**
    * Removes an item from the map.
    * @param key The key associated with the item to remove.
    */
  def remove(key: K): scala.Unit
}

object IMap {
  @scala.inline
  def apply[K, V](
    clear: js.Function0[scala.Unit],
    first: js.Function0[IIterator[IKeyValuePair[js.Any, js.Any]]],
    getView: js.Function0[IMapView[K, V]],
    hasKey: js.Function1[K, scala.Boolean],
    insert: js.Function2[K, V, scala.Boolean],
    lookup: js.Function1[K, V],
    remove: js.Function1[K, scala.Unit],
    size: scala.Double
  ): IMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = clear, first = first, getView = getView, hasKey = hasKey, insert = insert, lookup = lookup, remove = remove, size = size)
  
    __obj.asInstanceOf[IMap[K, V]]
  }
}

