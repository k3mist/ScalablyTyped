package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** Promise which resolves to a buffer with response body. */
  def buffer(): js.Promise[nodeLib.Buffer]
  /** A Frame that initiated this response, or null if navigating to error pages. */
  def frame(): Frame | scala.Null
  /** True if the response was served from either the browser's disk cache or memory cache. */
  def fromCache(): scala.Boolean
  /** True if the response was served by a service worker. */
  def fromServiceWorker(): scala.Boolean
  /** An object with HTTP headers associated with the response. All header names are lower-case. */
  def headers(): Headers
  /**
    * Promise which resolves to a JSON representation of response body.
    * @throws This method will throw if the response body is not parsable via `JSON.parse`.
    */
  def json(): js.Promise[_]
  /** Contains a boolean stating whether the response was successful (status in the range 200-299) or not. */
  def ok(): scala.Boolean
  /** Returns remote connection info */
  def remoteAddress(): RemoteInfo
  /** A matching Request object. */
  def request(): Request
  /** Contains the status code of the response (e.g., 200 for a success). */
  def status(): scala.Double
  /** Contains the status text of the response (e.g. usually an "OK" for a success).  */
  def statusText(): java.lang.String
  /** Promise which resolves to a text representation of response body. */
  def text(): js.Promise[java.lang.String]
  /** Contains the URL of the response. */
  def url(): java.lang.String
}

object Response {
  @scala.inline
  def apply(
    buffer: js.Function0[js.Promise[nodeLib.Buffer]],
    frame: js.Function0[Frame | scala.Null],
    fromCache: js.Function0[scala.Boolean],
    fromServiceWorker: js.Function0[scala.Boolean],
    headers: js.Function0[Headers],
    json: js.Function0[js.Promise[_]],
    ok: js.Function0[scala.Boolean],
    remoteAddress: js.Function0[RemoteInfo],
    request: js.Function0[Request],
    status: js.Function0[scala.Double],
    statusText: js.Function0[java.lang.String],
    text: js.Function0[js.Promise[java.lang.String]],
    url: js.Function0[java.lang.String]
  ): Response = {
    val __obj = js.Dynamic.literal(buffer = buffer, frame = frame, fromCache = fromCache, fromServiceWorker = fromServiceWorker, headers = headers, json = json, ok = ok, remoteAddress = remoteAddress, request = request, status = status, statusText = statusText, text = text, url = url)
  
    __obj.asInstanceOf[Response]
  }
}

