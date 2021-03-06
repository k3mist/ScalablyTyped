package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link RemoteAccessContentProvider} is a {@link ContentProvider} that provides access to contents available at other (remote) UCBs. */
trait RemoteAccessContentProvider extends ContentProvider

object RemoteAccessContentProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => scala.Double,
    createContentIdentifier: java.lang.String => XContentIdentifier,
    deregisterInstance: (java.lang.String, java.lang.String) => XContentProvider,
    queryContent: XContentIdentifier => XContent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerInstance: (java.lang.String, java.lang.String, scala.Boolean) => XContentProvider,
    release: () => scala.Unit
  ): RemoteAccessContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareContentIds = js.Any.fromFunction2(compareContentIds), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[RemoteAccessContentProvider]
  }
}

