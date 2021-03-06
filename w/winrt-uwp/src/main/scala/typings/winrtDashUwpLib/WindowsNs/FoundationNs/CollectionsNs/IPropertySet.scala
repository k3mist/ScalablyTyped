package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of key-value pairs, correlating several other collection interfaces. */
trait IPropertySet
  extends IObservableMap[java.lang.String, js.Any]

object IPropertySet {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    getView: () => IMapView[java.lang.String, js.Any],
    hasKey: java.lang.String => scala.Boolean,
    insert: (java.lang.String, js.Any) => scala.Boolean,
    lookup: java.lang.String => js.Any,
    remove: java.lang.String => scala.Unit,
    size: scala.Double
  ): IPropertySet = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size)
  
    __obj.asInstanceOf[IPropertySet]
  }
}

