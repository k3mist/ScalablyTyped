package typings
package tstlLib.baseContainerUniqueMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueMap", "UniqueMap")
@js.native
abstract class UniqueMap[Key, T, Source /* <: UniqueMap[Key, T, Source] */] ()
  extends tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, tstlLib.tstlLibNumbers.`true`, Source] {
  /**
    * @hidden
    */
  var _Extract_by_iterator: js.Any = js.native
  /**
    * @hidden
    */
  var _Extract_by_key: js.Any = js.native
  /**
    * @hidden
    */
  var _Insert_or_assign_with_hint: js.Any = js.native
  /**
    * @hidden
    */
  var _Insert_or_assign_with_key_value: js.Any = js.native
  /**
    * Extract an element by key.
    *
    * @param key Key to search for.
    * @return The extracted element.
    */
  def extract(key: Key): tstlLib.utilityEntryMod.Entry[Key, T] = js.native
  /**
    * Extract an element by iterator.
    *
    * @param pos The iterator to the element for extraction.
    * @return Iterator following the *pos*, strained by the extraction.
    */
  def extract(pos: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`true`, Source]): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`true`, Source] = js.native
  /**
    * Get a value.
    *
    * @param key Key to search for.
    * @return The value mapped by the key.
    */
  def get(key: Key): T = js.native
  /**
    * Insert or assign an element with hint.
    *
    * @param hint Hint for the position where the element can be inserted.
    * @param key Key to be mapped or search for.
    * @param value Value to insert or assign.
    * @return {@link Pair} of an iterator to the newly inserted element and `true`, if the specified *key* doesn't exist, otherwise {@link Pair} of iterator to the ordinary element and `false`.
    */
  def insert_or_assign(
    hint: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`true`, Source],
    key: Key,
    value: T
  ): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`true`, Source] = js.native
  /**
    * Insert or assign an element.
    *
    * @param key Key to be mapped or search for.
    * @param value Value to insert or assign.
    * @return {@link Pair} of an iterator to the newly inserted element and `true`, if the specified *key* doesn't exist, otherwise {@link Pair} of iterator to the ordinary element and `false`.
    */
  def insert_or_assign(key: Key, value: T): tstlLib.utilityPairMod.Pair[
    tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, tstlLib.tstlLibNumbers.`true`, Source], 
    scala.Boolean
  ] = js.native
  /**
    * Set a value with key.
    *
    * @param key Key to be mapped or search for.
    * @param val Value to insert or assign.
    */
  def set(key: Key, `val`: T): scala.Unit = js.native
}

