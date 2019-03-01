package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This includes multiple functions to manipulate the cookies.
  */
trait Cookies extends js.Object {
  /**
    * Fired when a cookie is set or removed.
    */
  var onChanged: nwDotJsLib.Anon_AddListener
  /**
    * Retrieves information about a single cookie.
    *
    * @param details {Objet} Details to identify the cookie being retrieved.
    * @param callback {function(cookie?)} The callback when cookie retrieved.
    * - (Optional) cookie {Cookie} Contains details about the cookie. This parameter is null if no such cookie was found.
    */
  def get(details: CookiesGetDetails, callback: js.Function1[/* cookie */ js.UndefOr[Cookie], scala.Unit]): scala.Unit
  /**
    * Retrieves all cookies from a single cookie store that match the given information.
    *
    * @param details {Objet} Information to filter the cookies being retrieved.
    * @param callback {function(cookies?)} The callback when cookies retrieved.
    * - (Optional) cookies {Cookie[]} All the existing, unexpired cookies that match the given cookie info.
    */
  def getAll(
    details: CookiesGetAllDetails,
    callback: js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], scala.Unit]
  ): scala.Unit
  /**
    * Deletes a cookie by name.
    *
    * @param details {Objet} Information to identify the cookie to remove.
    * @param callback {function(cookie?)} The callback when cookie has been set.
    * - (Optional) details {Objet} Contains details about the cookie that's been removed. If removal failed for any reason, this will be "null", and "chrome.runtime.lastError" will be set.
    */
  def remove(
    details: CookiesRemoveDetails,
    callback: js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], scala.Unit]
  ): scala.Unit
  /**
    * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
    *
    * @param details {Objet} Details about the cookie being set.
    * @param callback {function(cookie?)} The callback when cookie has been set.
    * - (Optional) cookie {Cookie} Contains details about the cookie that's been set. If setting failed for any reason, this will be "null", and "chrome.runtime.lastError" will be set.
    */
  def set(details: CookiesSetDetails, callback: js.Function1[/* cookie */ js.UndefOr[Cookie], scala.Unit]): scala.Unit
}

object Cookies {
  @scala.inline
  def apply(
    get: js.Function2[
      CookiesGetDetails, 
      js.Function1[/* cookie */ js.UndefOr[Cookie], scala.Unit], 
      scala.Unit
    ],
    getAll: js.Function2[
      CookiesGetAllDetails, 
      js.Function1[/* cookies */ js.UndefOr[js.Array[Cookie]], scala.Unit], 
      scala.Unit
    ],
    onChanged: nwDotJsLib.Anon_AddListener,
    remove: js.Function2[
      CookiesRemoveDetails, 
      js.Function1[/* details */ js.UndefOr[CookiesRemovedDetails], scala.Unit], 
      scala.Unit
    ],
    set: js.Function2[
      CookiesSetDetails, 
      js.Function1[/* cookie */ js.UndefOr[Cookie], scala.Unit], 
      scala.Unit
    ]
  ): Cookies = {
    val __obj = js.Dynamic.literal(get = get, getAll = getAll, onChanged = onChanged, remove = remove, set = set)
  
    __obj.asInstanceOf[Cookies]
  }
}

