package typings
package gapiDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CssResponsebytes extends js.Object {
  /**
    * Number of uncompressed response bytes for CSS resources on the page.
    */
  var cssResponsebytes: java.lang.String
  /**
    * Number of response bytes for Flash resources on the page.
    */
  var flashResponseBytes: java.lang.String
  /**
    * Number of uncompressed response bytes for the main HTML document and all iframes on the page.
    */
  var htmlResponseBytes: java.lang.String
  /**
    * Number of response bytes for image resources on the page.
    */
  var imageResponseBytes: java.lang.String
  /**
    * Number of uncompressed response bytes for JS resources on the page.
    */
  var javascriptResponsebytes: java.lang.String
  /**
    * Number of CSS resources referenced by the page.
    */
  var numberCssResources: scala.Double
  /**
    * Number of unique hosts referenced by the page.
    */
  var numberHosts: scala.Double
  /**
    * Number of JavaScript resources referenced by the page.
    */
  var numberJsResources: scala.Double
  /**
    * Number of HTTP resources loaded by the page.
    */
  var numberResources: scala.Double
  /**
    * Number of static (that is, cacheable) resources on the page.
    */
  var numberStaticResources: scala.Double
  /**
    * Number of response bytes for other resources on the page.
    */
  var otherResponsebytes: java.lang.String
  /**
    * Number of uncompressed response bytes for text resources on the page that aren't covered by other statistics; that is, non-HTML, non-script, non-CSS resources.
    */
  var textResponseBytes: java.lang.String
  /**
    * Total size of all request bytes sent by the page.
    */
  var totalRequestBytes: java.lang.String
}

object Anon_CssResponsebytes {
  @scala.inline
  def apply(
    cssResponsebytes: java.lang.String,
    flashResponseBytes: java.lang.String,
    htmlResponseBytes: java.lang.String,
    imageResponseBytes: java.lang.String,
    javascriptResponsebytes: java.lang.String,
    numberCssResources: scala.Double,
    numberHosts: scala.Double,
    numberJsResources: scala.Double,
    numberResources: scala.Double,
    numberStaticResources: scala.Double,
    otherResponsebytes: java.lang.String,
    textResponseBytes: java.lang.String,
    totalRequestBytes: java.lang.String
  ): Anon_CssResponsebytes = {
    val __obj = js.Dynamic.literal(cssResponsebytes = cssResponsebytes, flashResponseBytes = flashResponseBytes, htmlResponseBytes = htmlResponseBytes, imageResponseBytes = imageResponseBytes, javascriptResponsebytes = javascriptResponsebytes, numberCssResources = numberCssResources, numberHosts = numberHosts, numberJsResources = numberJsResources, numberResources = numberResources, numberStaticResources = numberStaticResources, otherResponsebytes = otherResponsebytes, textResponseBytes = textResponseBytes, totalRequestBytes = totalRequestBytes)
  
    __obj.asInstanceOf[Anon_CssResponsebytes]
  }
}

