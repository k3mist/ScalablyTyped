package typings
package jsdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  /**
    * contentType affects the value read from document.contentType, and how the document is parsed: as HTML or as XML.
    * Values that are not "text/html" or an XML mime type will throw. It will default to "application/xhtml+xml" if
    * the given filename ends in .xhtml or .xml; otherwise it will continue to default to "text/html".
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * url sets the value returned by window.location, document.URL, and document.documentURI,
    * and affects things like resolution of relative URLs within the document
    * and the same-origin restrictions and referrer used while fetching subresources.
    * It will default to a file URL corresponding to the given filename, instead of to "about:blank".
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContentType {
  @scala.inline
  def apply(contentType: java.lang.String = null, url: java.lang.String = null): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

