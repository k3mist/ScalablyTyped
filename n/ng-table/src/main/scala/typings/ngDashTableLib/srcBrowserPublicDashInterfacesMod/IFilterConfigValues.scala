package typings
package ngDashTableLib.srcBrowserPublicDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterConfigValues extends js.Object {
  /**
    * A map of alias names and their corrosponding urls. A lookup against this map will be used
    * to find the url matching an alias name.
    * If no match is found then a url will be derived using the following pattern `${defaultBaseUrl}${aliasName}.${defaultExt}`
    */
  var aliasUrls: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The default base url to use when deriving the url for a filter template given just an alias name
    * Defaults to 'ng-table/filters/'
    */
  var defaultBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The extension to use when deriving the url of a filter template when given just an alias name
    */
  var defaultExt: js.UndefOr[java.lang.String] = js.undefined
}

object IFilterConfigValues {
  @scala.inline
  def apply(
    aliasUrls: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    defaultBaseUrl: java.lang.String = null,
    defaultExt: java.lang.String = null
  ): IFilterConfigValues = {
    val __obj = js.Dynamic.literal()
    if (aliasUrls != null) __obj.updateDynamic("aliasUrls")(aliasUrls)
    if (defaultBaseUrl != null) __obj.updateDynamic("defaultBaseUrl")(defaultBaseUrl)
    if (defaultExt != null) __obj.updateDynamic("defaultExt")(defaultExt)
    __obj.asInstanceOf[IFilterConfigValues]
  }
}

