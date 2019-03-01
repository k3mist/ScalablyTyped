package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure for content provider information.
  * @see XContentProviderManager
  */
trait ContentProviderInfo extends js.Object {
  /** The content provider. */
  var ContentProvider: XContentProvider
  /** The scheme the Provider is registered for. */
  var Scheme: java.lang.String
}

object ContentProviderInfo {
  @scala.inline
  def apply(ContentProvider: XContentProvider, Scheme: java.lang.String): ContentProviderInfo = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider, Scheme = Scheme)
  
    __obj.asInstanceOf[ContentProviderInfo]
  }
}

