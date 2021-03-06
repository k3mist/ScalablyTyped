package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XMap} with enumeration capabilities.
  *
  * No assumption should be made about the ordering of the elements returned by the various enumerators. In particular, you cannot assume the elements are
  * returned in the same order as they were inserted. Also, you should not expect the `XMap` implementation to make use of a possibly existing strict
  * ordering defined on the domain of all possible key values.
  *
  * You can create enumerators for the keys of the map, its values, and its key-value pairs.
  *
  * In all cases, you can create an **isolated** enumerator, which works on a copy of the map's content. Such an iterator is not affected by changes done
  * to the map after creation of the enumerator.
  *
  * On the contrary, an enumerator which is **non-isolated** works directly on the map data. This is less expensive than an **isolated** enumerator, but
  * means that changes to the map while an enumeration is running potentially invalidate your enumerator. The concrete behavior in this case is undefined,
  * it's up to the service implementing the `XEnumerableMap` interface to specify it in more detail.
  *
  * Implementations of this interface might decide to support only **isolated** enumerators, or only **non-isolated** enumerators. Again, it's up to the
  * service to specify this. Requesting an enumerator type which is not supported will generally result in an {@link com.sun.star.lang.NoSupportException}
  * being thrown.
  */
trait XEnumerableMap extends XMap {
  /**
    * creates a enumerator for the key-value pairs of the map
    *
    * The elements returned by the enumerator are instances of com::sun::star::beans::Pair, holding the key-value-pairs which are part of the map.
    * @param Isolated controls whether the newly create enumerator should be isolated from the map.
    * @throws com::sun::star::lang::NoSupportException if the specified enumerator method is not supported by the implementation.
    */
  def createElementEnumeration(Isolated: scala.Boolean): XEnumeration
  /**
    * creates a enumerator for the keys of the map
    * @param Isolated controls whether the newly create enumerator should be isolated from the map.
    * @throws com::sun::star::lang::NoSupportException if the specified enumerator method is not supported by the implementation.
    */
  def createKeyEnumeration(Isolated: scala.Boolean): XEnumeration
  /**
    * creates a enumerator for the values of the map
    * @param Isolated controls whether the newly create enumerator should be isolated from the map.
    * @throws com::sun::star::lang::NoSupportException if the specified enumerator method is not supported by the implementation.
    */
  def createValueEnumeration(Isolated: scala.Boolean): XEnumeration
}

object XEnumerableMap {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    KeyType: activexDashLibreofficeLib.`type`,
    ValueType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    clear: () => scala.Unit,
    containsKey: js.Any => scala.Boolean,
    containsValue: js.Any => scala.Boolean,
    createElementEnumeration: scala.Boolean => XEnumeration,
    createKeyEnumeration: scala.Boolean => XEnumeration,
    createValueEnumeration: scala.Boolean => XEnumeration,
    get: js.Any => js.Any,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    put: (js.Any, js.Any) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: js.Any => js.Any
  ): XEnumerableMap = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, KeyType = KeyType, ValueType = ValueType, acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), containsKey = js.Any.fromFunction1(containsKey), containsValue = js.Any.fromFunction1(containsValue), createElementEnumeration = js.Any.fromFunction1(createElementEnumeration), createKeyEnumeration = js.Any.fromFunction1(createKeyEnumeration), createValueEnumeration = js.Any.fromFunction1(createValueEnumeration), get = js.Any.fromFunction1(get), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), put = js.Any.fromFunction2(put), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XEnumerableMap]
  }
}

