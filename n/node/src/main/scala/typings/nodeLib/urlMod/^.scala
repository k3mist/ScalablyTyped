package typings
package nodeLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def domainToASCII(domain: java.lang.String): java.lang.String = js.native
  def domainToUnicode(domain: java.lang.String): java.lang.String = js.native
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  def fileURLToPath(url: java.lang.String): java.lang.String = js.native
  def fileURLToPath(url: URL): java.lang.String = js.native
  def format(URL: nodeLib.urlMod.URL): java.lang.String = js.native
  def format(URL: nodeLib.urlMod.URL, options: URLFormatOptions): java.lang.String = js.native
  def format(urlObject: java.lang.String): java.lang.String = js.native
  def format(urlObject: UrlObject): java.lang.String = js.native
  def parse(urlStr: java.lang.String): UrlWithStringQuery = js.native
  def parse(
    urlStr: java.lang.String,
    parseQueryString: js.UndefOr[scala.Nothing],
    slashesDenoteHost: scala.Boolean
  ): UrlWithStringQuery = js.native
  def parse(urlStr: java.lang.String, parseQueryString: nodeLib.nodeLibNumbers.`false`): UrlWithStringQuery = js.native
  def parse(
    urlStr: java.lang.String,
    parseQueryString: nodeLib.nodeLibNumbers.`false`,
    slashesDenoteHost: scala.Boolean
  ): UrlWithStringQuery = js.native
  def parse(urlStr: java.lang.String, parseQueryString: nodeLib.nodeLibNumbers.`true`): UrlWithParsedQuery = js.native
  def parse(
    urlStr: java.lang.String,
    parseQueryString: nodeLib.nodeLibNumbers.`true`,
    slashesDenoteHost: scala.Boolean
  ): UrlWithParsedQuery = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean): Url = js.native
  def parse(urlStr: java.lang.String, parseQueryString: scala.Boolean, slashesDenoteHost: scala.Boolean): Url = js.native
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  def pathToFileURL(url: java.lang.String): URL = js.native
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
}

