package typings
package firefoxDashWebextDashBrowserLib.browserNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A set of data types. Missing data types are interpreted as `false`. */
trait DataTypeSet extends js.Object {
  /**
    * The browser's cache. Note: when removing data, this clears the _entire_ cache: it is not limited to the
    * range you specify.
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's cookies. */
  var cookies: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's download list. */
  var downloads: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's stored form data. */
  var formData: js.UndefOr[scala.Boolean] = js.undefined
  /** The browser's history. */
  var history: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** Stored passwords. */
  var passwords: js.UndefOr[scala.Boolean] = js.undefined
  /** Plugins' data. */
  var pluginData: js.UndefOr[scala.Boolean] = js.undefined
  /** Server-bound certificates. */
  var serverBoundCertificates: js.UndefOr[scala.Boolean] = js.undefined
  /** Service Workers. */
  var serviceWorkers: js.UndefOr[scala.Boolean] = js.undefined
}

object DataTypeSet {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    cookies: js.UndefOr[scala.Boolean] = js.undefined,
    downloads: js.UndefOr[scala.Boolean] = js.undefined,
    formData: js.UndefOr[scala.Boolean] = js.undefined,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    indexedDB: js.UndefOr[scala.Boolean] = js.undefined,
    localStorage: js.UndefOr[scala.Boolean] = js.undefined,
    passwords: js.UndefOr[scala.Boolean] = js.undefined,
    pluginData: js.UndefOr[scala.Boolean] = js.undefined,
    serverBoundCertificates: js.UndefOr[scala.Boolean] = js.undefined,
    serviceWorkers: js.UndefOr[scala.Boolean] = js.undefined
  ): DataTypeSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies)
    if (!js.isUndefined(downloads)) __obj.updateDynamic("downloads")(downloads)
    if (!js.isUndefined(formData)) __obj.updateDynamic("formData")(formData)
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (!js.isUndefined(indexedDB)) __obj.updateDynamic("indexedDB")(indexedDB)
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage)
    if (!js.isUndefined(passwords)) __obj.updateDynamic("passwords")(passwords)
    if (!js.isUndefined(pluginData)) __obj.updateDynamic("pluginData")(pluginData)
    if (!js.isUndefined(serverBoundCertificates)) __obj.updateDynamic("serverBoundCertificates")(serverBoundCertificates)
    if (!js.isUndefined(serviceWorkers)) __obj.updateDynamic("serviceWorkers")(serviceWorkers)
    __obj.asInstanceOf[DataTypeSet]
  }
}

