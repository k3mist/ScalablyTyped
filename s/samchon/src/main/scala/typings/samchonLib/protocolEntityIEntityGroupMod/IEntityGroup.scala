package typings
package samchonLib.protocolEntityIEntityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityGroup[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */, SourceT /* <: tstlLib.tstlMod.baseNs.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.tstlMod.baseNs.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */]
  extends tstlLib.tstlMod.baseNs.Container[T, SourceT, IteratorT, ReverseT, T]
     with samchonLib.protocolEntityIEntityMod.IEntity {
  /**
    * A tag name of children objects.
    */
  def CHILD_TAG(): java.lang.String = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* InferMemberOverrides */
  override def begin(): tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
  /**
    * Count elements with a specific key.
    *
    * Searches the container for elements whose key is *key* and returns the number of elements found.
    *
    * @param key Key value to be searched for.
    *
    * @return The number of elements in the container with a *key*.
    */
  def count(key: js.Any): scala.Double = js.native
  /**
    * Factory method of a child Entity.
    *
    * EntityArray::createChild() is a factory method creating a new child Entity which is belonged
    * to the EntityArray. This method is called by EntityArray::construct(). The children construction
    * methods Entity::construct() will be called by abstract method of the EntityArray::construct().
    *
    * @return A new child Entity belongs to EntityArray.
    */
  def createChild(xml: sxmlLib.sxmlMod.XML): T = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def empty(): scala.Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* InferMemberOverrides */
  override def end(): tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] = js.native
  /**
    * Get an element
    *
    * Returns a reference to the mapped value of the element identified with *key*.
    *
    * @param key Key value of the element whose mapped value is accessed.
    *
    * @throw exception out of range
    *
    * @return A reference object of the mapped value (_Ty)
    */
  def get(key: js.Any): T = js.native
  /**
    * Get iterator to element.
    *
    * Searches the container for an element with a identifier equivalent to *key* and returns an
    * iterator to it if found, otherwise it returns an iterator to {@link end end()}.
    *
    * Two keys are considered equivalent if the container's comparison object returns false reflexively
    * (i.e., no matter the order in which the elements are passed as arguments).
    *
    * Another member functions, {@link has has()} and {@link count count()}, can be used to just check
    * whether a particular *key* exists.
    *
    * @param key Key to be searched for
    * @return An iterator to the element, if an element with specified *key* is found, or
    *		   {@link end end()} otherwise.
    */
  /**
    * Whether have the item or not.
    *
    * Indicates whether a map has an item having the specified identifier.
    *
    * @param key Key value of the element whose mapped value is accessed.
    *
    * @return Whether the map has an item having the specified identifier.
    */
  def has(key: js.Any): scala.Boolean = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* InferMemberOverrides */
  override def push(items: T*): scala.Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def rbegin(): ReverseT = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def rend(): ReverseT = js.native
  /**
    * Number of elements in the container.
    */
  /* InferMemberOverrides */
  override def size(): scala.Double = js.native
}

