package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MainPageSuffix extends js.Object {
  /**
    * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting
    * object. This allows the creation of index.html objects to represent directory pages.
    */
  var mainPageSuffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this
    * bucket as the content for a 404 Not Found result.
    */
  var notFoundPage: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MainPageSuffix {
  @scala.inline
  def apply(mainPageSuffix: java.lang.String = null, notFoundPage: java.lang.String = null): Anon_MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    if (mainPageSuffix != null) __obj.updateDynamic("mainPageSuffix")(mainPageSuffix)
    if (notFoundPage != null) __obj.updateDynamic("notFoundPage")(notFoundPage)
    __obj.asInstanceOf[Anon_MainPageSuffix]
  }
}

